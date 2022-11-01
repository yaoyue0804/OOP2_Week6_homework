import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import java.io.*;

class MyJFrame4 extends JFrame{
    private JPanel contentPane;
    private int pressed=0;
    MyJFrame4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("圖片展示");
        setBounds(350, 150, 500, 500);
        
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());

        JLabel lab1=new JLabel("圖片1");
        contentPane.add(lab1);

        JLabel lab2=new JLabel();
        ImageIcon pic1=new ImageIcon("..\\kohanenewyear.png");
        ImageIcon pic2=new ImageIcon("..\\FB_IMG_1653373769894.jpg");
        ImageIcon pic3=new ImageIcon("..\\FB_IMG_1666341322265.jpg");
        ImageIcon pic4=new ImageIcon("..\\FB_IMG_1666341327810.jpg");
        ImageIcon pic5=new ImageIcon("..\\lofter_1631651692894.jpg");
        lab2.setIcon(pic1);
        contentPane.add(lab2);
        
        JButton btn1 =new JButton("上一張");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(pressed==0){
                    JOptionPane.showMessageDialog(null, "沒有圖了","error",JOptionPane.WARNING_MESSAGE);
                }else{
                    pressed--;
                    switch(pressed){
                        case 0:
                            lab1.setText("圖片1");
                            lab2.setIcon(pic1);
                            break;
                        case 1:
                            lab1.setText("圖片2");
                            lab2.setIcon(pic2);
                            break;
                        case 2:
                            lab1.setText("圖片3");
                            lab2.setIcon(pic3);
                            break;
                        case 3:
                            lab1.setText("圖片4");
                            lab2.setIcon(pic4);
                            break;
                        case 4:
                            lab1.setText("圖片5");
                            lab2.setIcon(pic5);
                            break;
                    }
                }
            }
        });
        contentPane.add(btn1);
        
        JButton btn2 =new JButton("下一張");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(pressed==4){
                    JOptionPane.showMessageDialog(null, "沒有圖了","error",JOptionPane.WARNING_MESSAGE);
                }else{
                    pressed++;
                    switch(pressed){
                        case 0:
                            lab1.setText("圖片1");
                            lab2.setIcon(pic1);
                            break;
                        case 1:
                            lab1.setText("圖片2");
                            lab2.setIcon(pic2);
                            break;
                        case 2:
                            lab1.setText("圖片3");
                            lab2.setIcon(pic3);
                            break;
                        case 3:
                            lab1.setText("圖片4");
                            lab2.setIcon(pic4);
                            break;
                        case 4:
                            lab1.setText("圖片5");
                            lab2.setIcon(pic5);
                            break;
                    }
                }
            }
        });
        contentPane.add(btn2);
        
        setVisible(true);
    }
}
public class Week6_Homework {
    public static void main (String[] args)throws Exception{
        MyJFrame4 f2= new MyJFrame4();
    }
}

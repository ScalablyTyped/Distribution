package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * context只是一个记录方法调用的容器，用于生成记录绘制行为的actions数组。context跟<canvas/>不存在对应关系，一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  */
@js.native
trait CanvasContext extends js.Object {
  /**
    * 添加一个弧形路径到当前路径，顺时针绘制。
    *
    * @param {number} x 矩形路径左上角的x坐标
    * @param {number} y 矩形路径左上角的y坐标
    * @param {number} radius 矩形路径左上角的y坐标
    * @param {number} startAngle 起始弧度
    * @param {number} endAngle 结束弧度
    * @param {boolean} sweepAngle 从起始弧度开始，扫过的弧度
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, sweepAngle: Boolean): Unit = js.native
  /**
    * 开始一个路径
    * 开始创建一个路径，需要调用fill或者stroke才会使用路径进行填充或描边。
    * 同一个路径内的多次setFillStyle、setStrokeStyle、setLineWidth等设置，
    * 以最后一次设置为准。
    */
  def beginPath(): Unit = js.native
  /**
    * 创建三次方贝塞尔曲线
    *
    * @param {number} cp1x 第一个贝塞尔控制点的 x 坐标
    * @param {number} cp1y 第一个贝塞尔控制点的 y 坐标
    * @param {number} cp2x 第二个贝塞尔控制点的 x 坐标
    * @param {number} cp2y 第二个贝塞尔控制点的 y 坐标
    * @param {number} x 结束点的x坐标
    * @param {number} y 结束点的y坐标
    */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  /** 清空当前的存储绘图动作 */
  def clearActions(): Unit = js.native
  /**
    * 在给定的矩形区域内，清除画布上的像素
    * 清除画布上在该矩形区域内的内容。
    *
    * @param {number} x 矩形区域左上角的x坐标
    * @param {number} y 矩形区域左上角的y坐标
    * @param {number} width 矩形区域的宽度
    * @param {number} height 矩形区域的高度
    */
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 关闭一个路径
    */
  def closePath(): Unit = js.native
  /**
    * 在画布上绘制图像
    * 绘制图像，图像保持原始尺寸。
    *
    * @param {string} imageResource 所要绘制的图片资源。 通过chooseImage得到一个文件路径或者一个项目目录内的图片
    * @param {number} x 图像左上角的x坐标
    * @param {number} y 图像左上角的y坐标
    */
  def drawImage(imageResource: String, x: Double, y: Double): Unit = js.native
  /**
    * 对当前路径进行填充
    */
  def fill(): Unit = js.native
  /**
    * 在画布上绘制被填充的文本
    *
    * @param {string} text 在画布上输出的文本
    * @param {number} x 绘制文本的左上角x坐标位置
    * @param {number} y 绘制文本的左上角y坐标位置
    */
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  /** 获取当前context上存储的绘图动作 */
  def getActions(): js.Array[CanvasAction] = js.native
  /**
    * 在当前位置添加一个新点，然后在画布中创建从该点到最后指定点的路径。
    *
    * @param {number} x 目标位置的x坐标
    * @param {number} y 目标位置的y坐标
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  /**
    * 把路径移动到画布中的指定点，但不创建线条。
    *
    * @param {number} x 目标位置的x坐标
    * @param {number} y 目标位置的y坐标
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
    * 创建二次方贝塞尔曲线
    *
    * @param {number} cpx 贝塞尔控制点的x坐标
    * @param {number} cpy 贝塞尔控制点的y坐标
    * @param {number} x 结束点的x坐标
    * @param {number} y 结束点的y坐标
    */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  /**
    * 添加一个矩形路径到当前路径。
    *
    * @param {number} x 矩形路径左上角的x坐标
    * @param {number} y 矩形路径左上角的y坐标
    * @param {number} width 矩形路径的宽度
    * @param {number} height 矩形路径的高度
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 恢复之前保存过的坐标轴的缩放、旋转、平移信息
    */
  def restore(): Unit = js.native
  /**
    * 对坐标轴进行顺时针旋转
    * 以原点为中心，原点可以用 translate方法修改。
    * 顺时针旋转当前坐标轴。多次调用rotate，旋转的角度会叠加。
    *
    * @param {number} rotate 旋转角度，以弧度计。
    */
  def rotate(rotate: Double): Unit = js.native
  /**
    * 保存当前坐标轴的缩放、旋转、平移信息
    */
  def save(): Unit = js.native
  /**
    * 对横纵坐标进行缩放
    * 在调用scale方法后，之后创建的路径其横纵坐标会被缩放。
    * 多次调用scale，倍数会相乘。
    *
    * @param {number} scaleWidth 横坐标缩放的倍数
    * @param {number} scaleHeight 纵坐标轴缩放的倍数
    */
  def scale(scaleWidth: Double): Unit = js.native
  def scale(scaleWidth: Double, scaleHeight: Double): Unit = js.native
  /**
    * 设置填充样式
    *
    * @param {string} color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setFillStyle(color: String): Unit = js.native
  /**
    * 设置字体大小
    *
    * @param {number} fontSize 字体的字号
    */
  def setFontSize(fontSize: Double): Unit = js.native
  /**
    * 设置线条端点的样式
    *
    * @param {LineCapType} lineCap 线条的结束端点样式。 'butt'、'round'、'square'
    */
  def setLineCap(lineCap: LineCapType): Unit = js.native
  /**
    * 设置两线相交处的样式
    *  @param {LineJoinType} lineJoin 两条线相交时，所创建的拐角类型
    */
  def setLineJoin(lineJoin: LineJoinType): Unit = js.native
  /**
    * 设置线条宽度
    *
    * @param {number} lineWidth 线条的宽度
    */
  def setLineWidth(lineWidth: Double): Unit = js.native
  /** 设置最大斜接长度，斜接长度指的是在两条线交汇处内角和外角之间的距离。
    * 当 setLineJoin为 miter 时才有效。
    * 超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示
    *
    * @param {number} miterLimit 最大斜接长度
    */
  def setMiterLimit(miterLimit: Double): Unit = js.native
  /**
    * 设置阴影
    *
    * @param {number} offsetX 阴影相对于形状在水平方向的偏移
    * @param {number} offsetY 阴影相对于形状在竖直方向的偏移
    * @param {number} blur 阴影的模糊级别，数值越大越模糊 0~100
    * @param {string} color 阴影的颜色。 'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setShadow(offsetX: Double, offsetY: Double, blur: Double, color: String): Unit = js.native
  /**
    * 设置线条样式
    *
    * @param {string} color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setStrokeStyle(color: String): Unit = js.native
  /**
    * 对当前路径进行描边
    */
  def stroke(): Unit = js.native
  /**
    * 对坐标原点进行缩放
    * 对当前坐标系的原点(0, 0)进行变换，默认的坐标系原点为页面左上角。
    *
    * @param {number} x 水平坐标平移量
    * @param {number} y 竖直坐标平移量
    */
  def translate(x: Double, y: Double): Unit = js.native
}


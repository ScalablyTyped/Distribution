package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.center
import typings.weixinApp.weixinAppStrings.left
import typings.weixinApp.weixinAppStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * context只是一个记录方法调用的容器，用于生成记录绘制行为的actions数组。context跟<canvas/>不存在对应关系，一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
  */
@js.native
trait CanvasContext extends js.Object {
  /**
    * 创建一个颜色的渐变点。
    * Tip: 小于最小 stop 的部分会按最小 stop 的 color 来渲染，大于最大 stop 的部分会按最大 stop 的 color 来渲染。
    * Tip: 需要使用 addColorStop() 来指定渐变点，至少要两个。
    * @param stop (0-1)  表示渐变点在起点和终点中的位置
    * @param color 渐变点的颜色
    *
    */
  def addColorStop(stop: Double, color: String): Unit = js.native
  /**
    * 添加一个弧形路径到当前路径，顺时针绘制。
    *
    * @param x 圆的x坐标
    * @param y 圆的y坐标
    * @param radius 圆的半径
    * @param startAngle 起始弧度，单位弧度（在3点钟方向）
    * @param endAngle 终止弧度
    * @param counterclockwise 指定弧度的方向是逆时针还是顺时针。默认是false，即顺时针。
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    counterclockwise: Boolean
  ): Unit = js.native
  /**
    * 开始创建一个路径，需要调用fill或者stroke才会使用路径进行填充或描边。
    * Tip: 在最开始的时候相当于调用了一次 beginPath()。
    * Tip: 同一个路径内的多次setFillStyle、setStrokeStyle、setLineWidth等设置，
    * 以最后一次设置为准。
    */
  def beginPath(): Unit = js.native
  /**
    * 创建三次方贝塞尔曲线
    *
    * @param cp1x 第一个贝塞尔控制点的 x 坐标
    * @param cp1y 第一个贝塞尔控制点的 y 坐标
    * @param cp2x 第二个贝塞尔控制点的 x 坐标
    * @param cp2y 第二个贝塞尔控制点的 y 坐标
    * @param x 结束点的x坐标
    * @param y 结束点的y坐标
    */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  /** 清空当前的存储绘图动作(不推荐使用) */
  def clearActions(): Unit = js.native
  /**
    * 在给定的矩形区域内，清除画布上的像素
    * 清除画布上在该矩形区域内的内容。
    *
    * @param x 矩形区域左上角的x坐标
    * @param y 矩形区域左上角的y坐标
    * @param width 矩形区域的宽度
    * @param height 矩形区域的高度
    */
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 关闭一个路径
    * Tip: 关闭路径会连接起点和终点。
    * Tip: 如果关闭路径后没有调用 fill() 或者 stroke() 并开启了新的路径，那之前的路径将不会被渲染。
    */
  def closePath(): Unit = js.native
  /**
    * 创建一个圆形的渐变颜色。
    *
    * @param x 圆心的x坐标
    * @param y 圆心的y坐标
    * @param r 圆的半径
    *
    */
  def createCircularGradient(x: Double, y: Double, r: Double): Unit = js.native
  /**
    * 创建一个线性的渐变颜色。
    * Tip: 需要使用 addColorStop() 来指定渐变点，至少要两个。
    * @param x0 起点的x坐标
    * @param y0 起点的y坐标
    * @param x1 终点的x坐标
    * @param y1 终点的y坐标
    */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  /**
    * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中。
    * Tip: 绘图上下文需要由 wx.createCanvasContext(canvasId) 来创建。
    * @param [reserve] 非必填。本次绘制是否接着上一次绘制，即reserve参数为false，则在本次调用drawCanvas绘制之前native层应先清空画布再继续绘制；若reserver参数为true，则保留当前画布上的内容，本次调用drawCanvas绘制的内容覆盖在上面，默认 false
    *
    */
  def draw(): Unit = js.native
  def draw(reserve: Boolean): Unit = js.native
  /**
    * 绘制图像，图像保持原始尺寸。
    * @param imageResource 所要绘制的图片资源, 通过chooseImage得到一个文件路径或者一个项目目录内的图片
    * @param dx            源图像的矩形选择框的左上角 X 坐标
    * @param dy            源图像的矩形选择框的左上角 Y 坐标
    */
  def drawImage(imageResource: String, dx: Double, dy: Double): Unit = js.native
  /**
    * 绘制图像，图像保持原始尺寸。
    * @param imageResource 所要绘制的图片资源, 通过chooseImage得到一个文件路径或者一个项目目录内的图片
    * @param dx            源图像的矩形选择框的左上角 X 坐标
    * @param dy            源图像的矩形选择框的左上角 Y 坐标
    * @param dWidth        源图像的矩形选择框的高度
    * @param dHeight       源图像的矩形选择框的高度
    */
  def drawImage(imageResource: String, dx: Double, dy: Double, dWidth: Double, dHeight: Double): Unit = js.native
  /**
    * 绘制图像，图像保持原始尺寸。
    * @param imageResource 所要绘制的图片资源, 通过chooseImage得到一个文件路径或者一个项目目录内的图片
    * @param sx            图像的左上角在目标canvas上 X 轴的位置
    * @param sy            图像的左上角在目标canvas上 Y 轴的位置
    * @param sWidth        在目标画布上绘制图像的宽度，允许对绘制的图像进行缩放
    * @param sHeight       在目标画布上绘制图像的高度，允许对绘制的图像进行缩放
    * @param dx            源图像的矩形选择框的左上角 X 坐标
    * @param dy            源图像的矩形选择框的左上角 Y 坐标
    * @param dWidth        源图像的矩形选择框的高度
    * @param dHeight       源图像的矩形选择框的高度
    * @version 1.9.0
    */
  def drawImage(
    imageResource: String,
    sx: Double,
    sy: Double,
    sWidth: Double,
    sHeight: Double,
    dx: Double,
    dy: Double,
    dWidth: Double,
    dHeight: Double
  ): Unit = js.native
  /**
    * 对当前路径进行填充
    */
  def fill(): Unit = js.native
  /**
    * 填充一个矩形。
    * Tip: 用 setFillStyle() 设置矩形的填充色，如果没设置默认是黑色。
    * @param x 矩形路径左上角的x坐标
    * @param y 矩形路径左上角的y坐标
    * @param width 矩形路径的宽度
    * @param height 矩形路径的高度
    *
    */
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 在画布上绘制被填充的文本
    *
    * @param text 在画布上输出的文本
    * @param x 绘制文本的左上角x坐标位置
    * @param y 绘制文本的左上角y坐标位置
    */
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  /** 获取当前context上存储的绘图动作(不推荐使用) */
  def getActions(): js.Array[CanvasAction] = js.native
  /**
    * 在当前位置添加一个新点，然后在画布中创建从该点到最后指定点的路径。
    *
    * @param x 目标位置的x坐标
    * @param y 目标位置的y坐标
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  /**
    * 把路径移动到画布中的指定点，但不创建线条。
    *
    * @param x 目标位置的x坐标
    * @param y 目标位置的y坐标
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
    * 创建二次方贝塞尔曲线
    *
    * @param cpx 贝塞尔控制点的x坐标
    * @param cpy 贝塞尔控制点的y坐标
    * @param x 结束点的x坐标
    * @param y 结束点的y坐标
    */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  /**
    * 添加一个矩形路径到当前路径。
    *
    * @param x 矩形路径左上角的x坐标
    * @param y 矩形路径左上角的y坐标
    * @param width 矩形路径的宽度
    * @param height 矩形路径的高度
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 恢复之前保存的绘图上下文。
    */
  def restore(): Unit = js.native
  /**
    * 对坐标轴进行顺时针旋转
    * 以原点为中心，原点可以用 translate方法修改。
    * 顺时针旋转当前坐标轴。多次调用rotate，旋转的角度会叠加。
    *
    * @param rotate 旋转角度，以弧度计。
    */
  def rotate(rotate: Double): Unit = js.native
  /**
    * 保存当前的绘图上下文。
    */
  def save(): Unit = js.native
  /**
    * 对横纵坐标进行缩放
    * 在调用scale方法后，之后创建的路径其横纵坐标会被缩放。
    * 多次调用scale，倍数会相乘。
    *
    * @param scaleWidth 横坐标缩放的倍数
    * @param scaleHeight 纵坐标轴缩放的倍数
    */
  def scale(scaleWidth: Double): Unit = js.native
  def scale(scaleWidth: Double, scaleHeight: Double): Unit = js.native
  /**
    * 设置填充样式
    *
    * @param color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setFillStyle(color: String): Unit = js.native
  /**
    * 设置字体大小
    *
    * @param fontSize 字体的字号
    */
  def setFontSize(fontSize: Double): Unit = js.native
  /**
    * 设置全局画笔透明度。
    * @param alpha 0~1  透明度，0 表示完全透明，1 表示完全不透明
    */
  def setGlobalAlpha(alpha: Double): Unit = js.native
  /**
    * 设置线条端点的样式
    *
    * @param lineCap 线条的结束端点样式。 'butt'、'round'、'square'
    */
  def setLineCap(lineCap: LineCapType): Unit = js.native
  /**
    * 设置两线相交处的样式
    *  @param lineJoin 两条线相交时，所创建的拐角类型
    */
  def setLineJoin(lineJoin: LineJoinType): Unit = js.native
  /**
    * 设置线条宽度
    *
    * @param lineWidth 线条的宽度
    */
  def setLineWidth(lineWidth: Double): Unit = js.native
  /**
    * 设置最大斜接长度，斜接长度指的是在两条线交汇处内角和外角之间的距离。
    * 当 setLineJoin为 miter 时才有效。
    * 超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示
    *
    * @param miterLimit 最大斜接长度
    */
  def setMiterLimit(miterLimit: Double): Unit = js.native
  /**
    * 设置阴影
    *
    * @param offsetX 阴影相对于形状在水平方向的偏移
    * @param offsetY 阴影相对于形状在竖直方向的偏移
    * @param blur 阴影的模糊级别，数值越大越模糊 0~100
    * @param color 阴影的颜色。 'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setShadow(offsetX: Double, offsetY: Double, blur: Double, color: String): Unit = js.native
  /**
    * 设置线条样式
    *
    * @param color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
    */
  def setStrokeStyle(color: String): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_center(align: center): Unit = js.native
  /**
    * 用于设置文字的对齐
    */
  @JSName("setTextAlign")
  def setTextAlign_left(align: left): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_right(align: right): Unit = js.native
  /**
    * 对当前路径进行描边
    */
  def stroke(): Unit = js.native
  /**
    * 画一个矩形(非填充)。
    * Tip: 用 setFillStroke() 设置矩形线条的颜色，如果没设置默认是黑色。
    * @param x 矩形路径左上角的x坐标
    * @param y 矩形路径左上角的y坐标
    * @param width 矩形路径的宽度
    * @param height 矩形路径的高度
    *
    */
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
    * 对坐标原点进行缩放
    * 对当前坐标系的原点(0, 0)进行变换，默认的坐标系原点为页面左上角。
    *
    * @param x 水平坐标平移量
    * @param y 竖直坐标平移量
    */
  def translate(x: Double, y: Double): Unit = js.native
}


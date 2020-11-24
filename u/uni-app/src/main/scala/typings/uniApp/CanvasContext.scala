package typings.uniApp

import typings.std.CanvasPattern
import typings.uniApp.uniAppStrings.`no-repeat`
import typings.uniApp.uniAppStrings.`repeat-x`
import typings.uniApp.uniAppStrings.`repeat-y`
import typings.uniApp.uniAppStrings.bevel
import typings.uniApp.uniAppStrings.bottom
import typings.uniApp.uniAppStrings.butt
import typings.uniApp.uniAppStrings.center
import typings.uniApp.uniAppStrings.left
import typings.uniApp.uniAppStrings.middle
import typings.uniApp.uniAppStrings.miter
import typings.uniApp.uniAppStrings.normal
import typings.uniApp.uniAppStrings.repeat
import typings.uniApp.uniAppStrings.right
import typings.uniApp.uniAppStrings.round
import typings.uniApp.uniAppStrings.square
import typings.uniApp.uniAppStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasContext extends js.Object {
  
  /**
    * 画一条弧线
    */
  def arc(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    r: js.UndefOr[Double],
    sAngle: js.UndefOr[Double],
    eAngle: js.UndefOr[Double],
    counterclockwise: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * 根据控制点和半径绘制圆弧路径
    */
  def arcTo(): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: js.UndefOr[scala.Nothing],
    x2: js.UndefOr[scala.Nothing],
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: js.UndefOr[scala.Nothing],
    x2: js.UndefOr[scala.Nothing],
    y2: Double
  ): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: js.UndefOr[scala.Nothing],
    x2: js.UndefOr[scala.Nothing],
    y2: Double,
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: js.UndefOr[scala.Nothing],
    x2: Double,
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: js.UndefOr[scala.Nothing],
    x2: Double,
    y2: Double,
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: Double): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: Double,
    x2: js.UndefOr[scala.Nothing],
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: Double,
    x2: js.UndefOr[scala.Nothing],
    y2: Double,
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double): Unit = js.native
  def arcTo(
    x1: js.UndefOr[scala.Nothing],
    y1: Double,
    x2: Double,
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double, y2: Double): Unit = js.native
  def arcTo(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  def arcTo(x1: Double): Unit = js.native
  def arcTo(
    x1: Double,
    y1: js.UndefOr[scala.Nothing],
    x2: js.UndefOr[scala.Nothing],
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: Double, y1: js.UndefOr[scala.Nothing], x2: js.UndefOr[scala.Nothing], y2: Double): Unit = js.native
  def arcTo(
    x1: Double,
    y1: js.UndefOr[scala.Nothing],
    x2: js.UndefOr[scala.Nothing],
    y2: Double,
    radius: Double
  ): Unit = js.native
  def arcTo(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double): Unit = js.native
  def arcTo(
    x1: Double,
    y1: js.UndefOr[scala.Nothing],
    x2: Double,
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double): Unit = js.native
  def arcTo(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double, radius: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double): Unit = js.native
  def arcTo(
    x1: Double,
    y1: Double,
    x2: js.UndefOr[scala.Nothing],
    y2: js.UndefOr[scala.Nothing],
    radius: Double
  ): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double, radius: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: js.UndefOr[scala.Nothing], radius: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  
  /**
    * 开始创建一个路径
    */
  def beginPath(): Unit = js.native
  
  /**
    * 创建三次方贝塞尔曲线路径
    */
  def bezierCurveTo(
    cp1x: js.UndefOr[Double],
    cp1y: js.UndefOr[Double],
    cp2x: js.UndefOr[Double],
    cp2y: js.UndefOr[Double],
    x: js.UndefOr[Double],
    y: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * 清除画布上在该矩形区域内的内容
    */
  def clearRect(): Unit = js.native
  def clearRect(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double): Unit = js.native
  def clearRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): Unit = js.native
  def clearRect(x: Double): Unit = js.native
  def clearRect(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def clearRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def clearRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def clearRect(x: Double, y: Double): Unit = js.native
  def clearRect(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def clearRect(x: Double, y: Double, width: Double): Unit = js.native
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * 从原始画布中剪切任意形状和尺寸
    */
  def clip(): Unit = js.native
  
  /**
    * 关闭一个路径
    */
  def closePath(): Unit = js.native
  
  /**
    * 创建一个圆形的渐变颜色
    */
  def createCircularGradient(): CanvasGradient = js.native
  def createCircularGradient(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], r: Double): CanvasGradient = js.native
  def createCircularGradient(x: js.UndefOr[scala.Nothing], y: Double): CanvasGradient = js.native
  def createCircularGradient(x: js.UndefOr[scala.Nothing], y: Double, r: Double): CanvasGradient = js.native
  def createCircularGradient(x: Double): CanvasGradient = js.native
  def createCircularGradient(x: Double, y: js.UndefOr[scala.Nothing], r: Double): CanvasGradient = js.native
  def createCircularGradient(x: Double, y: Double): CanvasGradient = js.native
  def createCircularGradient(x: Double, y: Double, r: Double): CanvasGradient = js.native
  
  /**
    * 创建一个线性的渐变颜色
    */
  def createLinearGradient(): CanvasGradient = js.native
  def createLinearGradient(
    x0: js.UndefOr[scala.Nothing],
    y0: js.UndefOr[scala.Nothing],
    x1: js.UndefOr[scala.Nothing],
    y1: Double
  ): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: js.UndefOr[scala.Nothing], x1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: js.UndefOr[scala.Nothing], x1: Double, y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: Double): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: Double, x1: js.UndefOr[scala.Nothing], y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: Double, x1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: js.UndefOr[scala.Nothing], y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: js.UndefOr[scala.Nothing], x1: js.UndefOr[scala.Nothing], y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: js.UndefOr[scala.Nothing], x1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: js.UndefOr[scala.Nothing], x1: Double, y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: js.UndefOr[scala.Nothing], y1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double): CanvasGradient = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  
  /**
    * 对指定的图像创建模式的方法，可在指定的方向上重复元图像
    */
  def createPattern(): CanvasPattern | Null = js.native
  def createPattern(image: String): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_norepeat(image: js.UndefOr[scala.Nothing], repetition: `no-repeat`): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_norepeat(image: String, repetition: `no-repeat`): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeat(image: js.UndefOr[scala.Nothing], repetition: repeat): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeat(image: String, repetition: repeat): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeatx(image: js.UndefOr[scala.Nothing], repetition: `repeat-x`): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeatx(image: String, repetition: `repeat-x`): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeaty(image: js.UndefOr[scala.Nothing], repetition: `repeat-y`): CanvasPattern | Null = js.native
  @JSName("createPattern")
  def createPattern_repeaty(image: String, repetition: `repeat-y`): CanvasPattern | Null = js.native
  
  /**
    * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中
    */
  def draw(): Unit = js.native
  def draw(reserve: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def draw(reserve: Boolean): Unit = js.native
  def draw(reserve: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * 绘制图像到画布
    */
  def drawImage(imageResource: String, dx: Double, dy: Double): Unit = js.native
  def drawImage(imageResource: String, dx: Double, dy: Double, dWidth: Double, dHeigt: Double): Unit = js.native
  def drawImage(
    imageResource: String,
    sx: Double,
    sy: Double,
    sWidth: Double,
    sHeigt: Double,
    dx: Double,
    dy: Double,
    dWidth: Double,
    dHeight: Double
  ): Unit = js.native
  
  /**
    * 对当前路径中的内容进行填充
    */
  def fill(): Unit = js.native
  
  /**
    * 填充一个矩形
    */
  def fillRect(): Unit = js.native
  def fillRect(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double): Unit = js.native
  def fillRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): Unit = js.native
  def fillRect(x: Double): Unit = js.native
  def fillRect(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def fillRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def fillRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def fillRect(x: Double, y: Double): Unit = js.native
  def fillRect(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def fillRect(x: Double, y: Double, width: Double): Unit = js.native
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * 填充色
    */
  var fillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  
  /**
    * 在画布上绘制被填充的文本
    */
  def fillText(): Unit = js.native
  def fillText(
    text: js.UndefOr[scala.Nothing],
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    maxWidth: Double
  ): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double, maxWidth: Double): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: Double, y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: Double, y: Double): Unit = js.native
  def fillText(text: js.UndefOr[scala.Nothing], x: Double, y: Double, maxWidth: Double): Unit = js.native
  def fillText(text: String): Unit = js.native
  def fillText(text: String, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def fillText(text: String, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def fillText(text: String, x: js.UndefOr[scala.Nothing], y: Double, maxWidth: Double): Unit = js.native
  def fillText(text: String, x: Double): Unit = js.native
  def fillText(text: String, x: Double, y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  /**
    * 字体样式
    */
  var font: js.UndefOr[String] = js.native
  
  /**
    * 透明度
    */
  var globalAlpha: js.UndefOr[Double] = js.native
  
  /**
    * 设置要在绘制新形状时应用的合成操作的类型
    */
  var globalCompositeOperation: js.UndefOr[String] = js.native
  
  /**
    * 线条的端点样式
    * - butt:
    * - round:
    * - square:
    */
  var lineCap: js.UndefOr[butt | round | square] = js.native
  
  /**
    * 偏移量
    */
  var lineDashOffset: js.UndefOr[Double] = js.native
  
  /**
    * 线条的结束交点样式
    * - bevel:
    * - round:
    * - miter:
    */
  var lineJoin: js.UndefOr[bevel | round | miter] = js.native
  
  /**
    * 增加一个新点，然后创建一条从上次指定点到目标点的线
    */
  def lineTo(): Unit = js.native
  def lineTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def lineTo(x: Double): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /**
    * 线条的宽度
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * 测量文本尺寸信息，目前仅返回文本宽度
    */
  def measureText(): CanvasTextMetrics = js.native
  def measureText(text: String): CanvasTextMetrics = js.native
  
  /**
    * 最大斜接长度
    */
  var miterLimit: js.UndefOr[Double] = js.native
  
  /**
    * 把路径移动到画布中的指定点，不创建线条
    */
  def moveTo(): Unit = js.native
  def moveTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def moveTo(x: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /**
    * 创建二次贝塞尔曲线路径
    */
  def quadraticCurveTo(): Unit = js.native
  def quadraticCurveTo(
    cpx: js.UndefOr[scala.Nothing],
    cpy: js.UndefOr[scala.Nothing],
    x: js.UndefOr[scala.Nothing],
    y: Double
  ): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: js.UndefOr[scala.Nothing], x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: Double): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: Double, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: Double, x: Double): Unit = js.native
  def quadraticCurveTo(cpx: js.UndefOr[scala.Nothing], cpy: Double, x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: js.UndefOr[scala.Nothing], x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * 创建一个矩形
    */
  def rect(): Unit = js.native
  def rect(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: Double, width: Double): Unit = js.native
  def rect(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): Unit = js.native
  def rect(x: Double): Unit = js.native
  def rect(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def rect(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def rect(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def rect(x: Double, y: Double): Unit = js.native
  def rect(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def rect(x: Double, y: Double, width: Double): Unit = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * 恢复之前保存的绘图上下文
    */
  def restore(): Unit = js.native
  
  /**
    * 顺时针旋转当前坐标轴
    */
  def rotate(): Unit = js.native
  def rotate(rotate: Double): Unit = js.native
  
  /**
    * 保存当前的绘图上下文
    */
  def save(): Unit = js.native
  
  /**
    * 横纵坐标缩放
    */
  def scale(): Unit = js.native
  def scale(scaleWidth: js.UndefOr[scala.Nothing], scaleHeight: Double): Unit = js.native
  def scale(scaleWidth: Double): Unit = js.native
  def scale(scaleWidth: Double, scaleHeight: Double): Unit = js.native
  
  /**
    * 设置填充色
    */
  def setFillStyle(): Unit = js.native
  def setFillStyle(color: String): Unit = js.native
  def setFillStyle(color: CanvasPattern): Unit = js.native
  def setFillStyle(color: CanvasGradient): Unit = js.native
  
  /**
    * 设置字体的字号
    */
  def setFontSize(): Unit = js.native
  def setFontSize(fontSize: Double): Unit = js.native
  
  /**
    * 设置全局画笔透明度
    */
  def setGlobalAlpha(): Unit = js.native
  def setGlobalAlpha(alpha: Double): Unit = js.native
  
  /**
    * 设置线条的端点样式
    */
  def setLineCap(): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_butt(lineCap: butt): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_round(lineCap: round): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_square(lineCap: square): Unit = js.native
  
  /**
    * 设置线条的宽度
    */
  def setLineDash(): Unit = js.native
  def setLineDash(pattern: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def setLineDash(pattern: js.Array[_]): Unit = js.native
  def setLineDash(pattern: js.Array[_], offset: Double): Unit = js.native
  
  /**
    * 设置线条的交点样式
    */
  def setLineJoin(): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_bevel(lineJoin: bevel): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_miter(lineJoin: miter): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_round(lineJoin: round): Unit = js.native
  
  /**
    * 设置线条的宽度
    */
  def setLineWidth(): Unit = js.native
  def setLineWidth(lineWidth: Double): Unit = js.native
  
  /**
    * 设置最大斜接长度
    */
  def setMiterLimit(): Unit = js.native
  def setMiterLimit(miterLimit: Double): Unit = js.native
  
  /**
    * 设置阴影样式
    */
  def setShadow(): Unit = js.native
  def setShadow(
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: js.UndefOr[scala.Nothing],
    blur: js.UndefOr[scala.Nothing],
    color: String
  ): Unit = js.native
  def setShadow(offsetX: js.UndefOr[scala.Nothing], offsetY: js.UndefOr[scala.Nothing], blur: Double): Unit = js.native
  def setShadow(
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: js.UndefOr[scala.Nothing],
    blur: Double,
    color: String
  ): Unit = js.native
  def setShadow(offsetX: js.UndefOr[scala.Nothing], offsetY: Double): Unit = js.native
  def setShadow(
    offsetX: js.UndefOr[scala.Nothing],
    offsetY: Double,
    blur: js.UndefOr[scala.Nothing],
    color: String
  ): Unit = js.native
  def setShadow(offsetX: js.UndefOr[scala.Nothing], offsetY: Double, blur: Double): Unit = js.native
  def setShadow(offsetX: js.UndefOr[scala.Nothing], offsetY: Double, blur: Double, color: String): Unit = js.native
  def setShadow(offsetX: Double): Unit = js.native
  def setShadow(
    offsetX: Double,
    offsetY: js.UndefOr[scala.Nothing],
    blur: js.UndefOr[scala.Nothing],
    color: String
  ): Unit = js.native
  def setShadow(offsetX: Double, offsetY: js.UndefOr[scala.Nothing], blur: Double): Unit = js.native
  def setShadow(offsetX: Double, offsetY: js.UndefOr[scala.Nothing], blur: Double, color: String): Unit = js.native
  def setShadow(offsetX: Double, offsetY: Double): Unit = js.native
  def setShadow(offsetX: Double, offsetY: Double, blur: js.UndefOr[scala.Nothing], color: String): Unit = js.native
  def setShadow(offsetX: Double, offsetY: Double, blur: Double): Unit = js.native
  def setShadow(offsetX: Double, offsetY: Double, blur: Double, color: String): Unit = js.native
  
  /**
    * 设置边框颜色
    */
  def setStrokeStyle(): Unit = js.native
  def setStrokeStyle(color: String): Unit = js.native
  def setStrokeStyle(color: CanvasPattern): Unit = js.native
  def setStrokeStyle(color: CanvasGradient): Unit = js.native
  
  /**
    * 设置文字的对齐
    */
  def setTextAlign(): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_center(align: center): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_left(align: left): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_right(align: right): Unit = js.native
  
  /**
    * 设置文字的水平对齐
    */
  def setTextBaseline(): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_bottom(textBaseline: bottom): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_middle(textBaseline: middle): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_normal(textBaseline: normal): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_top(textBaseline: top): Unit = js.native
  
  /**
    * 使用矩阵重新设置（覆盖）当前变换的方法
    */
  def setTransform(
    scaleX: js.UndefOr[Double],
    skewX: js.UndefOr[Double],
    skewY: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    translateX: js.UndefOr[Double],
    translateY: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * 阴影的模糊级别
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * 阴影的颜色
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * 阴影相对于形状在水平方向的偏移
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * 阴影相对于形状在竖直方向的偏移
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * 画出当前路径的边框
    */
  def stroke(): Unit = js.native
  
  /**
    * 画一个矩形(非填充)
    */
  def strokeRect(): Unit = js.native
  def strokeRect(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double): Unit = js.native
  def strokeRect(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): Unit = js.native
  def strokeRect(x: Double): Unit = js.native
  def strokeRect(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def strokeRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def strokeRect(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def strokeRect(x: Double, y: Double): Unit = js.native
  def strokeRect(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def strokeRect(x: Double, y: Double, width: Double): Unit = js.native
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * 边框颜色
    */
  var strokeStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  
  /**
    * 给定的 (x, y) 位置绘制文本描边的方法
    */
  def strokeText(): Unit = js.native
  def strokeText(
    text: js.UndefOr[scala.Nothing],
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    maxWidth: Double
  ): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: js.UndefOr[scala.Nothing], y: Double, maxWidth: Double): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: Double): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: Double, y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: Double, y: Double): Unit = js.native
  def strokeText(text: js.UndefOr[scala.Nothing], x: Double, y: Double, maxWidth: Double): Unit = js.native
  def strokeText(text: String): Unit = js.native
  def strokeText(text: String, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def strokeText(text: String, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def strokeText(text: String, x: js.UndefOr[scala.Nothing], y: Double, maxWidth: Double): Unit = js.native
  def strokeText(text: String, x: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: js.UndefOr[scala.Nothing], maxWidth: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  /**
    * 对当前坐标系的原点(0, 0)进行变换
    */
  def translate(): Unit = js.native
  def translate(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def translate(x: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}

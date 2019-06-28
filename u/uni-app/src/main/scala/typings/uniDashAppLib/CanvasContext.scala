package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasContext extends js.Object {
  /**
    * 填充色
    */
  var fillStyle: js.UndefOr[java.lang.String] = js.native
  /**
    * 字体样式
    */
  var font: js.UndefOr[java.lang.String] = js.native
  /**
    * 透明度
    */
  var globalAlpha: js.UndefOr[scala.Double] = js.native
  /**
    * 设置要在绘制新形状时应用的合成操作的类型
    */
  var globalCompositeOperation: js.UndefOr[java.lang.String] = js.native
  /**
    * 线条的端点样式
    * - butt:
    * - round:
    * - square:
    */
  var lineCap: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.butt | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.square
  ] = js.native
  /**
    * 偏移量
    */
  var lineDashOffset: js.UndefOr[scala.Double] = js.native
  /**
    * 线条的结束交点样式
    * - bevel:
    * - round:
    * - miter:
    */
  var lineJoin: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.bevel | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.miter
  ] = js.native
  /**
    * 线条的宽度
    */
  var lineWidth: js.UndefOr[scala.Double] = js.native
  /**
    * 最大斜接长度
    */
  var miterLimit: js.UndefOr[scala.Double] = js.native
  /**
    * 阴影的模糊级别
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.native
  /**
    * 阴影的颜色
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.native
  /**
    * 阴影相对于形状在水平方向的偏移
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.native
  /**
    * 阴影相对于形状在竖直方向的偏移
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.native
  /**
    * 边框颜色
    */
  var strokeStyle: js.UndefOr[java.lang.String] = js.native
  /**
    * 创建一个颜色的渐变点
    */
  def addColorStop(): scala.Unit = js.native
  def addColorStop(stop: scala.Double): scala.Unit = js.native
  def addColorStop(stop: scala.Double, color: java.lang.String): scala.Unit = js.native
  /**
    * 画一条弧线
    */
  def arc(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    r: js.UndefOr[scala.Double],
    sAngle: js.UndefOr[scala.Double],
    eAngle: js.UndefOr[scala.Double],
    counterclockwise: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  /**
    * 根据控制点和半径绘制圆弧路径
    */
  def arcTo(): scala.Unit = js.native
  def arcTo(x1: scala.Double): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): scala.Unit = js.native
  /**
    * 开始创建一个路径
    */
  def beginPath(): scala.Unit = js.native
  /**
    * 创建三次方贝塞尔曲线路径
    */
  def bezierCurveTo(
    cp1x: js.UndefOr[scala.Double],
    cp1y: js.UndefOr[scala.Double],
    cp2x: js.UndefOr[scala.Double],
    cp2y: js.UndefOr[scala.Double],
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /**
    * 清除画布上在该矩形区域内的内容
    */
  def clearRect(): scala.Unit = js.native
  def clearRect(x: scala.Double): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * 从原始画布中剪切任意形状和尺寸
    */
  def clip(): scala.Unit = js.native
  /**
    * 关闭一个路径
    */
  def closePath(): scala.Unit = js.native
  /**
    * 创建一个圆形的渐变颜色
    */
  def createCircularGradient(): CanvasContext = js.native
  def createCircularGradient(x: scala.Double): CanvasContext = js.native
  def createCircularGradient(x: scala.Double, y: scala.Double): CanvasContext = js.native
  def createCircularGradient(x: scala.Double, y: scala.Double, r: scala.Double): CanvasContext = js.native
  /**
    * 创建一个线性的渐变颜色
    */
  def createLinearGradient(): CanvasContext = js.native
  def createLinearGradient(x0: scala.Double): CanvasContext = js.native
  def createLinearGradient(x0: scala.Double, y0: scala.Double): CanvasContext = js.native
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double): CanvasContext = js.native
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: java.lang.String): CanvasContext = js.native
  /**
    * 对指定的图像创建模式的方法，可在指定的方向上重复元图像
    */
  def createPattern(): scala.Unit = js.native
  def createPattern(image: java.lang.String): scala.Unit = js.native
  @JSName("createPattern")
  def createPattern_norepeat(image: java.lang.String, repetition: uniDashAppLib.uniDashAppLibStrings.`no-repeat`): scala.Unit = js.native
  @JSName("createPattern")
  def createPattern_repeat(image: java.lang.String, repetition: uniDashAppLib.uniDashAppLibStrings.repeat): scala.Unit = js.native
  @JSName("createPattern")
  def createPattern_repeatx(image: java.lang.String, repetition: uniDashAppLib.uniDashAppLibStrings.`repeat-x`): scala.Unit = js.native
  @JSName("createPattern")
  def createPattern_repeaty(image: java.lang.String, repetition: uniDashAppLib.uniDashAppLibStrings.`repeat-y`): scala.Unit = js.native
  /**
    * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中
    */
  def draw(): scala.Unit = js.native
  def draw(reserve: scala.Boolean): scala.Unit = js.native
  def draw(reserve: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 绘制图像到画布
    */
  def drawImage(
    imageResource: js.UndefOr[java.lang.String],
    dx: js.UndefOr[scala.Double],
    dy: js.UndefOr[scala.Double],
    dWidth: js.UndefOr[scala.Double],
    dHeigt: js.UndefOr[scala.Double],
    sx: js.UndefOr[scala.Double],
    sy: js.UndefOr[scala.Double],
    sWidth: js.UndefOr[scala.Double],
    sHeight: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /**
    * 对当前路径中的内容进行填充
    */
  def fill(): scala.Unit = js.native
  /**
    * 填充一个矩形
    */
  def fillRect(): scala.Unit = js.native
  def fillRect(x: scala.Double): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * 在画布上绘制被填充的文本
    */
  def fillText(): scala.Unit = js.native
  def fillText(text: java.lang.String): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  /**
    * 增加一个新点，然后创建一条从上次指定点到目标点的线
    */
  def lineTo(): scala.Unit = js.native
  def lineTo(x: scala.Double): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * 测量文本尺寸信息，目前仅返回文本宽度
    */
  def measureText(): CanvasTextMetrics = js.native
  def measureText(text: java.lang.String): CanvasTextMetrics = js.native
  /**
    * 把路径移动到画布中的指定点，不创建线条
    */
  def moveTo(): scala.Unit = js.native
  def moveTo(x: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * 创建二次贝塞尔曲线路径
    */
  def quadraticCurveTo(): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * 创建一个矩形
    */
  def rect(): scala.Unit = js.native
  def rect(x: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * 恢复之前保存的绘图上下文
    */
  def restore(): scala.Unit = js.native
  /**
    * 顺时针旋转当前坐标轴
    */
  def rotate(): scala.Unit = js.native
  def rotate(rotate: scala.Double): scala.Unit = js.native
  /**
    * 保存当前的绘图上下文
    */
  def save(): scala.Unit = js.native
  /**
    * 横纵坐标缩放
    */
  def scale(): scala.Unit = js.native
  def scale(scaleWidth: scala.Double): scala.Unit = js.native
  def scale(scaleWidth: scala.Double, scaleHeight: scala.Double): scala.Unit = js.native
  /**
    * 设置填充色
    */
  def setFillStyle(): scala.Unit = js.native
  def setFillStyle(color: java.lang.String): scala.Unit = js.native
  /**
    * 设置字体的字号
    */
  def setFontSize(): scala.Unit = js.native
  def setFontSize(fontSize: scala.Double): scala.Unit = js.native
  /**
    * 设置全局画笔透明度
    */
  def setGlobalAlpha(): scala.Unit = js.native
  def setGlobalAlpha(alpha: scala.Double): scala.Unit = js.native
  /**
    * 设置线条的端点样式
    */
  def setLineCap(): scala.Unit = js.native
  @JSName("setLineCap")
  def setLineCap_butt(lineCap: uniDashAppLib.uniDashAppLibStrings.butt): scala.Unit = js.native
  @JSName("setLineCap")
  def setLineCap_round(lineCap: uniDashAppLib.uniDashAppLibStrings.round): scala.Unit = js.native
  @JSName("setLineCap")
  def setLineCap_square(lineCap: uniDashAppLib.uniDashAppLibStrings.square): scala.Unit = js.native
  /**
    * 设置线条的宽度
    */
  def setLineDash(): scala.Unit = js.native
  def setLineDash(pattern: js.Array[_]): scala.Unit = js.native
  def setLineDash(pattern: js.Array[_], offset: scala.Double): scala.Unit = js.native
  /**
    * 设置线条的交点样式
    */
  def setLineJoin(): scala.Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_bevel(lineJoin: uniDashAppLib.uniDashAppLibStrings.bevel): scala.Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_miter(lineJoin: uniDashAppLib.uniDashAppLibStrings.miter): scala.Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_round(lineJoin: uniDashAppLib.uniDashAppLibStrings.round): scala.Unit = js.native
  /**
    * 设置线条的宽度
    */
  def setLineWidth(): scala.Unit = js.native
  def setLineWidth(lineWidth: scala.Double): scala.Unit = js.native
  /**
    * 设置最大斜接长度
    */
  def setMiterLimit(): scala.Unit = js.native
  def setMiterLimit(miterLimit: scala.Double): scala.Unit = js.native
  /**
    * 设置阴影样式
    */
  def setShadow(): scala.Unit = js.native
  def setShadow(offsetX: scala.Double): scala.Unit = js.native
  def setShadow(offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def setShadow(offsetX: scala.Double, offsetY: scala.Double, blur: scala.Double): scala.Unit = js.native
  def setShadow(offsetX: scala.Double, offsetY: scala.Double, blur: scala.Double, color: java.lang.String): scala.Unit = js.native
  /**
    * 设置边框颜色
    */
  def setStrokeStyle(): scala.Unit = js.native
  def setStrokeStyle(color: java.lang.String): scala.Unit = js.native
  /**
    * 设置文字的对齐
    */
  def setTextAlign(): scala.Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_center(align: uniDashAppLib.uniDashAppLibStrings.center): scala.Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_left(align: uniDashAppLib.uniDashAppLibStrings.left): scala.Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_right(align: uniDashAppLib.uniDashAppLibStrings.right): scala.Unit = js.native
  /**
    * 设置文字的水平对齐
    */
  def setTextBaseline(): scala.Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_bottom(textBaseline: uniDashAppLib.uniDashAppLibStrings.bottom): scala.Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_middle(textBaseline: uniDashAppLib.uniDashAppLibStrings.middle): scala.Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_normal(textBaseline: uniDashAppLib.uniDashAppLibStrings.normal): scala.Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_top(textBaseline: uniDashAppLib.uniDashAppLibStrings.top): scala.Unit = js.native
  /**
    * 使用矩阵重新设置（覆盖）当前变换的方法
    */
  def setTransform(
    scaleX: js.UndefOr[scala.Double],
    skewX: js.UndefOr[scala.Double],
    skewY: js.UndefOr[scala.Double],
    scaleY: js.UndefOr[scala.Double],
    translateX: js.UndefOr[scala.Double],
    translateY: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  /**
    * 画出当前路径的边框
    */
  def stroke(): scala.Unit = js.native
  /**
    * 画一个矩形(非填充)
    */
  def strokeRect(): scala.Unit = js.native
  def strokeRect(x: scala.Double): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * 给定的 (x, y) 位置绘制文本描边的方法
    */
  def strokeText(): scala.Unit = js.native
  def strokeText(text: java.lang.String): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  /**
    * 对当前坐标系的原点(0, 0)进行变换
    */
  def translate(): scala.Unit = js.native
  def translate(x: scala.Double): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}


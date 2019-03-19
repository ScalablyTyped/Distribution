package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasContext extends js.Object {
  /**
    * 填充色
    */
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 字体样式
    */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 透明度
    */
  var globalAlpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * 设置要在绘制新形状时应用的合成操作的类型
    */
  var globalCompositeOperation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 线条的端点样式
    * - butt:
    * - round:
    * - square:
    */
  var lineCap: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.butt | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.square
  ] = js.undefined
  /**
    * 偏移量
    */
  var lineDashOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * 线条的结束交点样式
    * - bevel:
    * - round:
    * - miter:
    */
  var lineJoin: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.bevel | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.miter
  ] = js.undefined
  /**
    * 线条的宽度
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * 最大斜接长度
    */
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * 阴影的模糊级别
    */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * 阴影的颜色
    */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 阴影相对于形状在水平方向的偏移
    */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * 阴影相对于形状在竖直方向的偏移
    */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * 边框颜色
    */
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 创建一个颜色的渐变点
    */
  def addColorStop(stop: scala.Double, color: java.lang.String): scala.Unit
  /**
    * 画一条弧线
    */
  def arc(
    x: scala.Double,
    y: scala.Double,
    r: scala.Double,
    sAngle: scala.Double,
    eAngle: scala.Double,
    counterclockwise: scala.Boolean
  ): scala.Unit
  /**
    * 根据控制点和半径绘制圆弧路径
    */
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): scala.Unit
  /**
    * 开始创建一个路径
    */
  def beginPath(): scala.Unit
  /**
    * 创建三次方贝塞尔曲线路径
    */
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit
  /**
    * 清除画布上在该矩形区域内的内容
    */
  def clearRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * 从原始画布中剪切任意形状和尺寸
    */
  def clip(): scala.Unit
  /**
    * 关闭一个路径
    */
  def closePath(): scala.Unit
  /**
    * 创建一个圆形的渐变颜色
    */
  def createCircularGradient(x: scala.Double, y: scala.Double, r: scala.Double): CanvasContext
  /**
    * 创建一个线性的渐变颜色
    */
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: java.lang.String): CanvasContext
  /**
    * 对指定的图像创建模式的方法，可在指定的方向上重复元图像
    */
  def createPattern(image: java.lang.String, repetition: java.lang.String): scala.Unit
  /**
    * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中
    */
  def draw(reserve: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * 绘制图像到画布
    */
  def drawImage(
    imageResource: java.lang.String,
    dx: scala.Double,
    dy: scala.Double,
    dWidth: scala.Double,
    dHeigt: scala.Double,
    sx: scala.Double,
    sy: scala.Double,
    sWidth: scala.Double,
    sHeight: scala.Double
  ): scala.Unit
  /**
    * 对当前路径中的内容进行填充
    */
  def fill(): scala.Unit
  /**
    * 填充一个矩形
    */
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * 在画布上绘制被填充的文本
    */
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit
  /**
    * 增加一个新点，然后创建一条从上次指定点到目标点的线
    */
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit
  /**
    * 测量文本尺寸信息，目前仅返回文本宽度
    */
  def measureText(text: java.lang.String): CanvasTextMetrics
  /**
    * 把路径移动到画布中的指定点，不创建线条
    */
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit
  /**
    * 创建二次贝塞尔曲线路径
    */
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit
  /**
    * 创建一个矩形
    */
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * 恢复之前保存的绘图上下文
    */
  def restore(): scala.Unit
  /**
    * 顺时针旋转当前坐标轴
    */
  def rotate(rotate: scala.Double): scala.Unit
  /**
    * 保存当前的绘图上下文
    */
  def save(): scala.Unit
  /**
    * 横纵坐标缩放
    */
  def scale(scaleWidth: scala.Double, scaleHeight: scala.Double): scala.Unit
  /**
    * 设置填充色
    */
  def setFillStyle(color: java.lang.String): scala.Unit
  /**
    * 设置字体的字号
    */
  def setFontSize(fontSize: scala.Double): scala.Unit
  /**
    * 设置全局画笔透明度
    */
  def setGlobalAlpha(alpha: scala.Double): scala.Unit
  /**
    * 设置线条的端点样式
    */
  def setLineCap(lineCap: java.lang.String): scala.Unit
  /**
    * 设置线条的宽度
    */
  def setLineDash(pattern: js.Array[_], offset: scala.Double): scala.Unit
  /**
    * 设置线条的交点样式
    */
  def setLineJoin(lineJoin: java.lang.String): scala.Unit
  /**
    * 设置线条的宽度
    */
  def setLineWidth(lineWidth: scala.Double): scala.Unit
  /**
    * 设置最大斜接长度
    */
  def setMiterLimit(miterLimit: scala.Double): scala.Unit
  /**
    * 设置阴影样式
    */
  def setShadow(offsetX: scala.Double, offsetY: scala.Double, blur: scala.Double, color: java.lang.String): scala.Unit
  /**
    * 设置边框颜色
    */
  def setStrokeStyle(color: java.lang.String): scala.Unit
  /**
    * 设置文字的对齐
    */
  def setTextAlign(align: java.lang.String): scala.Unit
  /**
    * 设置文字的水平对齐
    */
  def setTextBaseline(textBaseline: java.lang.String): scala.Unit
  /**
    * 使用矩阵重新设置（覆盖）当前变换的方法
    */
  def setTransform(
    scaleX: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double,
    scaleY: scala.Double,
    translateX: scala.Double,
    translateY: scala.Double
  ): scala.Unit
  /**
    * 画出当前路径的边框
    */
  def stroke(): scala.Unit
  /**
    * 画一个矩形(非填充)
    */
  def strokeRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit
  /**
    * 给定的 (x, y) 位置绘制文本描边的方法
    */
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit
  /**
    * 对当前坐标系的原点(0, 0)进行变换
    */
  def translate(x: scala.Double, y: scala.Double): scala.Unit
}

object CanvasContext {
  @scala.inline
  def apply(
    addColorStop: (scala.Double, java.lang.String) => scala.Unit,
    arc: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Boolean) => scala.Unit,
    arcTo: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    beginPath: () => scala.Unit,
    bezierCurveTo: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    clearRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    clip: () => scala.Unit,
    closePath: () => scala.Unit,
    createCircularGradient: (scala.Double, scala.Double, scala.Double) => CanvasContext,
    createLinearGradient: (scala.Double, scala.Double, scala.Double, java.lang.String) => CanvasContext,
    createPattern: (java.lang.String, java.lang.String) => scala.Unit,
    draw: (scala.Boolean, js.Function0[scala.Unit]) => scala.Unit,
    drawImage: (java.lang.String, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    fill: () => scala.Unit,
    fillRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    fillText: (java.lang.String, scala.Double, scala.Double, scala.Double) => scala.Unit,
    lineTo: (scala.Double, scala.Double) => scala.Unit,
    measureText: java.lang.String => CanvasTextMetrics,
    moveTo: (scala.Double, scala.Double) => scala.Unit,
    quadraticCurveTo: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    rect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    restore: () => scala.Unit,
    rotate: scala.Double => scala.Unit,
    save: () => scala.Unit,
    scale: (scala.Double, scala.Double) => scala.Unit,
    setFillStyle: java.lang.String => scala.Unit,
    setFontSize: scala.Double => scala.Unit,
    setGlobalAlpha: scala.Double => scala.Unit,
    setLineCap: java.lang.String => scala.Unit,
    setLineDash: (js.Array[_], scala.Double) => scala.Unit,
    setLineJoin: java.lang.String => scala.Unit,
    setLineWidth: scala.Double => scala.Unit,
    setMiterLimit: scala.Double => scala.Unit,
    setShadow: (scala.Double, scala.Double, scala.Double, java.lang.String) => scala.Unit,
    setStrokeStyle: java.lang.String => scala.Unit,
    setTextAlign: java.lang.String => scala.Unit,
    setTextBaseline: java.lang.String => scala.Unit,
    setTransform: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    stroke: () => scala.Unit,
    strokeRect: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    strokeText: (java.lang.String, scala.Double, scala.Double, scala.Double) => scala.Unit,
    translate: (scala.Double, scala.Double) => scala.Unit,
    fillStyle: java.lang.String = null,
    font: java.lang.String = null,
    globalAlpha: scala.Int | scala.Double = null,
    globalCompositeOperation: java.lang.String = null,
    lineCap: uniDashAppLib.uniDashAppLibStrings.butt | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.square = null,
    lineDashOffset: scala.Int | scala.Double = null,
    lineJoin: uniDashAppLib.uniDashAppLibStrings.bevel | uniDashAppLib.uniDashAppLibStrings.round | uniDashAppLib.uniDashAppLibStrings.miter = null,
    lineWidth: scala.Int | scala.Double = null,
    miterLimit: scala.Int | scala.Double = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null
  ): CanvasContext = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), arc = js.Any.fromFunction6(arc), arcTo = js.Any.fromFunction5(arcTo), beginPath = js.Any.fromFunction0(beginPath), bezierCurveTo = js.Any.fromFunction6(bezierCurveTo), clearRect = js.Any.fromFunction4(clearRect), clip = js.Any.fromFunction0(clip), closePath = js.Any.fromFunction0(closePath), createCircularGradient = js.Any.fromFunction3(createCircularGradient), createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), draw = js.Any.fromFunction2(draw), drawImage = js.Any.fromFunction9(drawImage), fill = js.Any.fromFunction0(fill), fillRect = js.Any.fromFunction4(fillRect), fillText = js.Any.fromFunction4(fillText), lineTo = js.Any.fromFunction2(lineTo), measureText = js.Any.fromFunction1(measureText), moveTo = js.Any.fromFunction2(moveTo), quadraticCurveTo = js.Any.fromFunction4(quadraticCurveTo), rect = js.Any.fromFunction4(rect), restore = js.Any.fromFunction0(restore), rotate = js.Any.fromFunction1(rotate), save = js.Any.fromFunction0(save), scale = js.Any.fromFunction2(scale), setFillStyle = js.Any.fromFunction1(setFillStyle), setFontSize = js.Any.fromFunction1(setFontSize), setGlobalAlpha = js.Any.fromFunction1(setGlobalAlpha), setLineCap = js.Any.fromFunction1(setLineCap), setLineDash = js.Any.fromFunction2(setLineDash), setLineJoin = js.Any.fromFunction1(setLineJoin), setLineWidth = js.Any.fromFunction1(setLineWidth), setMiterLimit = js.Any.fromFunction1(setMiterLimit), setShadow = js.Any.fromFunction4(setShadow), setStrokeStyle = js.Any.fromFunction1(setStrokeStyle), setTextAlign = js.Any.fromFunction1(setTextAlign), setTextBaseline = js.Any.fromFunction1(setTextBaseline), setTransform = js.Any.fromFunction6(setTransform), stroke = js.Any.fromFunction0(stroke), strokeRect = js.Any.fromFunction4(strokeRect), strokeText = js.Any.fromFunction4(strokeText), translate = js.Any.fromFunction2(translate))
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (font != null) __obj.updateDynamic("font")(font)
    if (globalAlpha != null) __obj.updateDynamic("globalAlpha")(globalAlpha.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineDashOffset != null) __obj.updateDynamic("lineDashOffset")(lineDashOffset.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    __obj.asInstanceOf[CanvasContext]
  }
}


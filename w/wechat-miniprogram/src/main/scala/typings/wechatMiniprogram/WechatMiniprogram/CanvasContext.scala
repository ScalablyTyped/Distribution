package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`no-repeat`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`repeat-x`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`repeat-y`
import typings.wechatMiniprogram.wechatMiniprogramStrings.bevel
import typings.wechatMiniprogram.wechatMiniprogramStrings.bottom
import typings.wechatMiniprogram.wechatMiniprogramStrings.butt
import typings.wechatMiniprogram.wechatMiniprogramStrings.center
import typings.wechatMiniprogram.wechatMiniprogramStrings.left
import typings.wechatMiniprogram.wechatMiniprogramStrings.middle
import typings.wechatMiniprogram.wechatMiniprogramStrings.miter
import typings.wechatMiniprogram.wechatMiniprogramStrings.normal
import typings.wechatMiniprogram.wechatMiniprogramStrings.repeat
import typings.wechatMiniprogram.wechatMiniprogramStrings.right
import typings.wechatMiniprogram.wechatMiniprogramStrings.round
import typings.wechatMiniprogram.wechatMiniprogramStrings.square
import typings.wechatMiniprogram.wechatMiniprogramStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** canvas 组件的绘图上下文。CanvasContext 是旧版的接口， 新版 Canvas 2D 接口与 Web 一致。 */
@js.native
trait CanvasContext extends js.Object {
  /** 填充颜色。用法同 [CanvasContext.setFillStyle()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFillStyle.html)。
    *
    * 最低基础库： `1.9.90` */
  var fillStyle: String | CanvasGradient = js.native
  /** 当前字体样式的属性。符合 [CSS font 语法](https://developer.mozilla.org/zh-CN/docs/Web/CSS/font) 的 DOMString 字符串，至少需要提供字体大小和字体族名。默认值为 10px sans-serif。
    *
    * 最低基础库： `1.9.90` */
  var font: String = js.native
  /** 全局画笔透明度。范围 0-1，0 表示完全透明，1 表示完全不透明。 */
  var globalAlpha: Double = js.native
  /** 在绘制新形状时应用的合成操作的类型。目前安卓版本只适用于 `fill` 填充块的合成，用于 `stroke` 线段的合成效果都是 `source-over`。
    *
    * 目前支持的操作有
    * - 安卓：xor, source-over, source-atop, destination-out, lighter, overlay, darken, lighten, hard-light
    * - iOS：xor, source-over, source-atop, destination-over, destination-out, lighter, multiply, overlay, darken, lighten, color-dodge, color-burn, hard-light, soft-light, difference, exclusion, saturation, luminosity
    *
    * 最低基础库： `1.9.90` */
  var globalCompositeOperation: String = js.native
  /** 线条的端点样式。用法同 [CanvasContext.setLineCap()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineCap.html)。
    *
    * 最低基础库： `1.9.90` */
  var lineCap: String = js.native
  /** 虚线偏移量，初始值为0
    *
    * 最低基础库： `1.9.90` */
  var lineDashOffset: Double = js.native
  /** 线条的交点样式。用法同 [CanvasContext.setLineJoin()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineJoin.html)。
    *
    * 可选值：
    * - 'bevel': 斜角;
    * - 'round': 圆角;
    * - 'miter': 尖角;
    *
    * 最低基础库： `1.9.90` */
  var lineJoin: bevel | round | miter = js.native
  /** 线条的宽度。用法同 [CanvasContext.setLineWidth()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineWidth.html)。
    *
    * 最低基础库： `1.9.90` */
  var lineWidth: Double = js.native
  /** 最大斜接长度。用法同 [CanvasContext.setMiterLimit()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setMiterLimit.html)。
    *
    * 最低基础库： `1.9.90` */
  var miterLimit: Double = js.native
  /** 阴影的模糊级别
    *
    * 最低基础库： `1.9.90` */
  var shadowBlur: Double = js.native
  /** 阴影的颜色
    *
    * 最低基础库： `1.9.90` */
  var shadowColor: Double = js.native
  /** 阴影相对于形状在水平方向的偏移
    *
    * 最低基础库： `1.9.90` */
  var shadowOffsetX: Double = js.native
  /** 阴影相对于形状在竖直方向的偏移
    *
    * 最低基础库： `1.9.90` */
  var shadowOffsetY: Double = js.native
  /** 边框颜色。用法同 [CanvasContext.setStrokeStyle()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setStrokeStyle.html)。
    *
    * 最低基础库： `1.9.90` */
  var strokeStyle: String | CanvasGradient = js.native
  /** [CanvasContext.arc(number x, number y, number r, number sAngle, number eAngle, boolean counterclockwise)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.arc.html)
  *
  * 创建一条弧线。
  *
  *   - 创建一个圆可以指定起始弧度为 0，终止弧度为 2 * Math.PI。
  *   - 用 `stroke` 或者 `fill` 方法来在 `canvas` 中画弧线。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // Draw coordinates
  ctx.arc(100, 75, 50, 0, 2 * Math.PI)
  ctx.setFillStyle('#EEEEEE')
  ctx.fill()
  ctx.beginPath()
  ctx.moveTo(40, 75)
  ctx.lineTo(160, 75)
  ctx.moveTo(100, 15)
  ctx.lineTo(100, 135)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
  ctx.setFontSize(12)
  ctx.setFillStyle('black')
  ctx.fillText('0', 165, 78)
  ctx.fillText('0.5*PI', 83, 145)
  ctx.fillText('1*PI', 15, 78)
  ctx.fillText('1.5*PI', 83, 10)
  // Draw points
  ctx.beginPath()
  ctx.arc(100, 75, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(100, 25, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(150, 75, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
  // Draw arc
  ctx.beginPath()
  ctx.arc(100, 75, 50, 0, 1.5 * Math.PI)
  ctx.setStrokeStyle('#333333')
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/arc.png)
  *
  * 针对 arc(100, 75, 50, 0, 1.5 * Math.PI)的三个关键坐标如下：
  *
  * - 绿色: 圆心 (100, 75)
  * - 红色: 起始弧度 (0)
  * - 蓝色: 终止弧度 (1.5 * Math.PI) */
  def arc(
    /** 圆心的 x 坐标 */
  x: Double,
    /** 圆心的 y 坐标 */
  y: Double,
    /** 圆的半径 */
  r: Double,
    /** 起始弧度，单位弧度（在3点钟方向） */
  sAngle: Double,
    /** 终止弧度 */
  eAngle: Double
  ): Unit = js.native
  def arc(
    /** 圆心的 x 坐标 */
  x: Double,
    /** 圆心的 y 坐标 */
  y: Double,
    /** 圆的半径 */
  r: Double,
    /** 起始弧度，单位弧度（在3点钟方向） */
  sAngle: Double,
    /** 终止弧度 */
  eAngle: Double,
    /** 弧度的方向是否是逆时针 */
  counterclockwise: Boolean
  ): Unit = js.native
  /** [CanvasContext.arcTo(number x1, number y1, number x2, number y2, number radius)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.arcTo.html)
    *
    * 根据控制点和半径绘制圆弧路径。
    *
    * 最低基础库： `1.9.90` */
  def arcTo(
    /** 第一个控制点的 x 轴坐标 */
  x1: Double,
    /** 第一个控制点的 y 轴坐标 */
  y1: Double,
    /** 第二个控制点的 x 轴坐标 */
  x2: Double,
    /** 第二个控制点的 y 轴坐标 */
  y2: Double,
    /** 圆弧的半径 */
  radius: Double
  ): Unit = js.native
  /** [CanvasContext.beginPath()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.beginPath.html)
  *
  * 开始创建一个路径。需要调用 `fill` 或者 `stroke` 才会使用路径进行填充或描边
  *
  *   - 在最开始的时候相当于调用了一次 `beginPath`。
  *   - 同一个路径内的多次 `setFillStyle`、`setStrokeStyle`、`setLineWidth`等设置，以最后一次设置为准。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setFillStyle('yellow')
  ctx.fill()
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
  ctx.rect(10, 100, 100, 30)
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/fill-path.png) */
  def beginPath(): Unit = js.native
  /** [CanvasContext.bezierCurveTo(number cp1x, number cp1y, number cp2x, number cp2y, number x, number y)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.bezierCurveTo.html)
  *
  * 创建三次方贝塞尔曲线路径。曲线的起始点为路径中前一个点。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // Draw points
  ctx.beginPath()
  ctx.arc(20, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(200, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(20, 100, 2, 0, 2 * Math.PI)
  ctx.arc(200, 100, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
  ctx.setFillStyle('black')
  ctx.setFontSize(12)
  // Draw guides
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.lineTo(20, 100)
  ctx.lineTo(150, 75)
  ctx.moveTo(200, 20)
  ctx.lineTo(200, 100)
  ctx.lineTo(70, 75)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
  // Draw quadratic curve
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.bezierCurveTo(20, 100, 200, 100, 200, 20)
  ctx.setStrokeStyle('black')
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/bezier-curve.png)
  *
  * 针对 moveTo(20, 20) bezierCurveTo(20, 100, 200, 100, 200, 20) 的三个关键坐标如下：
  *
  * - 红色：起始点(20, 20)
  * - 蓝色：两个控制点(20, 100) (200, 100)
  * - 绿色：终止点(200, 20) */
  def bezierCurveTo(
    /** 第一个贝塞尔控制点的 x 坐标 */
  cp1x: Double,
    /** 第一个贝塞尔控制点的 y 坐标 */
  cp1y: Double,
    /** 第二个贝塞尔控制点的 x 坐标 */
  cp2x: Double,
    /** 第二个贝塞尔控制点的 y 坐标 */
  cp2y: Double,
    /** 结束点的 x 坐标 */
  x: Double,
    /** 结束点的 y 坐标 */
  y: Double
  ): Unit = js.native
  /** [CanvasContext.clearRect(number x, number y, number width, number height)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.clearRect.html)
  *
  * 清除画布上在该矩形区域内的内容
  *
  * **示例代码**
  *
  *
  * clearRect 并非画一个白色的矩形在地址区域，而是清空，为了有直观感受，对 canvas 加了一层背景色。
  * ```html
  * <canvas canvas-id="myCanvas" style="border: 1px solid; background: #123456;"/>
  * ```
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(0, 0, 150, 200)
  ctx.setFillStyle('blue')
  ctx.fillRect(150, 0, 150, 200)
  ctx.clearRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/clear-rect.png) */
  def clearRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的纵坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.clip()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.clip.html)
  *
  * 从原始画布中剪切任意形状和尺寸。一旦剪切了某个区域，则所有之后的绘图都会被限制在被剪切的区域内（不能访问画布上的其他区域）。可以在使用 `clip` 方法前通过使用 `save` 方法对当前画布区域进行保存，并在以后的任意时间通过`restore`方法对其进行恢复。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  wx.downloadFile({
    url: 'http://is5.mzstatic.com/image/thumb/Purple128/v4/75/3b/90/753b907c-b7fb-5877-215a-759bd73691a4/source/50x50bb.jpg',
    success: function(res) {
    ctx.save()
    ctx.beginPath()
    ctx.arc(50, 50, 25, 0, 2*Math.PI)
    ctx.clip()
    ctx.drawImage(res.tempFilePath, 25, 25)
    ctx.restore()
    ctx.draw()
    }
  })
  ```
  * ![](@program/dev/image/canvas/clip.png)
  *
  * 最低基础库： `1.6.0` */
  def clip(): Unit = js.native
  /** [CanvasContext.closePath()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.closePath.html)
  *
  * 关闭一个路径。会连接起点和终点。如果关闭路径后没有调用 `fill` 或者 `stroke` 并开启了新的路径，那之前的路径将不会被渲染。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.closePath()
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/close-line.png)
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.closePath()
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
  ctx.rect(10, 100, 100, 30)
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/close-path.png) */
  def closePath(): Unit = js.native
  /** [[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) CanvasContext.createCircularGradient(number x, number y, number r)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.createCircularGradient.html)
  *
  * 创建一个圆形的渐变颜色。起点在圆心，终点在圆环。返回的`CanvasGradient`对象需要使用 [CanvasGradient.addColorStop()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.addColorStop.html) 来指定渐变点，至少要两个。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // Create circular gradient
  const grd = ctx.createCircularGradient(75, 50, 50)
  grd.addColorStop(0, 'red')
  grd.addColorStop(1, 'white')
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/circular-gradient.png) */
  def createCircularGradient(/** 圆心的 x 坐标 */
  x: Double, /** 圆心的 y 坐标 */
  y: Double, /** 圆的半径 */
  r: Double): CanvasGradient = js.native
  /** [[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) CanvasContext.createLinearGradient(number x0, number y0, number x1, number y1)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.createLinearGradient.html)
  *
  * 创建一个线性的渐变颜色。返回的`CanvasGradient`对象需要使用 [CanvasGradient.addColorStop()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.addColorStop.html) 来指定渐变点，至少要两个。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // Create linear gradient
  const grd = ctx.createLinearGradient(0, 0, 200, 0)
  grd.addColorStop(0, 'red')
  grd.addColorStop(1, 'white')
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/linear-gradient.png) */
  def createLinearGradient(
    /** 起点的 x 坐标 */
  x0: Double,
    /** 起点的 y 坐标 */
  y0: Double,
    /** 终点的 x 坐标 */
  x1: Double,
    /** 终点的 y 坐标 */
  y1: Double
  ): CanvasGradient = js.native
  @JSName("createPattern")
  def createPattern_norepeat(
    /** 重复的图像源，支持代码包路径和本地临时路径 (本地路径) */
  image: String,
    /** 如何重复图像
    *
    * 参数 repetition 可选值：
    * - 'repeat': 水平竖直方向都重复;
    * - 'repeat-x': 水平方向重复;
    * - 'repeat-y': 竖直方向重复;
    * - 'no-repeat': 不重复; */
  repetition: `no-repeat`
  ): Unit = js.native
  /** [CanvasContext.createPattern(string image, string repetition)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.createPattern.html)
    *
    * 对指定的图像创建模式的方法，可在指定的方向上重复元图像
    *
    * 最低基础库： `1.9.90` */
  @JSName("createPattern")
  def createPattern_repeat(
    /** 重复的图像源，支持代码包路径和本地临时路径 (本地路径) */
  image: String,
    /** 如何重复图像
    *
    * 参数 repetition 可选值：
    * - 'repeat': 水平竖直方向都重复;
    * - 'repeat-x': 水平方向重复;
    * - 'repeat-y': 竖直方向重复;
    * - 'no-repeat': 不重复; */
  repetition: repeat
  ): Unit = js.native
  @JSName("createPattern")
  def createPattern_repeatx(
    /** 重复的图像源，支持代码包路径和本地临时路径 (本地路径) */
  image: String,
    /** 如何重复图像
    *
    * 参数 repetition 可选值：
    * - 'repeat': 水平竖直方向都重复;
    * - 'repeat-x': 水平方向重复;
    * - 'repeat-y': 竖直方向重复;
    * - 'no-repeat': 不重复; */
  repetition: `repeat-x`
  ): Unit = js.native
  @JSName("createPattern")
  def createPattern_repeaty(
    /** 重复的图像源，支持代码包路径和本地临时路径 (本地路径) */
  image: String,
    /** 如何重复图像
    *
    * 参数 repetition 可选值：
    * - 'repeat': 水平竖直方向都重复;
    * - 'repeat-x': 水平方向重复;
    * - 'repeat-y': 竖直方向重复;
    * - 'no-repeat': 不重复; */
  repetition: `repeat-y`
  ): Unit = js.native
  /** [CanvasContext.draw(boolean reserve, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.draw.html)
  *
  * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中。
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 true。所以保留了上一次的绘制结果，在上下文设置的 fillStyle 'red' 也变成了默认的 'black'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw(true)
  ```
  * ![](@program/dev/image/canvas/reserve.png)
  *
  * **示例代码**
  *
  *
  * 第二次 draw() reserve 为 false。所以没有保留了上一次的绘制结果和在上下文设置的 fillStyle 'red'。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.draw()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/un-reserve.png) */
  def draw(): Unit = js.native
  def draw(
    /** 本次绘制是否接着上一次绘制。即 reserve 参数为 false，则在本次调用绘制之前 native 层会先清空画布再继续绘制；若 reserve 参数为 true，则保留当前画布上的内容，本次调用 drawCanvas 绘制的内容覆盖在上面，默认 false。 */
  reserve: js.UndefOr[scala.Nothing],
    /** 绘制完成后执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  def draw(
    /** 本次绘制是否接着上一次绘制。即 reserve 参数为 false，则在本次调用绘制之前 native 层会先清空画布再继续绘制；若 reserve 参数为 true，则保留当前画布上的内容，本次调用 drawCanvas 绘制的内容覆盖在上面，默认 false。 */
  reserve: Boolean
  ): Unit = js.native
  def draw(
    /** 本次绘制是否接着上一次绘制。即 reserve 参数为 false，则在本次调用绘制之前 native 层会先清空画布再继续绘制；若 reserve 参数为 true，则保留当前画布上的内容，本次调用 drawCanvas 绘制的内容覆盖在上面，默认 false。 */
  reserve: Boolean,
    /** 绘制完成后执行的回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /** [CanvasContext.drawImage(string imageResource, number sx, number sy, number sWidth, number sHeight, number dx, number dy, number dWidth, number dHeight)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.drawImage.html)
  *
  * 绘制图像到画布
  *
  * **示例代码**
  *
  *
  *
  * 有三个版本的写法：
  *
  * - drawImage(imageResource, dx, dy)
  * - drawImage(imageResource, dx, dy, dWidth, dHeight)
  * - drawImage(imageResource, sx, sy, sWidth, sHeight, dx, dy, dWidth, dHeight) 从 1.9.0 起支持
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  wx.chooseImage({
    success: function(res){
    ctx.drawImage(res.tempFilePaths[0], 0, 0, 150, 100)
    ctx.draw()
    }
  })
  ```
  * ![](@program/dev/image/canvas/draw-image.png) */
  def drawImage(
    /** 所要绘制的图片资源（网络图片要通过 getImageInfo / downloadFile 先下载） */
  imageResource: String,
    /** imageResource的左上角在目标 canvas 上 x 轴的位置 */
  dx: Double,
    /** imageResource的左上角在目标 canvas 上 y 轴的位置 */
  dy: Double
  ): Unit = js.native
  /** [CanvasContext.drawImage(string imageResource, number sx, number sy, number sWidth, number sHeight, number dx, number dy, number dWidth, number dHeight)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.drawImage.html)
  *
  * 绘制图像到画布
  *
  * **示例代码**
  *
  *
  *
  * 有三个版本的写法：
  *
  * - drawImage(imageResource, dx, dy)
  * - drawImage(imageResource, dx, dy, dWidth, dHeight)
  * - drawImage(imageResource, sx, sy, sWidth, sHeight, dx, dy, dWidth, dHeight) 从 1.9.0 起支持
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  wx.chooseImage({
    success: function(res){
    ctx.drawImage(res.tempFilePaths[0], 0, 0, 150, 100)
    ctx.draw()
    }
  })
  ```
  * ![](@program/dev/image/canvas/draw-image.png) */
  def drawImage(
    /** 所要绘制的图片资源（网络图片要通过 getImageInfo / downloadFile 先下载） */
  imageResource: String,
    /** imageResource的左上角在目标 canvas 上 x 轴的位置 */
  dx: Double,
    /** imageResource的左上角在目标 canvas 上 y 轴的位置 */
  dy: Double,
    /** 在目标画布上绘制imageResource的宽度，允许对绘制的imageResource进行缩放 */
  dWidth: Double,
    /** 在目标画布上绘制imageResource的高度，允许对绘制的imageResource进行缩放 */
  dHeight: Double
  ): Unit = js.native
  /** [CanvasContext.drawImage(string imageResource, number sx, number sy, number sWidth, number sHeight, number dx, number dy, number dWidth, number dHeight)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.drawImage.html)
  *
  * 绘制图像到画布
  *
  * **示例代码**
  *
  *
  *
  * 有三个版本的写法：
  *
  * - drawImage(imageResource, dx, dy)
  * - drawImage(imageResource, dx, dy, dWidth, dHeight)
  * - drawImage(imageResource, sx, sy, sWidth, sHeight, dx, dy, dWidth, dHeight) 从 1.9.0 起支持
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  wx.chooseImage({
    success: function(res){
    ctx.drawImage(res.tempFilePaths[0], 0, 0, 150, 100)
    ctx.draw()
    }
  })
  ```
  * ![](@program/dev/image/canvas/draw-image.png) */
  def drawImage(
    /** 所要绘制的图片资源（网络图片要通过 getImageInfo / downloadFile 先下载） */
  imageResource: String,
    /** 需要绘制到画布中的，imageResource的矩形（裁剪）选择框的左上角 x 坐标 */
  sx: Double,
    /** 需要绘制到画布中的，imageResource的矩形（裁剪）选择框的左上角 y 坐标 */
  sy: Double,
    /** 需要绘制到画布中的，imageResource的矩形（裁剪）选择框的宽度 */
  sWidth: Double,
    /** 需要绘制到画布中的，imageResource的矩形（裁剪）选择框的高度 */
  sHeight: Double,
    /** imageResource的左上角在目标 canvas 上 x 轴的位置 */
  dx: Double,
    /** imageResource的左上角在目标 canvas 上 y 轴的位置 */
  dy: Double,
    /** 在目标画布上绘制imageResource的宽度，允许对绘制的imageResource进行缩放 */
  dWidth: Double,
    /** 在目标画布上绘制imageResource的高度，允许对绘制的imageResource进行缩放 */
  dHeight: Double
  ): Unit = js.native
  /** [CanvasContext.fill()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.fill.html)
  *
  * 对当前路径中的内容进行填充。默认的填充色为黑色。
  *
  * **示例代码**
  *
  *
  *
  * 如果当前路径没有闭合，fill() 方法会将起点和终点进行连接，然后填充。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.fill()
  ctx.draw()
  ```
  *
  * fill() 填充的的路径是从 beginPath() 开始计算，但是不会将 fillRect() 包含进去。
  *
  * ![](@program/dev/image/canvas/fill-line.png)
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setFillStyle('yellow')
  ctx.fill()
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
  // only fill this rect, not in current path
  ctx.setFillStyle('blue')
  ctx.fillRect(10, 70, 100, 30)
  ctx.rect(10, 100, 100, 30)
  // it will fill current path
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/fill-path.png) */
  def fill(): Unit = js.native
  /** [CanvasContext.fillRect(number x, number y, number width, number height)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.fillRect.html)
  *
  * 填充一个矩形。用 [`setFillStyle`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFillStyle.html) 设置矩形的填充色，如果没设置默认是黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/fill-rect.png) */
  def fillRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的纵坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.fillText(string text, number x, number y, number maxWidth)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.fillText.html)
  *
  * 在画布上绘制被填充的文本
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFontSize(20)
  ctx.fillText('Hello', 20, 20)
  ctx.fillText('MINA', 100, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/text.png) */
  def fillText(/** 在画布上输出的文本 */
  text: String, /** 绘制文本的左上角 x 坐标位置 */
  x: Double, /** 绘制文本的左上角 y 坐标位置 */
  y: Double): Unit = js.native
  def fillText(
    /** 在画布上输出的文本 */
  text: String,
    /** 绘制文本的左上角 x 坐标位置 */
  x: Double,
    /** 绘制文本的左上角 y 坐标位置 */
  y: Double,
    /** 需要绘制的最大宽度，可选 */
  maxWidth: Double
  ): Unit = js.native
  /** [CanvasContext.lineTo(number x, number y)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.lineTo.html)
  *
  * 增加一个新点，然后创建一条从上次指定点到目标点的线。用 `stroke` 方法来画线条
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.rect(10, 10, 100, 50)
  ctx.lineTo(110, 60)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/line-to.png) */
  def lineTo(/** 目标位置的 x 坐标 */
  x: Double, /** 目标位置的 y 坐标 */
  y: Double): Unit = js.native
  /** [Object CanvasContext.measureText(string text)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.measureText.html)
    *
    * 测量文本尺寸信息。目前仅返回文本宽度。同步接口。
    *
    * 最低基础库： `1.9.90` */
  def measureText(/** 要测量的文本 */
  text: String): TextMetrics = js.native
  /** [CanvasContext.moveTo(number x, number y)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.moveTo.html)
  *
  * 把路径移动到画布中的指定点，不创建线条。用 `stroke` 方法来画线条
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.moveTo(10, 50)
  ctx.lineTo(100, 50)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/move-to.png) */
  def moveTo(/** 目标位置的 x 坐标 */
  x: Double, /** 目标位置的 y 坐标 */
  y: Double): Unit = js.native
  /** [CanvasContext.quadraticCurveTo(number cpx, number cpy, number x, number y)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.quadraticCurveTo.html)
  *
  * 创建二次贝塞尔曲线路径。曲线的起始点为路径中前一个点。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // Draw points
  ctx.beginPath()
  ctx.arc(20, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(200, 20, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('lightgreen')
  ctx.fill()
  ctx.beginPath()
  ctx.arc(20, 100, 2, 0, 2 * Math.PI)
  ctx.setFillStyle('blue')
  ctx.fill()
  ctx.setFillStyle('black')
  ctx.setFontSize(12)
  // Draw guides
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.lineTo(20, 100)
  ctx.lineTo(200, 20)
  ctx.setStrokeStyle('#AAAAAA')
  ctx.stroke()
  // Draw quadratic curve
  ctx.beginPath()
  ctx.moveTo(20, 20)
  ctx.quadraticCurveTo(20, 100, 200, 20)
  ctx.setStrokeStyle('black')
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/quadratic-curve-to.png)
  *
  * 针对 moveTo(20, 20) quadraticCurveTo(20, 100, 200, 20) 的三个关键坐标如下：
  *
  * - 红色：起始点(20, 20)
  * - 蓝色：控制点(20, 100)
  * - 绿色：终止点(200, 20) */
  def quadraticCurveTo(
    /** 贝塞尔控制点的 x 坐标 */
  cpx: Double,
    /** 贝塞尔控制点的 y 坐标 */
  cpy: Double,
    /** 结束点的 x 坐标 */
  x: Double,
    /** 结束点的 y 坐标 */
  y: Double
  ): Unit = js.native
  /** [CanvasContext.rect(number x, number y, number width, number height)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.rect.html)
  *
  * 创建一个矩形路径。需要用 [`fill`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.fill.html) 或者 [`stroke`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.stroke.html) 方法将矩形真正的画到 `canvas` 中
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.rect(10, 10, 150, 75)
  ctx.setFillStyle('red')
  ctx.fill()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/fill-rect.png) */
  def rect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的纵坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.restore()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.restore.html)
  *
  * 恢复之前保存的绘图上下文。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // save the default fill style
  ctx.save()
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  // restore to the previous saved state
  ctx.restore()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/save-restore.png) */
  def restore(): Unit = js.native
  /** [CanvasContext.rotate(number rotate)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.rotate.html)
  *
  * 以原点为中心顺时针旋转当前坐标轴。多次调用旋转的角度会叠加。原点可以用 `translate` 方法修改。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.strokeRect(100, 10, 150, 100)
  ctx.rotate(20 * Math.PI / 180)
  ctx.strokeRect(100, 10, 150, 100)
  ctx.rotate(20 * Math.PI / 180)
  ctx.strokeRect(100, 10, 150, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/rotate.png) */
  def rotate(/** 旋转角度，以弧度计 degrees * Math.PI/180；degrees 范围为 0-360 */
  rotate: Double): Unit = js.native
  /** [CanvasContext.save()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.save.html)
  *
  * 保存绘图上下文。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // save the default fill style
  ctx.save()
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  // restore to the previous saved state
  ctx.restore()
  ctx.fillRect(50, 50, 150, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/save-restore.png) */
  def save(): Unit = js.native
  /** [CanvasContext.scale(number scaleWidth, number scaleHeight)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.scale.html)
  *
  * 在调用后，之后创建的路径其横纵坐标会被缩放。多次调用倍数会相乘。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.strokeRect(10, 10, 25, 15)
  ctx.scale(2, 2)
  ctx.strokeRect(10, 10, 25, 15)
  ctx.scale(2, 2)
  ctx.strokeRect(10, 10, 25, 15)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/scale.png) */
  def scale(
    /** 横坐标缩放的倍数 (1 = 100%，0.5 = 50%，2 = 200%) */
  scaleWidth: Double,
    /** 纵坐标轴缩放的倍数 (1 = 100%，0.5 = 50%，2 = 200%) */
  scaleHeight: Double
  ): Unit = js.native
  /** [CanvasContext.setFillStyle(string|[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) color)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFillStyle.html)
  *
  * 设置填充色。
  *
  * **代码示例**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/fill-rect.png) */
  def setFillStyle(/** 填充的颜色，默认颜色为 black。 */
  color: String): Unit = js.native
  def setFillStyle(/** 填充的颜色，默认颜色为 black。 */
  color: CanvasGradient): Unit = js.native
  /** [CanvasContext.setFontSize(number fontSize)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setFontSize.html)
  *
  * 设置字体的字号
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFontSize(20)
  ctx.fillText('20', 20, 20)
  ctx.setFontSize(30)
  ctx.fillText('30', 40, 40)
  ctx.setFontSize(40)
  ctx.fillText('40', 60, 60)
  ctx.setFontSize(50)
  ctx.fillText('50', 90, 90)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/font-size.png) */
  def setFontSize(/** 字体的字号 */
  fontSize: Double): Unit = js.native
  /** [CanvasContext.setGlobalAlpha(number alpha)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setGlobalAlpha.html)
  *
  * 设置全局画笔透明度。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.fillRect(10, 10, 150, 100)
  ctx.setGlobalAlpha(0.2)
  ctx.setFillStyle('blue')
  ctx.fillRect(50, 50, 150, 100)
  ctx.setFillStyle('yellow')
  ctx.fillRect(100, 100, 150, 100)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/global-alpha.png) */
  def setGlobalAlpha(/** 透明度。范围 0-1，0 表示完全透明，1 表示完全不透明。 */
  alpha: Double): Unit = js.native
  /** [CanvasContext.setLineCap(string lineCap)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineCap.html)
  *
  * 设置线条的端点样式
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(150, 10)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineCap('butt')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 30)
  ctx.lineTo(150, 30)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineCap('round')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 50)
  ctx.lineTo(150, 50)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineCap('square')
  ctx.setLineWidth(10)
  ctx.moveTo(10, 70)
  ctx.lineTo(150, 70)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/line-cap.png) */
  @JSName("setLineCap")
  def setLineCap_butt(
    /** 线条的结束端点样式
    *
    * 参数 lineCap 可选值：
    * - 'butt': 向线条的每个末端添加平直的边缘。;
    * - 'round': 向线条的每个末端添加圆形线帽。;
    * - 'square': 向线条的每个末端添加正方形线帽。; */
  lineCap: butt
  ): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_round(
    /** 线条的结束端点样式
    *
    * 参数 lineCap 可选值：
    * - 'butt': 向线条的每个末端添加平直的边缘。;
    * - 'round': 向线条的每个末端添加圆形线帽。;
    * - 'square': 向线条的每个末端添加正方形线帽。; */
  lineCap: round
  ): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_square(
    /** 线条的结束端点样式
    *
    * 参数 lineCap 可选值：
    * - 'butt': 向线条的每个末端添加平直的边缘。;
    * - 'round': 向线条的每个末端添加圆形线帽。;
    * - 'square': 向线条的每个末端添加正方形线帽。; */
  lineCap: square
  ): Unit = js.native
  /** [CanvasContext.setLineDash(Array.&lt;number&gt; pattern, number offset)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineDash.html)
  *
  * 设置虚线样式。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setLineDash([10, 20], 5);
  ctx.beginPath();
  ctx.moveTo(0,100);
  ctx.lineTo(400, 100);
  ctx.stroke();
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/set-line-dash.png)
  *
  * 最低基础库： `1.6.0` */
  def setLineDash(/** 一组描述交替绘制线段和间距（坐标空间单位）长度的数字 */
  pattern: js.Array[Double], /** 虚线偏移量 */
  offset: Double): Unit = js.native
  /** [CanvasContext.setLineJoin(string lineJoin)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineJoin.html)
  *
  * 设置线条的交点样式
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 50)
  ctx.lineTo(10, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineJoin('bevel')
  ctx.setLineWidth(10)
  ctx.moveTo(50, 10)
  ctx.lineTo(140, 50)
  ctx.lineTo(50, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineJoin('round')
  ctx.setLineWidth(10)
  ctx.moveTo(90, 10)
  ctx.lineTo(180, 50)
  ctx.lineTo(90, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineJoin('miter')
  ctx.setLineWidth(10)
  ctx.moveTo(130, 10)
  ctx.lineTo(220, 50)
  ctx.lineTo(130, 90)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/line-join.png) */
  @JSName("setLineJoin")
  def setLineJoin_bevel(
    /** 线条的结束交点样式
    *
    * 参数 lineJoin 可选值：
    * - 'bevel': 斜角;
    * - 'round': 圆角;
    * - 'miter': 尖角; */
  lineJoin: bevel
  ): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_miter(
    /** 线条的结束交点样式
    *
    * 参数 lineJoin 可选值：
    * - 'bevel': 斜角;
    * - 'round': 圆角;
    * - 'miter': 尖角; */
  lineJoin: miter
  ): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_round(
    /** 线条的结束交点样式
    *
    * 参数 lineJoin 可选值：
    * - 'bevel': 斜角;
    * - 'round': 圆角;
    * - 'miter': 尖角; */
  lineJoin: round
  ): Unit = js.native
  /** [CanvasContext.setLineWidth(number lineWidth)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineWidth.html)
  *
  * 设置线条的宽度
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.moveTo(10, 10)
  ctx.lineTo(150, 10)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(5)
  ctx.moveTo(10, 30)
  ctx.lineTo(150, 30)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.moveTo(10, 50)
  ctx.lineTo(150, 50)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(15)
  ctx.moveTo(10, 70)
  ctx.lineTo(150, 70)
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/line-width.png) */
  def setLineWidth(/** 线条的宽度，单位px */
  lineWidth: Double): Unit = js.native
  /** [CanvasContext.setMiterLimit(number miterLimit)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setMiterLimit.html)
  *
  * 设置最大斜接长度。斜接长度指的是在两条线交汇处内角和外角之间的距离。当 [CanvasContext.setLineJoin()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setLineJoin.html) 为 miter 时才有效。超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(1)
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 50)
  ctx.lineTo(10, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(2)
  ctx.moveTo(50, 10)
  ctx.lineTo(140, 50)
  ctx.lineTo(50, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(3)
  ctx.moveTo(90, 10)
  ctx.lineTo(180, 50)
  ctx.lineTo(90, 90)
  ctx.stroke()
  ctx.beginPath()
  ctx.setLineWidth(10)
  ctx.setLineJoin('miter')
  ctx.setMiterLimit(4)
  ctx.moveTo(130, 10)
  ctx.lineTo(220, 50)
  ctx.lineTo(130, 90)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/miter-limit.png) */
  def setMiterLimit(/** 最大斜接长度 */
  miterLimit: Double): Unit = js.native
  /** [CanvasContext.setShadow(number offsetX, number offsetY, number blur, string color)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setShadow.html)
  *
  * 设定阴影样式。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setFillStyle('red')
  ctx.setShadow(10, 50, 50, 'blue')
  ctx.fillRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/shadow.png) */
  def setShadow(
    /** 阴影相对于形状在水平方向的偏移，默认值为 0。 */
  offsetX: Double,
    /** 阴影相对于形状在竖直方向的偏移，默认值为 0。 */
  offsetY: Double,
    /** 阴影的模糊级别，数值越大越模糊。范围 0- 100。，默认值为 0。 */
  blur: Double,
    /** 阴影的颜色。默认值为 black。 */
  color: String
  ): Unit = js.native
  /** [CanvasContext.setStrokeStyle(string|[CanvasGradient](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.html) color)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setStrokeStyle.html)
  *
  * 设置描边颜色。
  *
  * **代码示例**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.strokeRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/stroke-rect.png) */
  def setStrokeStyle(/** 描边的颜色，默认颜色为 black。 */
  color: String): Unit = js.native
  def setStrokeStyle(/** 描边的颜色，默认颜色为 black。 */
  color: CanvasGradient): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_center(
    /** 文字的对齐方式
    *
    * 参数 align 可选值：
    * - 'left': 左对齐;
    * - 'center': 居中对齐;
    * - 'right': 右对齐; */
  align: center
  ): Unit = js.native
  /** [CanvasContext.setTextAlign(string align)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setTextAlign.html)
  *
  * 设置文字的对齐
  *
  * **示例代码**
  *
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.moveTo(150, 20)
  ctx.lineTo(150, 170)
  ctx.stroke()
  ctx.setFontSize(15)
  ctx.setTextAlign('left')
  ctx.fillText('textAlign=left', 150, 60)
  ctx.setTextAlign('center')
  ctx.fillText('textAlign=center', 150, 80)
  ctx.setTextAlign('right')
  ctx.fillText('textAlign=right', 150, 100)
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/set-text-align.png)
  *
  * 最低基础库： `1.1.0` */
  @JSName("setTextAlign")
  def setTextAlign_left(
    /** 文字的对齐方式
    *
    * 参数 align 可选值：
    * - 'left': 左对齐;
    * - 'center': 居中对齐;
    * - 'right': 右对齐; */
  align: left
  ): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_right(
    /** 文字的对齐方式
    *
    * 参数 align 可选值：
    * - 'left': 左对齐;
    * - 'center': 居中对齐;
    * - 'right': 右对齐; */
  align: right
  ): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_bottom(
    /** 文字的竖直对齐方式
    *
    * 参数 textBaseline 可选值：
    * - 'top': 顶部对齐;
    * - 'bottom': 底部对齐;
    * - 'middle': 居中对齐;
    * - 'normal': ; */
  textBaseline: bottom
  ): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_middle(
    /** 文字的竖直对齐方式
    *
    * 参数 textBaseline 可选值：
    * - 'top': 顶部对齐;
    * - 'bottom': 底部对齐;
    * - 'middle': 居中对齐;
    * - 'normal': ; */
  textBaseline: middle
  ): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_normal(
    /** 文字的竖直对齐方式
    *
    * 参数 textBaseline 可选值：
    * - 'top': 顶部对齐;
    * - 'bottom': 底部对齐;
    * - 'middle': 居中对齐;
    * - 'normal': ; */
  textBaseline: normal
  ): Unit = js.native
  /** [CanvasContext.setTextBaseline(string textBaseline)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setTextBaseline.html)
  *
  * 设置文字的竖直对齐
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.moveTo(5, 75)
  ctx.lineTo(295, 75)
  ctx.stroke()
  ctx.setFontSize(20)
  ctx.setTextBaseline('top')
  ctx.fillText('top', 5, 75)
  ctx.setTextBaseline('middle')
  ctx.fillText('middle', 50, 75)
  ctx.setTextBaseline('bottom')
  ctx.fillText('bottom', 120, 75)
  ctx.setTextBaseline('normal')
  ctx.fillText('normal', 200, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/set-text-baseline.png)
  *
  * 最低基础库： `1.4.0` */
  @JSName("setTextBaseline")
  def setTextBaseline_top(
    /** 文字的竖直对齐方式
    *
    * 参数 textBaseline 可选值：
    * - 'top': 顶部对齐;
    * - 'bottom': 底部对齐;
    * - 'middle': 居中对齐;
    * - 'normal': ; */
  textBaseline: top
  ): Unit = js.native
  /** [CanvasContext.setTransform(number scaleX, number skewX, number skewY, number scaleY, number translateX, number translateY)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setTransform.html)
    *
    * 使用矩阵重新设置（覆盖）当前变换的方法
    *
    * 最低基础库： `1.9.90` */
  def setTransform(
    /** 水平缩放 */
  scaleX: Double,
    /** 水平倾斜 */
  skewX: Double,
    /** 垂直倾斜 */
  skewY: Double,
    /** 垂直缩放 */
  scaleY: Double,
    /** 水平移动 */
  translateX: Double,
    /** 垂直移动 */
  translateY: Double
  ): Unit = js.native
  /** [CanvasContext.stroke()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.stroke.html)
  *
  * 画出当前路径的边框。默认颜色色为黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.moveTo(10, 10)
  ctx.lineTo(100, 10)
  ctx.lineTo(100, 100)
  ctx.stroke()
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/stroke-line.png)
  *
  * stroke() 描绘的的路径是从 beginPath() 开始计算，但是不会将 strokeRect() 包含进去。
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  // begin path
  ctx.rect(10, 10, 100, 30)
  ctx.setStrokeStyle('yellow')
  ctx.stroke()
  // begin another path
  ctx.beginPath()
  ctx.rect(10, 40, 100, 30)
  // only stoke this rect, not in current path
  ctx.setStrokeStyle('blue')
  ctx.strokeRect(10, 70, 100, 30)
  ctx.rect(10, 100, 100, 30)
  // it will stroke current path
  ctx.setStrokeStyle('red')
  ctx.stroke()
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/stroke-path.png) */
  def stroke(): Unit = js.native
  /** [CanvasContext.strokeRect(number x, number y, number width, number height)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.strokeRect.html)
  *
  * 画一个矩形(非填充)。 用 [`setStrokeStyle`](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.setStrokeStyle.html) 设置矩形线条的颜色，如果没设置默认是黑色。
  *
  * **示例代码**
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.setStrokeStyle('red')
  ctx.strokeRect(10, 10, 150, 75)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/stroke-rect.png) */
  def strokeRect(
    /** 矩形路径左上角的横坐标 */
  x: Double,
    /** 矩形路径左上角的纵坐标 */
  y: Double,
    /** 矩形路径的宽度 */
  width: Double,
    /** 矩形路径的高度 */
  height: Double
  ): Unit = js.native
  /** [CanvasContext.strokeText(string text, number x, number y, number maxWidth)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.strokeText.html)
    *
    * 给定的 (x, y) 位置绘制文本描边的方法
    *
    * 最低基础库： `1.9.90` */
  def strokeText(/** 要绘制的文本 */
  text: String, /** 文本起始点的 x 轴坐标 */
  x: Double, /** 文本起始点的 y 轴坐标 */
  y: Double): Unit = js.native
  def strokeText(
    /** 要绘制的文本 */
  text: String,
    /** 文本起始点的 x 轴坐标 */
  x: Double,
    /** 文本起始点的 y 轴坐标 */
  y: Double,
    /** 需要绘制的最大宽度，可选 */
  maxWidth: Double
  ): Unit = js.native
  /** [CanvasContext.transform(number scaleX, number skewX, number skewY, number scaleY, number translateX, number translateY)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.transform.html)
    *
    * 使用矩阵多次叠加当前变换的方法
    *
    * 最低基础库： `1.9.90` */
  def transform(
    /** 水平缩放 */
  scaleX: Double,
    /** 水平倾斜 */
  skewX: Double,
    /** 垂直倾斜 */
  skewY: Double,
    /** 垂直缩放 */
  scaleY: Double,
    /** 水平移动 */
  translateX: Double,
    /** 垂直移动 */
  translateY: Double
  ): Unit = js.native
  /** [CanvasContext.translate(number x, number y)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.translate.html)
  *
  * 对当前坐标系的原点 (0, 0) 进行变换。默认的坐标系原点为页面左上角。
  *
  * **示例代码**
  *
  *
  *
  * ```javascript
  const ctx = wx.createCanvasContext('myCanvas')
  ctx.strokeRect(10, 10, 150, 100)
  ctx.translate(20, 20)
  ctx.strokeRect(10, 10, 150, 100)
  ctx.translate(20, 20)
  ctx.strokeRect(10, 10, 150, 100)
  ctx.draw()
  ```
  *
  * ![](@program/dev/image/canvas/translate.png) */
  def translate(/** 水平坐标平移量 */
  x: Double, /** 竖直坐标平移量 */
  y: Double): Unit = js.native
}


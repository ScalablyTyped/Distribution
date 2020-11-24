package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Canvas 实例，可通过 [SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) 获取。
  *
  * **示例代码**
  *
  *
  *
  * 2D Canvas 示例
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/SHfgCmmq7UcM)
  *
  * WebGL 示例
  * [在微信开发者工具中查看示例](https://developers.weixin.qq.com/s/qEGUOqmf7T8z)
  *
  * 最低基础库： `2.7.0` */
@js.native
trait Canvas extends js.Object {
  
  /** [Canvas.cancelAnimationFrame(number requestID)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.cancelAnimationFrame.html)
    *
    * 取消由 requestAnimationFrame 添加到计划中的动画帧请求。支持在 2D Canvas 和 WebGL Canvas 下使用, 但不支持混用 2D 和 WebGL 的方法。
    *
    * 最低基础库： `2.7.0` */
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  
  /** [[Image](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Image.html) Canvas.createImage()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.createImage.html)
    *
    * 创建一个图片对象。 支持在 2D Canvas 和 WebGL Canvas 下使用, 但不支持混用 2D 和 WebGL 的方法。
    *
    * 最低基础库： `2.7.0` */
  def createImage(): Image = js.native
  
  /** [[ImageData](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/ImageData.html) Canvas.createImageData()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.createImageData.html)
    *
    * 创建一个 ImageData 对象。仅支持在 2D Canvas 中使用。
    *
    * 最低基础库： `2.9.0` */
  def createImageData(): ImageData = js.native
  
  /** [[Path2D](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Path2D.html) Canvas.createPath2D([Path2D](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Path2D.html) path)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.createPath2D.html)
    *
    * 创建 Path2D 对象
    *
    * 最低基础库： `2.11.0` */
  def createPath2D(
    /** [Path2D](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Path2D.html)
    *
    *  */
  path: Path2D
  ): Path2D = js.native
  
  /** [[RenderingContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/RenderingContext.html) Canvas.getContext(string contextType)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.getContext.html)
    *
    * 该方法返回 Canvas 的绘图上下文
    *
    * ****
    *
    * 支持获取 2D 和 WebGL 绘图上下文
    *
    * 最低基础库： `2.7.0` */
  def getContext(contextType: String): js.Any = js.native
  
  /** 画布高度 */
  var height: Double = js.native
  
  /** [number Canvas.requestAnimationFrame(function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.requestAnimationFrame.html)
    *
    * 在下次进行重绘时执行。 支持在 2D Canvas 和 WebGL Canvas 下使用, 但不支持混用 2D 和 WebGL 的方法。
    *
    * 最低基础库： `2.7.0` */
  def requestAnimationFrame(/** 执行的 callback */
  callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  
  /** [string Canvas.toDataURL(string type, number encoderOptions)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Canvas.toDataURL.html)
    *
    * 返回一个包含图片展示的 data URI 。可以使用 type 参数其类型，默认为 PNG 格式。
    *
    * 最低基础库： `2.11.0` */
  def toDataURL(
    /** 图片格式，默认为 image/png */
  `type`: String,
    /** 在指定图片格式为 image/jpeg 或 image/webp的情况下，可以从 0 到 1 的区间内选择图片的质量。如果超出取值范围，将会使用默认值 0.92。其他参数会被忽略。 */
  encoderOptions: Double
  ): String = js.native
  
  /** 画布宽度 */
  var width: Double = js.native
}
object Canvas {
  
  @scala.inline
  def apply(
    cancelAnimationFrame: Double => Unit,
    createImage: () => Image,
    createImageData: () => ImageData,
    createPath2D: Path2D => Path2D,
    getContext: String => js.Any,
    height: Double,
    requestAnimationFrame: js.Function1[/* repeated */ js.Any, _] => Double,
    toDataURL: (String, Double) => String,
    width: Double
  ): Canvas = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), createImage = js.Any.fromFunction0(createImage), createImageData = js.Any.fromFunction0(createImageData), createPath2D = js.Any.fromFunction1(createPath2D), getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), toDataURL = js.Any.fromFunction2(toDataURL), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit class CanvasOps[Self <: Canvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancelAnimationFrame(value: Double => Unit): Self = this.set("cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateImage(value: () => Image): Self = this.set("createImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateImageData(value: () => ImageData): Self = this.set("createImageData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatePath2D(value: Path2D => Path2D): Self = this.set("createPath2D", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContext(value: String => js.Any): Self = this.set("getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAnimationFrame(value: js.Function1[/* repeated */ js.Any, _] => Double): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDataURL(value: (String, Double) => String): Self = this.set("toDataURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}

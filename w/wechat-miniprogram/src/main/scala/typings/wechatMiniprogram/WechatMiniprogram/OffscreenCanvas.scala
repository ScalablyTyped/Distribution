package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`2d`
import typings.wechatMiniprogram.wechatMiniprogramStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 离屏 canvas 实例，可通过 [wx.createOffscreenCanvas](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/wx.createOffscreenCanvas.html) 创建。
  *
  * 最低基础库： `2.7.0` */
trait OffscreenCanvas extends StObject {
  
  /** [[Image](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Image.html) OffscreenCanvas.createImage()](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/OffscreenCanvas.createImage.html)
    *
    * 创建一个图片对象。支持在 2D Canvas 和 WebGL Canvas 下使用, 但不支持混用 2D 和 WebGL 的方法。
    *
    * ****
    *
    * 注意不允许混用 webgl 和 2d 画布创建的图片对象，使用时请注意尽量使用 canvas 自身的 `createImage` 创建图片对象。
    *
    * 最低基础库： `2.7.3` */
  def createImage(): Image
  
  /** [[RenderingContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/RenderingContext.html) OffscreenCanvas.getContext(string contextType)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/OffscreenCanvas.getContext.html)
    *
    * 该方法返回 OffscreenCanvas 的绘图上下文
    *
    * ****
    *
    * 注意不允许混用 webgl 和 2d 绘图上下文，传入的 contextType 必须要与 `wx.createOffscreenCanvas` 传入的 type 类型一致。
    *
    * 最低基础库： `2.7.0` */
  def getContext(
    /** 绘图上下文类型，需要与 createOffscreenCanvas 时传入的 type 一致
    *
    * 参数 contextType 可选值：
    * - 'webgl': webgl类型上下文;
    * - '2d': 2d类型上下文; */
  contextType: webgl | `2d`
  ): Any
  
  /** 画布高度 */
  var height: Double
  
  /** 画布宽度 */
  var width: Double
}
object OffscreenCanvas {
  
  inline def apply(createImage: () => Image, getContext: webgl | `2d` => Any, height: Double, width: Double): OffscreenCanvas = {
    val __obj = js.Dynamic.literal(createImage = js.Any.fromFunction0(createImage), getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffscreenCanvas]
  }
  
  extension [Self <: OffscreenCanvas](x: Self) {
    
    inline def setCreateImage(value: () => Image): Self = StObject.set(x, "createImage", js.Any.fromFunction0(value))
    
    inline def setGetContext(value: webgl | `2d` => Any): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

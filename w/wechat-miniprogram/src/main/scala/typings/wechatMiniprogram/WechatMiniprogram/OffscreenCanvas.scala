package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvas extends StObject {
  
  /** [[RenderingContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/RenderingContext.html) OffscreenCanvas.getContext(string contextType)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/OffscreenCanvas.getContext.html)
    *
    * 该方法返回 OffscreenCanvas 的绘图上下文
    *
    * ****
    *
    * 当前仅支持获取 WebGL 绘图上下文
    *
    * 最低基础库： `2.7.0` */
  def getContext(contextType: String): js.Any = js.native
}
object OffscreenCanvas {
  
  @scala.inline
  def apply(getContext: String => js.Any): OffscreenCanvas = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext))
    __obj.asInstanceOf[OffscreenCanvas]
  }
  
  @scala.inline
  implicit class OffscreenCanvasMutableBuilder[Self <: OffscreenCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContext(value: String => js.Any): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
  }
}

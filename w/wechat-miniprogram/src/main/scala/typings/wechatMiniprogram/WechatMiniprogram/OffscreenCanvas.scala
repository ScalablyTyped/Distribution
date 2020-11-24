package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffscreenCanvas extends js.Object {
  
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
  implicit class OffscreenCanvasOps[Self <: OffscreenCanvas] (val x: Self) extends AnyVal {
    
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
    def setGetContext(value: String => js.Any): Self = this.set("getContext", js.Any.fromFunction1(value))
  }
}

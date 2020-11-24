package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaQueryObserver extends js.Object {
  
  /** [MediaQueryObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.disconnect.html)
    *
    * 停止监听。回调函数将不再触发 */
  def disconnect(): Unit = js.native
  
  /** [MediaQueryObserver.observe(Object descriptor, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.observe.html)
    *
    * 开始监听页面 media query 变化情况 */
  def observe(
    /** media query 描述符 */
  descriptor: ObserveDescriptor,
    /** 监听 media query 状态变化的回调函数 */
  callback: MediaQueryObserverObserveCallback
  ): Unit = js.native
}
object MediaQueryObserver {
  
  @scala.inline
  def apply(disconnect: () => Unit, observe: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Unit): MediaQueryObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction2(observe))
    __obj.asInstanceOf[MediaQueryObserver]
  }
  
  @scala.inline
  implicit class MediaQueryObserverOps[Self <: MediaQueryObserver] (val x: Self) extends AnyVal {
    
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObserve(value: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Unit): Self = this.set("observe", js.Any.fromFunction2(value))
  }
}

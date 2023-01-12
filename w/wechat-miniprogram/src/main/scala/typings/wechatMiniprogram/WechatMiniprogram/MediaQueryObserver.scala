package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryObserver extends StObject {
  
  /** [MediaQueryObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.disconnect.html)
    *
    * 停止监听。回调函数将不再触发 */
  def disconnect(): Unit
  
  /** [MediaQueryObserver.observe(Object descriptor, function callback)](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/MediaQueryObserver.observe.html)
    *
    * 开始监听页面 media query 变化情况 */
  def observe(
    /** media query 描述符 */
  descriptor: ObserveDescriptor,
    /** 监听 media query 状态变化的回调函数 */
  callback: MediaQueryObserverObserveCallback
  ): Unit
}
object MediaQueryObserver {
  
  inline def apply(disconnect: () => Unit, observe: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Unit): MediaQueryObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction2(observe))
    __obj.asInstanceOf[MediaQueryObserver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaQueryObserver] (val x: Self) extends AnyVal {
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setObserve(value: (ObserveDescriptor, MediaQueryObserverObserveCallback) => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction2(value))
  }
}

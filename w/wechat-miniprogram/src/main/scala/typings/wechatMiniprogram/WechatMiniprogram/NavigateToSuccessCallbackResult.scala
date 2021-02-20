package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToSuccessCallbackResult extends StObject {
  
  var errMsg: String = js.native
  
  /** [EventChannel](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.html)
    *
    * 和被打开页面进行通信 */
  var eventChannel: EventChannel = js.native
}
object NavigateToSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, eventChannel: EventChannel): NavigateToSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], eventChannel = eventChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class NavigateToSuccessCallbackResultMutableBuilder[Self <: NavigateToSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventChannel(value: EventChannel): Self = StObject.set(x, "eventChannel", value.asInstanceOf[js.Any])
  }
}

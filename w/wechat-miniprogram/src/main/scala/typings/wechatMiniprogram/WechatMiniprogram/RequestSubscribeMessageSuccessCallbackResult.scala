package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSubscribeMessageSuccessCallbackResult extends StObject {
  
  /** [TEMPLATE_ID]是动态的键，即模板id，值包括'accept'、'reject'、'ban'。'accept'表示用户同意订阅该条id对应的模板消息，'reject'表示用户拒绝订阅该条id对应的模板消息，'ban'表示已被后台封禁。例如 { errMsg: "requestSubscribeMessage:ok", zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: "accept"} 表示用户同意订阅zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE这条消息 */
  var TEMPLATE_ID: String = js.native
  
  /** 接口调用成功时errMsg值为'requestSubscribeMessage:ok' */
  var errMsg: String = js.native
}
object RequestSubscribeMessageSuccessCallbackResult {
  
  @scala.inline
  def apply(TEMPLATE_ID: String, errMsg: String): RequestSubscribeMessageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(TEMPLATE_ID = TEMPLATE_ID.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSubscribeMessageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class RequestSubscribeMessageSuccessCallbackResultMutableBuilder[Self <: RequestSubscribeMessageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEMPLATE_ID(value: String): Self = StObject.set(x, "TEMPLATE_ID", value.asInstanceOf[js.Any])
  }
}

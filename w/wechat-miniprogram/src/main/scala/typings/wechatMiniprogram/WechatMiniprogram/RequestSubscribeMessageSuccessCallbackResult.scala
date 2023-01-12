package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSubscribeMessageSuccessCallbackResult
  extends StObject
     with /** [TEMPLATE_ID]是动态的键，即模板id，值包括'accept'、'reject'、'ban'、'filter'。'accept'表示用户同意订阅该条id对应的模板消息，'reject'表示用户拒绝订阅该条id对应的模板消息，'ban'表示已被后台封禁，'filter'表示该模板因为模板标题同名被后台过滤。例如 { errMsg: "requestSubscribeMessage:ok", zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: "accept"} 表示用户同意订阅zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE这条消息 */
/* TEMPLATE_ID */ StringDictionary[String] {
  
  /** 接口调用成功时errMsg值为'requestSubscribeMessage:ok' */
  var errMsg: String
}
object RequestSubscribeMessageSuccessCallbackResult {
  
  inline def apply(errMsg: String): RequestSubscribeMessageSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSubscribeMessageSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestSubscribeMessageSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}

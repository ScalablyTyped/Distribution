package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinVoIPChatSuccessCallbackResult extends StObject {
  
  /** 错误码 */
  var errCode: Double
  
  /** 调用结果 */
  var errMsg: String
  
  /** 在此通话中的成员 openId 名单 */
  var openIdList: js.Array[String]
}
object JoinVoIPChatSuccessCallbackResult {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): JoinVoIPChatSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinVoIPChatSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class JoinVoIPChatSuccessCallbackResultMutableBuilder[Self <: JoinVoIPChatSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value :_*))
  }
}

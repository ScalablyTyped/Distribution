package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnVoIPChatStateChangedCallbackResult extends StObject {
  
  /** 事件码 */
  var code: Double
  
  /** 附加信息 */
  var data: IAnyObject
  
  /** 错误码 */
  var errCode: Double
  
  /** 调用结果 */
  var errMsg: String
}
object OnVoIPChatStateChangedCallbackResult {
  
  inline def apply(code: Double, data: IAnyObject, errCode: Double, errMsg: String): OnVoIPChatStateChangedCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVoIPChatStateChangedCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnVoIPChatStateChangedCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}

package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSubscribeMessageFailCallbackResult extends StObject {
  
  /** 接口调用失败错误码 */
  var errCode: Double
  
  /** 接口调用失败错误信息 */
  var errMsg: String
}
object RequestSubscribeMessageFailCallbackResult {
  
  inline def apply(errCode: Double, errMsg: String): RequestSubscribeMessageFailCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSubscribeMessageFailCallbackResult]
  }
  
  extension [Self <: RequestSubscribeMessageFailCallbackResult](x: Self) {
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}

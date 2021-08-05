package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSoterAuthenticationRes extends StObject {
  
  /**
    * 生物认证方式
    */
  var authMode: js.UndefOr[String] = js.undefined
  
  /**
    * 错误码
    */
  var errCode: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 在设备安全区域（TEE）内获得的本机安全信息以及本次认证信息
    */
  var resultJSON: js.UndefOr[String] = js.undefined
}
object StartSoterAuthenticationRes {
  
  inline def apply(): StartSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationRes]
  }
  
  extension [Self <: StartSoterAuthenticationRes](x: Self) {
    
    inline def setAuthMode(value: String): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrCodeUndefined: Self = StObject.set(x, "errCode", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setResultJSON(value: String): Self = StObject.set(x, "resultJSON", value.asInstanceOf[js.Any])
    
    inline def setResultJSONUndefined: Self = StObject.set(x, "resultJSON", js.undefined)
  }
}

package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthMode extends StObject {
  
  // 错误码
  var authMode: String
  
  var errCode: Double
  
  // 用SOTER安全密钥对result_json的签名(SHA256withRSA / PSS, saltlen = 20)
  var errMsg: String
  
  // 生物认证方式
  var resultJSON: String
  
  // 在设备安全区域（TEE）内获得的本机安全信息（如TEE名称版本号等以及防重放参数）以及本次认证信息（仅Android支持，本次认证的指纹ID）（仅Android支持，本次认证的指纹ID）
  var resultJSONSignature: String
}
object AuthMode {
  
  inline def apply(authMode: String, errCode: Double, errMsg: String, resultJSON: String, resultJSONSignature: String): AuthMode = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], resultJSON = resultJSON.asInstanceOf[js.Any], resultJSONSignature = resultJSONSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMode]
  }
  
  extension [Self <: AuthMode](x: Self) {
    
    inline def setAuthMode(value: String): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setResultJSON(value: String): Self = StObject.set(x, "resultJSON", value.asInstanceOf[js.Any])
    
    inline def setResultJSONSignature(value: String): Self = StObject.set(x, "resultJSONSignature", value.asInstanceOf[js.Any])
  }
}

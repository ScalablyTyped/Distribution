package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthMode extends StObject {
  
  // 错误码
  var authMode: String = js.native
  
  var errCode: Double = js.native
  
  // 用SOTER安全密钥对result_json的签名(SHA256withRSA / PSS, saltlen = 20)
  var errMsg: String = js.native
  
  // 生物认证方式
  var resultJSON: String = js.native
  
  // 在设备安全区域（TEE）内获得的本机安全信息（如TEE名称版本号等以及防重放参数）以及本次认证信息（仅Android支持，本次认证的指纹ID）（仅Android支持，本次认证的指纹ID）
  var resultJSONSignature: String = js.native
}
object AuthMode {
  
  @scala.inline
  def apply(authMode: String, errCode: Double, errMsg: String, resultJSON: String, resultJSONSignature: String): AuthMode = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], resultJSON = resultJSON.asInstanceOf[js.Any], resultJSONSignature = resultJSONSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthMode]
  }
  
  @scala.inline
  implicit class AuthModeMutableBuilder[Self <: AuthMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthMode(value: String): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultJSON(value: String): Self = StObject.set(x, "resultJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultJSONSignature(value: String): Self = StObject.set(x, "resultJSONSignature", value.asInstanceOf[js.Any])
  }
}

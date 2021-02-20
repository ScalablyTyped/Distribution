package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSoterAuthenticationRes extends StObject {
  
  /**
    * 生物认证方式
    */
  var authMode: js.UndefOr[String] = js.native
  
  /**
    * 错误码
    */
  var errCode: js.UndefOr[Double] = js.native
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 在设备安全区域（TEE）内获得的本机安全信息以及本次认证信息
    */
  var resultJSON: js.UndefOr[String] = js.native
}
object StartSoterAuthenticationRes {
  
  @scala.inline
  def apply(): StartSoterAuthenticationRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationRes]
  }
  
  @scala.inline
  implicit class StartSoterAuthenticationResMutableBuilder[Self <: StartSoterAuthenticationRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthMode(value: String): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrCodeUndefined: Self = StObject.set(x, "errCode", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setResultJSON(value: String): Self = StObject.set(x, "resultJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultJSONUndefined: Self = StObject.set(x, "resultJSON", js.undefined)
  }
}

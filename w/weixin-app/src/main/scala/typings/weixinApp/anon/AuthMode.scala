package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthMode extends js.Object {
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
  implicit class AuthModeOps[Self <: AuthMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthMode(value: String): Self = this.set("authMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultJSON(value: String): Self = this.set("resultJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultJSONSignature(value: String): Self = this.set("resultJSONSignature", value.asInstanceOf[js.Any])
  }
  
}


package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthMode extends js.Object {
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

object AnonAuthMode {
  @scala.inline
  def apply(authMode: String, errCode: Double, errMsg: String, resultJSON: String, resultJSONSignature: String): AnonAuthMode = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], resultJSON = resultJSON.asInstanceOf[js.Any], resultJSONSignature = resultJSONSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthMode]
  }
}


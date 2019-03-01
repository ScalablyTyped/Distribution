package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthMode extends js.Object {
   // 错误码
  var authMode: java.lang.String
  var errCode: scala.Double
   // 用SOTER安全密钥对result_json的签名(SHA256withRSA / PSS, saltlen = 20)
  var errMsg: java.lang.String
   // 生物认证方式
  var resultJSON: java.lang.String
   // 在设备安全区域（TEE）内获得的本机安全信息（如TEE名称版本号等以及防重放参数）以及本次认证信息（仅Android支持，本次认证的指纹ID）（仅Android支持，本次认证的指纹ID）
  var resultJSONSignature: java.lang.String
}

object Anon_AuthMode {
  @scala.inline
  def apply(
    authMode: java.lang.String,
    errCode: scala.Double,
    errMsg: java.lang.String,
    resultJSON: java.lang.String,
    resultJSONSignature: java.lang.String
  ): Anon_AuthMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authMode")(authMode)
    __obj.updateDynamic("errCode")(errCode)
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("resultJSON")(resultJSON)
    __obj.updateDynamic("resultJSONSignature")(resultJSONSignature)
    __obj.asInstanceOf[Anon_AuthMode]
  }
}


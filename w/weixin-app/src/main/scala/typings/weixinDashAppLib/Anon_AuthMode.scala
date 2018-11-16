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


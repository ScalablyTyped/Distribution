package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedData extends js.Object {
   // 调用结果
  var encryptedData: java.lang.String
  var errMsg: java.lang.String
   // 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
  var iv: java.lang.String
}

object Anon_EncryptedData {
  @scala.inline
  def apply(encryptedData: java.lang.String, errMsg: java.lang.String, iv: java.lang.String): Anon_EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData, errMsg = errMsg, iv = iv)
  
    __obj.asInstanceOf[Anon_EncryptedData]
  }
}


package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
   // 调用结果
  var encryptedData: String
  var errMsg: String
   // 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
  var iv: String
}

object EncryptedData {
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedData]
  }
}


package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedDataErrMsg extends js.Object {
  /**
    * 包括敏感数据在内的完整转发信息的加密数据
    */
  var encryptedData: String
  /**
    * 错误信息
    */
  var errMsg: String
  /**
    * 加密算法的初始向量
    */
  var iv: String
}

object Anon_EncryptedDataErrMsg {
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): Anon_EncryptedDataErrMsg = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncryptedDataErrMsg]
  }
}


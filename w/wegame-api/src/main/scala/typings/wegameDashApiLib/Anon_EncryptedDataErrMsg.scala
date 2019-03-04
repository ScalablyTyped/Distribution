package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedDataErrMsg extends js.Object {
  /**
    * 包括敏感数据在内的完整转发信息的加密数据
    */
  var encryptedData: java.lang.String
  /**
    * 错误信息
    */
  var errMsg: java.lang.String
  /**
    * 加密算法的初始向量
    */
  var iv: java.lang.String
}

object Anon_EncryptedDataErrMsg {
  @scala.inline
  def apply(encryptedData: java.lang.String, errMsg: java.lang.String, iv: java.lang.String): Anon_EncryptedDataErrMsg = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData, errMsg = errMsg, iv = iv)
  
    __obj.asInstanceOf[Anon_EncryptedDataErrMsg]
  }
}


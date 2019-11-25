package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedData extends js.Object {
  var encryptedData: String
  var errMsg: String
  var iv: String
}

object Anon_EncryptedData {
  @scala.inline
  def apply(encryptedData: String, errMsg: String, iv: String): Anon_EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncryptedData]
  }
}


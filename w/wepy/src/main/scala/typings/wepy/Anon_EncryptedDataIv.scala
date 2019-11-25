package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedDataIv extends js.Object {
  var encryptedData: String
  var iv: String
  var rawData: String
  var signature: String
  var userInfo: js.Object
}

object Anon_EncryptedDataIv {
  @scala.inline
  def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: js.Object): Anon_EncryptedDataIv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EncryptedDataIv]
  }
}


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
    val __obj = js.Dynamic.literal(encryptedData = encryptedData, iv = iv, rawData = rawData, signature = signature, userInfo = userInfo)
  
    __obj.asInstanceOf[Anon_EncryptedDataIv]
  }
}


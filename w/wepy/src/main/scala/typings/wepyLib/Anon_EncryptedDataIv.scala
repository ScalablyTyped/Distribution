package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptedDataIv extends js.Object {
  var encryptedData: java.lang.String
  var iv: java.lang.String
  var rawData: java.lang.String
  var signature: java.lang.String
  var userInfo: js.Object
}

object Anon_EncryptedDataIv {
  @scala.inline
  def apply(
    encryptedData: java.lang.String,
    iv: java.lang.String,
    rawData: java.lang.String,
    signature: java.lang.String,
    userInfo: js.Object
  ): Anon_EncryptedDataIv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData, iv = iv, rawData = rawData, signature = signature, userInfo = userInfo)
  
    __obj.asInstanceOf[Anon_EncryptedDataIv]
  }
}


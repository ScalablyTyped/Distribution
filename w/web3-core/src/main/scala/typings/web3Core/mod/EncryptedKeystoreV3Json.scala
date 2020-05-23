package typings.web3Core.mod

import typings.web3Core.anon.Cipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedKeystoreV3Json extends js.Object {
  var address: String
  var crypto: Cipher
  var id: String
  var version: Double
}

object EncryptedKeystoreV3Json {
  @scala.inline
  def apply(address: String, crypto: Cipher, id: String, version: Double): EncryptedKeystoreV3Json = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedKeystoreV3Json]
  }
}


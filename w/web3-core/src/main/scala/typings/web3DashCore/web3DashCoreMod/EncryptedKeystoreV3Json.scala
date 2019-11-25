package typings.web3DashCore.web3DashCoreMod

import typings.web3DashCore.Anon_Cipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedKeystoreV3Json extends js.Object {
  var address: String
  var crypto: Anon_Cipher
  var id: String
  var version: Double
}

object EncryptedKeystoreV3Json {
  @scala.inline
  def apply(address: String, crypto: Anon_Cipher, id: String, version: Double): EncryptedKeystoreV3Json = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptedKeystoreV3Json]
  }
}


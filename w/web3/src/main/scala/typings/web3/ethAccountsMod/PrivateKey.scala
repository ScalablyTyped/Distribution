package typings.web3.ethAccountsMod

import typings.web3.Anon_Cipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKey extends js.Object {
  var address: String
  var crypto: Anon_Cipher
  var id: String
  var version: Double
}

object PrivateKey {
  @scala.inline
  def apply(address: String, crypto: Anon_Cipher, id: String, version: Double): PrivateKey = {
    val __obj = js.Dynamic.literal(address = address, crypto = crypto, id = id, version = version)
  
    __obj.asInstanceOf[PrivateKey]
  }
}


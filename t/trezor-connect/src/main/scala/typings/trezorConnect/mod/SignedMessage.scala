package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessage extends js.Object {
  var address: String
      // signer address
  var signature: String
}

object SignedMessage {
  @scala.inline
  def apply(address: String, signature: String): SignedMessage = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessage]
  }
}


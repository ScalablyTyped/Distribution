package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessage extends js.Object {
  var address: java.lang.String
      // signer address
  var signature: java.lang.String
}

object SignedMessage {
  @scala.inline
  def apply(address: java.lang.String, signature: java.lang.String): SignedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignedMessage]
  }
}


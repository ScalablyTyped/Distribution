package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionID extends js.Object {
  var txid: String
}

object TransactionID {
  @scala.inline
  def apply(txid: String): TransactionID = {
    val __obj = js.Dynamic.literal(txid = txid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionID]
  }
}


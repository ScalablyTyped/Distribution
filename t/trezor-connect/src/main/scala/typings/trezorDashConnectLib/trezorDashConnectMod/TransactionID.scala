package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionID extends js.Object {
  var txid: java.lang.String
}

object TransactionID {
  @scala.inline
  def apply(txid: java.lang.String): TransactionID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("txid")(txid)
    __obj.asInstanceOf[TransactionID]
  }
}


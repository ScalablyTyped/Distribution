package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
    // signer signatures
  var serializedTx: java.lang.String
  var signatures: js.Array[java.lang.String]
    // serialized transaction
  var txid: js.UndefOr[java.lang.String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    serializedTx: java.lang.String,
    signatures: js.Array[java.lang.String],
    txid: java.lang.String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx, signatures = signatures)
    if (txid != null) __obj.updateDynamic("txid")(txid)
    __obj.asInstanceOf[Transaction]
  }
}


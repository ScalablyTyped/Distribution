package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
    // signer signatures
  var serializedTx: String
  var signatures: js.Array[String]
    // serialized transaction
  var txid: js.UndefOr[String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String], txid: String = null): Transaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    if (txid != null) __obj.updateDynamic("txid")(txid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}


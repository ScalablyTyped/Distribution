package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedTransaction extends js.Object {
  var serializedTx: String
  var signatures: js.Array[String]
  var txId: js.UndefOr[String] = js.undefined
}

object SignedTransaction {
  @scala.inline
  def apply(serializedTx: String, signatures: js.Array[String], txId: String = null): SignedTransaction = {
    val __obj = js.Dynamic.literal(serializedTx = serializedTx, signatures = signatures)
    if (txId != null) __obj.updateDynamic("txId")(txId)
    __obj.asInstanceOf[SignedTransaction]
  }
}


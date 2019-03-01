package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedTransaction extends js.Object {
  var serializedTx: java.lang.String
  var signatures: js.Array[java.lang.String]
  var txId: js.UndefOr[java.lang.String] = js.undefined
}

object SignedTransaction {
  @scala.inline
  def apply(
    serializedTx: java.lang.String,
    signatures: js.Array[java.lang.String],
    txId: java.lang.String = null
  ): SignedTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serializedTx")(serializedTx)
    __obj.updateDynamic("signatures")(signatures)
    if (txId != null) __obj.updateDynamic("txId")(txId)
    __obj.asInstanceOf[SignedTransaction]
  }
}


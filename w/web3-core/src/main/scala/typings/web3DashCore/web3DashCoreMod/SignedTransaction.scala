package typings.web3DashCore.web3DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedTransaction extends js.Object {
  var messageHash: js.UndefOr[String] = js.undefined
  var r: String
  var rawTransaction: js.UndefOr[String] = js.undefined
  var s: String
  var transactionHash: js.UndefOr[String] = js.undefined
  var v: String
}

object SignedTransaction {
  @scala.inline
  def apply(
    r: String,
    s: String,
    v: String,
    messageHash: String = null,
    rawTransaction: String = null,
    transactionHash: String = null
  ): SignedTransaction = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (messageHash != null) __obj.updateDynamic("messageHash")(messageHash.asInstanceOf[js.Any])
    if (rawTransaction != null) __obj.updateDynamic("rawTransaction")(rawTransaction.asInstanceOf[js.Any])
    if (transactionHash != null) __obj.updateDynamic("transactionHash")(transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedTransaction]
  }
}


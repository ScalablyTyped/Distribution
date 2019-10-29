package typings.web3DashEthDashAccounts.web3DashEthDashAccountsMod

import typings.web3DashCore.web3DashCoreMod.SignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sign extends SignedTransaction {
  var message: String
  var signature: String
}

object Sign {
  @scala.inline
  def apply(
    message: String,
    r: String,
    s: String,
    signature: String,
    v: String,
    messageHash: String = null,
    rawTransaction: String = null,
    transactionHash: String = null
  ): Sign = {
    val __obj = js.Dynamic.literal(message = message, r = r, s = s, signature = signature, v = v)
    if (messageHash != null) __obj.updateDynamic("messageHash")(messageHash)
    if (rawTransaction != null) __obj.updateDynamic("rawTransaction")(rawTransaction)
    if (transactionHash != null) __obj.updateDynamic("transactionHash")(transactionHash)
    __obj.asInstanceOf[Sign]
  }
}


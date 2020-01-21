package typings.web3EthAccounts.mod

import typings.web3Core.mod.SignedTransaction
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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (messageHash != null) __obj.updateDynamic("messageHash")(messageHash.asInstanceOf[js.Any])
    if (rawTransaction != null) __obj.updateDynamic("rawTransaction")(rawTransaction.asInstanceOf[js.Any])
    if (transactionHash != null) __obj.updateDynamic("transactionHash")(transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sign]
  }
}


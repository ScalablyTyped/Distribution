package typings
package stripeLib.stripeMod.transferReversalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversal
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * Amount reversed, in cents/pence.
    */
  var amount: scala.Double
  /**
    * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: java.lang.String
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * Value is 'transfer_reversal'
    */
  @JSName("object")
  var object_IReversal: stripeLib.stripeLibStrings.transfer_reversal
  /**
    * ID of the transfer that was reversed. [Expandable]
    */
  var transfer: java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer
}

object IReversal {
  @scala.inline
  def apply(
    amount: scala.Double,
    balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.transfer_reversal,
    transfer: java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer
  ): IReversal = {
    val __obj = js.Dynamic.literal(amount = amount, balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created, currency = currency, id = id, metadata = metadata, transfer = transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IReversal]
  }
}


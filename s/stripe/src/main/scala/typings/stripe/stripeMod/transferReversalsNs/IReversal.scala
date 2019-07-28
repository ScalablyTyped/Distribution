package typings.stripe.stripeMod.transferReversalsNs

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.balanceNs.IBalanceTransaction
import typings.stripe.stripeMod.transfersNs.ITransfer
import typings.stripe.stripeStrings.transfer_reversal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversal extends IResourceObject {
  /**
    * Amount reversed, in cents/pence.
    */
  var amount: Double
  /**
    * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String
  var metadata: IMetadata
  /**
    * Value is 'transfer_reversal'
    */
  @JSName("object")
  var object_IReversal: transfer_reversal
  /**
    * ID of the transfer that was reversed. [Expandable]
    */
  var transfer: String | ITransfer
}

object IReversal {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    id: String,
    metadata: IMetadata,
    `object`: transfer_reversal,
    transfer: String | ITransfer
  ): IReversal = {
    val __obj = js.Dynamic.literal(amount = amount, balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created, currency = currency, id = id, metadata = metadata, transfer = transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IReversal]
  }
}


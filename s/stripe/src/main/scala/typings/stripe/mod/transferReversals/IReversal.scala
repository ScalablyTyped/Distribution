package typings.stripe.mod.transferReversals

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.transfers.ITransfer
import typings.stripe.stripeStrings.transfer_reversal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReversal extends IResourceObject {
  /**
    * Amount reversed, in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is 'transfer_reversal'
    */
  @JSName("object")
  var object_IReversal: transfer_reversal = js.native
  /**
    * ID of the transfer that was reversed. [Expandable]
    */
  var transfer: String | ITransfer = js.native
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
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], transfer = transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReversal]
  }
  @scala.inline
  implicit class IReversalOps[Self <: IReversal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transaction(value: String | IBalanceTransaction): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: transfer_reversal): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer(value: String | ITransfer): Self = this.set("transfer", value.asInstanceOf[js.Any])
  }
  
}


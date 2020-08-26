package typings.stripe.mod.refunds

import typings.stripe.mod.IMetadata
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.charges.ICharge
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.expired_or_canceled_card
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.lost_or_stolen_card
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefund extends js.Object {
  /**
    * Amount in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact of this reversal on your account balance.
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * ID of the charge that was refunded. [Expandable]
    */
  var charge: String | ICharge = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency in which the charge was made.
    */
  var currency: String = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * If the refund failed, the reason for refund failure if known.
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.native
  var id: String = js.native
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * Value is 'refund'
    */
  var `object`: String = js.native
  /**
    * Reason for the refund. If set, possible values are "duplicate", "fraudulent", and "requested_by_customer".
    */
  var reason: String = js.native
  /**
    * This is the transaction number that appears on email receipts sent for this refund.
    */
  var receipt_number: String = js.native
  /**
    * The transfer reversal that is associated with the refund. Only present if the charge
    * came from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer_reversal: js.UndefOr[String | Null] = js.native
  /**
    * Status of the refund. For credit card refunds, this can be succeeded or failed.
    * For other types of refunds, it can be pending, succeeded, failed, or canceled.
    */
  var status: pending | succeeded | failed | canceled = js.native
  /**
    * If the accompanying transfer was reversed, the transfer reversal object. Only
    * applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: js.UndefOr[String | Null] = js.native
}

object IRefund {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    charge: String | ICharge,
    created: Double,
    currency: String,
    id: String,
    metadata: IMetadata,
    `object`: String,
    reason: String,
    receipt_number: String,
    status: pending | succeeded | failed | canceled
  ): IRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefund]
  }
  @scala.inline
  implicit class IRefundOps[Self <: IRefund] (val x: Self) extends AnyVal {
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
    def setCharge(value: String | ICharge): Self = this.set("charge", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_number(value: String): Self = this.set("receipt_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: pending | succeeded | failed | canceled): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = this.set("failure_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailure_reason: Self = this.set("failure_reason", js.undefined)
    @scala.inline
    def setSource_transfer_reversal(value: String): Self = this.set("source_transfer_reversal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_transfer_reversal: Self = this.set("source_transfer_reversal", js.undefined)
    @scala.inline
    def setSource_transfer_reversalNull: Self = this.set("source_transfer_reversal", null)
    @scala.inline
    def setTransfer_reversal(value: String): Self = this.set("transfer_reversal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_reversal: Self = this.set("transfer_reversal", js.undefined)
    @scala.inline
    def setTransfer_reversalNull: Self = this.set("transfer_reversal", null)
  }
  
}


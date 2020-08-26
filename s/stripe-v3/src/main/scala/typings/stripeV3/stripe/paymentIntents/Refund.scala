package typings.stripeV3.stripe.paymentIntents

import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripeV3Strings.canceled
import typings.stripeV3.stripeV3Strings.duplicate
import typings.stripeV3.stripeV3Strings.expired_or_canceled_card
import typings.stripeV3.stripeV3Strings.failed
import typings.stripeV3.stripeV3Strings.fraudulent
import typings.stripeV3.stripeV3Strings.lost_or_stolen_card
import typings.stripeV3.stripeV3Strings.pending
import typings.stripeV3.stripeV3Strings.refund
import typings.stripeV3.stripeV3Strings.requested_by_customer
import typings.stripeV3.stripeV3Strings.succeeded
import typings.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refund extends js.Object {
  /**
    * Refund amount, in cents.
    */
  var amount: Double = js.native
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | Null = js.native
  /**
    * ID of the charge that was refunded.
    */
  var charge: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. (Available on non-card refunds only)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If the refund failed, this balance transaction describes the
    * adjustment made on your account balance that reverses the
    * initial balance transaction.
    */
  var failure_balance_transaction: js.UndefOr[String] = js.native
  /**
    * If the refund failed, the reason for refund failure if known
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.native
  /**
    * Unique identifier for the object.
    */
  var id: String = js.native
  var metadata: Metadata = js.native
  /**
    * Value is "refund"
    */
  var `object`: refund = js.native
  /**
    * Reason for the refund
    */
  var reason: duplicate | fraudulent | requested_by_customer | Null = js.native
  /**
    * This is the transaction number that appears on email
    * receipts sent for this refund.
    */
  var receipt_number: String | Null = js.native
  /**
    * The transfer reversal that is associated with the refund.
    * Only present if the charge came from another Stripe account.
    * See the Connect documentation for details.
    */
  var source_transfer_reversal: String | Null = js.native
  /**
    * Status of the refund. For credit card refunds, this can be
    * pending, succeeded, or failed. For other types of refunds,
    * it can be pending, succeeded, failed, or canceled. Refer to
    * our refunds documentation for more details.
    */
  var status: pending | succeeded | failed | canceled = js.native
  /**
    * If the accompanying transfer was reversed, the transfer reversal object.
    * Only applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: String | Null = js.native
}

object Refund {
  @scala.inline
  def apply(
    amount: Double,
    charge: String,
    created: Double,
    currency: String,
    id: String,
    metadata: Metadata,
    `object`: refund,
    status: pending | succeeded | failed | canceled
  ): Refund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  @scala.inline
  implicit class RefundOps[Self <: Refund] (val x: Self) extends AnyVal {
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
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: refund): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: pending | succeeded | failed | canceled): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transaction(value: String): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transactionNull: Self = this.set("balance_transaction", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFailure_balance_transaction(value: String): Self = this.set("failure_balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailure_balance_transaction: Self = this.set("failure_balance_transaction", js.undefined)
    @scala.inline
    def setFailure_reason(value: lost_or_stolen_card | expired_or_canceled_card | unknown_): Self = this.set("failure_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailure_reason: Self = this.set("failure_reason", js.undefined)
    @scala.inline
    def setReason(value: duplicate | fraudulent | requested_by_customer): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonNull: Self = this.set("reason", null)
    @scala.inline
    def setReceipt_number(value: String): Self = this.set("receipt_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_numberNull: Self = this.set("receipt_number", null)
    @scala.inline
    def setSource_transfer_reversal(value: String): Self = this.set("source_transfer_reversal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_transfer_reversalNull: Self = this.set("source_transfer_reversal", null)
    @scala.inline
    def setTransfer_reversal(value: String): Self = this.set("transfer_reversal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransfer_reversalNull: Self = this.set("transfer_reversal", null)
  }
  
}


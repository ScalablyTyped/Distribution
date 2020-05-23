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

trait Refund extends js.Object {
  /**
    * Refund amount, in cents.
    */
  var amount: Double
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: String | Null
  /**
    * ID of the charge that was refunded.
    */
  var charge: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. (Available on non-card refunds only)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * If the refund failed, this balance transaction describes the
    * adjustment made on your account balance that reverses the
    * initial balance transaction.
    */
  var failure_balance_transaction: js.UndefOr[String] = js.undefined
  /**
    * If the refund failed, the reason for refund failure if known
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.undefined
  /**
    * Unique identifier for the object.
    */
  var id: String
  var metadata: Metadata
  /**
    * Value is "refund"
    */
  var `object`: refund
  /**
    * Reason for the refund
    */
  var reason: duplicate | fraudulent | requested_by_customer | Null
  /**
    * This is the transaction number that appears on email
    * receipts sent for this refund.
    */
  var receipt_number: String | Null
  /**
    * The transfer reversal that is associated with the refund.
    * Only present if the charge came from another Stripe account.
    * See the Connect documentation for details.
    */
  var source_transfer_reversal: String | Null
  /**
    * Status of the refund. For credit card refunds, this can be
    * pending, succeeded, or failed. For other types of refunds,
    * it can be pending, succeeded, failed, or canceled. Refer to
    * our refunds documentation for more details.
    */
  var status: pending | succeeded | failed | canceled
  /**
    * If the accompanying transfer was reversed, the transfer reversal object.
    * Only applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: String | Null
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
    status: pending | succeeded | failed | canceled,
    balance_transaction: String = null,
    description: String = null,
    failure_balance_transaction: String = null,
    failure_reason: lost_or_stolen_card | expired_or_canceled_card | unknown_ = null,
    reason: duplicate | fraudulent | requested_by_customer = null,
    receipt_number: String = null,
    source_transfer_reversal: String = null,
    transfer_reversal: String = null
  ): Refund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], source_transfer_reversal = source_transfer_reversal.asInstanceOf[js.Any], transfer_reversal = transfer_reversal.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (failure_balance_transaction != null) __obj.updateDynamic("failure_balance_transaction")(failure_balance_transaction.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
}


package typings.stripeV3.stripe.paymentIntents

import typings.stripeV3.anon.Networkstatus
import typings.stripeV3.anon.Stripereport
import typings.stripeV3.stripe.BillingDetails
import typings.stripeV3.stripe.List
import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripe.ShippingDetails
import typings.stripeV3.stripe.Source
import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import typings.stripeV3.stripeV3Strings.charge
import typings.stripeV3.stripeV3Strings.failed
import typings.stripeV3.stripeV3Strings.pending
import typings.stripeV3.stripeV3Strings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge extends js.Object {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: Double
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: Double
  /**
    * ID of the Connect application that created the charge.
    */
  var application: String | Null
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details.
    */
  var application_fee: String | Null
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: Double | Null
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes).
    */
  var balance_transaction: String
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: BillingDetails
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: Boolean
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: String
  /**
    * ID of the customer this charge is for if one exists.
    */
  var customer: String | Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: String | Null
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: String | Null
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: String | Null
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: Stripereport
  /**
    * Unique identifier for the object.
    */
  var id: String
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: String | Null
  /**
    * Has the value true if the object exists in live mode or the value false if
    * the object exists in test mode.
    */
  var livemode: Boolean
  var metadata: Metadata
  /**
    * Value is 'charge'
    */
  var `object`: charge
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: String | Null
  /**
    * ID of the order this charge is for if one exists.
    */
  var order: String | Null
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details.
    */
  var outcome: Networkstatus | Null
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: String
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null
  var payment_method_details: PaymentMethodDetails
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: String | Null
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: String | Null
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
    * latest state of the charge, including any refunds. If the charge is for an Invoice, the
    * receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: String
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: Boolean
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: List[Refund]
  /**
    * ID of the review associated with this charge if one exists.
    */
  var review: js.UndefOr[String | Null] = js.undefined
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[ShippingDetails | Null] = js.undefined
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer: String | Null
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: String | Null
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: succeeded | pending | failed
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter).
    */
  var transfer: js.UndefOr[String | Null] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[String | Null] = js.undefined
}

object Charge {
  @scala.inline
  def apply(
    amount: Double,
    amount_refunded: Double,
    balance_transaction: String,
    billing_details: BillingDetails,
    captured: Boolean,
    created: Double,
    currency: String,
    fraud_details: Stripereport,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    `object`: charge,
    paid: Boolean,
    payment_intent: String,
    payment_method_details: PaymentMethodDetails,
    receipt_url: String,
    refunded: Boolean,
    refunds: List[Refund],
    status: succeeded | pending | failed,
    application: String = null,
    application_fee: String = null,
    application_fee_amount: Double = null.asInstanceOf[Double],
    customer: String = null,
    description: String = null,
    dispute: String = null,
    failure_code: String = null,
    failure_message: String = null,
    invoice: String = null,
    on_behalf_of: String = null,
    order: String = null,
    outcome: Networkstatus = null,
    payment_method: String = null,
    receipt_email: String = null,
    receipt_number: String = null,
    review: js.UndefOr[Null | String] = js.undefined,
    shipping: js.UndefOr[Null | ShippingDetails] = js.undefined,
    source: Source = null,
    source_transfer: String = null,
    statement_descriptor: String = null,
    transfer: js.UndefOr[Null | String] = js.undefined,
    transfer_group: js.UndefOr[Null | String] = js.undefined
  ): Charge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], payment_intent = payment_intent.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], application_fee_amount = application_fee_amount.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], on_behalf_of = on_behalf_of.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], payment_method = payment_method.asInstanceOf[js.Any], receipt_email = receipt_email.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], source_transfer = source_transfer.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(review)) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (!js.isUndefined(shipping)) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(transfer)) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (!js.isUndefined(transfer_group)) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charge]
  }
}


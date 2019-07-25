package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * To charge a credit or a debit card, you create a charge object. You can retrieve and refund individual
  * charges as well as list all charges. Charges are identified by a unique random ID.
  */
trait ICharge
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: scala.Double
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: scala.Double
  /**
    * ID of the Connect application that created the charge. [Expandable]
    */
  var application: js.UndefOr[java.lang.String | stripeLib.stripeMod.applicationsNs.IApplication | scala.Null] = js.undefined
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details. [Expandable]
    */
  var application_fee: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.applicationFeesNs.IApplicationFee | scala.Null
  ] = js.undefined
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes). [Expandable]
    */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: scala.Boolean
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: java.lang.String
  /**
    * ID of the customer this charge is for if one exists. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer | scala.Null
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The account (if any) the charge was made on behalf of, with an automatic
    * transfer. See the [Connect documentation]
    * <https://stripe.com/docs/connect/destination-charges> for details.
    * [Expandable]
    */
  var destination: js.UndefOr[java.lang.String | stripeLib.stripeMod.accountsNs.IAccount | scala.Null] = js.undefined
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: js.UndefOr[stripeLib.stripeMod.disputesNs.IDispute | scala.Null] = js.undefined
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: java.lang.String | scala.Null
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: java.lang.String | scala.Null
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: stripeLib.Anon_Fraudulent
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: java.lang.String | stripeLib.stripeMod.invoicesNs.IInvoice | scala.Null
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * Value is 'charge'
    */
  @JSName("object")
  var object_ICharge: stripeLib.stripeLibStrings.charge
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * ID of the order this charge is for if one exists. [Expandable]
    */
  var order: java.lang.String | stripeLib.stripeMod.ordersNs.IOrder | scala.Null
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details. [Expandable]
    */
  var outcome: js.UndefOr[IOutcome] = js.undefined
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: scala.Boolean
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: java.lang.String | scala.Null
  /**
    * Details about the payment method at the time of the transaction.
    */
  var payment_method_details: IPaymentMethodDetails | scala.Null
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: java.lang.String | scala.Null
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: java.lang.String | scala.Null
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
    * latest state of the charge, including any refunds. If the charge is for an Invoice, the
    * receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: java.lang.String
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: scala.Boolean
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: IChargeRefunds
  /**
    * ID of the review associated with this charge if one exists. [Expandable]
    */
  var review: js.UndefOr[java.lang.String | stripeLib.stripeMod.reviewsNs.IReview | scala.Null] = js.undefined
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[stripeLib.stripeMod.IShippingInformation | scala.Null] = js.undefined
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    * This value is null if this charge is associated with a Payment Intent instead of a Source.
    */
  var source: stripeLib.stripeMod.IStripeSource | scala.Null
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    * [Expandable]
    */
  var source_transfer: java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer | scala.Null
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: java.lang.String | scala.Null
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.failed
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter). [Expandable]
    */
  var transfer: js.UndefOr[java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the [Connect documentation]
    * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
    * for details.
    */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ICharge {
  @scala.inline
  def apply(
    amount: scala.Double,
    amount_refunded: scala.Double,
    balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction,
    captured: scala.Boolean,
    created: scala.Double,
    currency: java.lang.String,
    fraud_details: stripeLib.Anon_Fraudulent,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.charge,
    paid: scala.Boolean,
    receipt_url: java.lang.String,
    refunded: scala.Boolean,
    refunds: IChargeRefunds,
    status: stripeLib.stripeLibStrings.succeeded | stripeLib.stripeLibStrings.pending | stripeLib.stripeLibStrings.failed,
    application: java.lang.String | stripeLib.stripeMod.applicationsNs.IApplication = null,
    application_fee: java.lang.String | stripeLib.stripeMod.applicationFeesNs.IApplicationFee = null,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer = null,
    description: java.lang.String = null,
    destination: java.lang.String | stripeLib.stripeMod.accountsNs.IAccount = null,
    dispute: stripeLib.stripeMod.disputesNs.IDispute = null,
    failure_code: java.lang.String = null,
    failure_message: java.lang.String = null,
    invoice: java.lang.String | stripeLib.stripeMod.invoicesNs.IInvoice = null,
    on_behalf_of: java.lang.String = null,
    order: java.lang.String | stripeLib.stripeMod.ordersNs.IOrder = null,
    outcome: IOutcome = null,
    payment_intent: java.lang.String = null,
    payment_method: java.lang.String = null,
    payment_method_details: IPaymentMethodDetails = null,
    receipt_email: java.lang.String = null,
    receipt_number: java.lang.String = null,
    review: java.lang.String | stripeLib.stripeMod.reviewsNs.IReview = null,
    shipping: stripeLib.stripeMod.IShippingInformation = null,
    source: stripeLib.stripeMod.IStripeSource = null,
    source_transfer: java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer = null,
    statement_descriptor: java.lang.String = null,
    transfer: java.lang.String | stripeLib.stripeMod.transfersNs.ITransfer = null,
    transfer_group: java.lang.String = null
  ): ICharge = {
    val __obj = js.Dynamic.literal(amount = amount, amount_refunded = amount_refunded, balance_transaction = balance_transaction.asInstanceOf[js.Any], captured = captured, created = created, currency = currency, fraud_details = fraud_details, id = id, livemode = livemode, metadata = metadata, paid = paid, receipt_url = receipt_url, refunded = refunded, refunds = refunds, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (dispute != null) __obj.updateDynamic("dispute")(dispute)
    if (failure_code != null) __obj.updateDynamic("failure_code")(failure_code)
    if (failure_message != null) __obj.updateDynamic("failure_message")(failure_message)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_details != null) __obj.updateDynamic("payment_method_details")(payment_method_details)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (receipt_number != null) __obj.updateDynamic("receipt_number")(receipt_number)
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source)
    if (source_transfer != null) __obj.updateDynamic("source_transfer")(source_transfer.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[ICharge]
  }
}


package typings.stripe.mod.charges

import typings.stripe.anon.Address
import typings.stripe.anon.Destination
import typings.stripe.anon.Stripereport
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.IStripeSource
import typings.stripe.mod.accounts.IAccount
import typings.stripe.mod.applicationFees.IApplicationFee
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.disputes.IDispute
import typings.stripe.mod.invoices.IInvoice
import typings.stripe.mod.orders.IOrder
import typings.stripe.mod.reviews.IReview
import typings.stripe.mod.transfers.ITransfer
import typings.stripe.stripeStrings.charge
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * To charge a credit or a debit card, you create a charge object. You can retrieve and refund individual
  * charges as well as list all charges. Charges are identified by a unique random ID.
  */
trait ICharge extends IResourceObject {
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
    * ID of the Connect application that created the charge. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.undefined
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details. [Expandable]
    */
  var application_fee: js.UndefOr[String | IApplicationFee | Null] = js.undefined
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes). [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: js.UndefOr[Address | Null] = js.undefined
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: Boolean
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: String
  /**
    * ID of the customer this charge is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null
  var description: js.UndefOr[String] = js.undefined
  /**
    * The account (if any) the charge was made on behalf of, with an automatic
    * transfer. See the [Connect documentation]
    * <https://stripe.com/docs/connect/destination-charges> for details.
    * [Expandable]
    */
  var destination: js.UndefOr[String | IAccount | Null] = js.undefined
  /**
    * Details about the dispute if the charge has been disputed. [Expandable]
    */
  var dispute: js.UndefOr[String | IDispute | Null] = js.undefined
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
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: String | IInvoice | Null
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is 'charge'
    */
  @JSName("object")
  var object_ICharge: charge
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.undefined
  /**
    * ID of the order this charge is for if one exists. [Expandable]
    */
  var order: String | IOrder | Null
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details. [Expandable]
    */
  var outcome: js.UndefOr[IOutcome] = js.undefined
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: js.UndefOr[String] = js.undefined
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null
  /**
    * Details about the payment method at the time of the transaction.
    */
  var payment_method_details: IPaymentMethodDetails | Null
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
  var refunds: IChargeRefunds
  /**
    * ID of the review associated with this charge if one exists. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.undefined
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.undefined
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    * This value is null if this charge is associated with a Payment Intent instead of a Source.
    */
  var source: IStripeSource | Null
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    * [Expandable]
    */
  var source_transfer: String | ITransfer | Null
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: String | Null
  /**
    * Provides information about the charge that customers see on their statements.
    * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s
    * set on the account to form the complete statement descriptor. Maximum 22 characters
    * for the concatenated descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String | Null] = js.undefined
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: succeeded | pending | failed
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter). [Expandable]
    */
  var transfer: js.UndefOr[String | ITransfer] = js.undefined
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[Destination | Null] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the [Connect documentation]
    * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
    * for details.
    */
  var transfer_group: js.UndefOr[String | Null] = js.undefined
}

object ICharge {
  @scala.inline
  def apply(
    amount: Double,
    amount_refunded: Double,
    balance_transaction: String | IBalanceTransaction,
    captured: Boolean,
    created: Double,
    currency: String,
    fraud_details: Stripereport,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: charge,
    paid: Boolean,
    receipt_url: String,
    refunded: Boolean,
    refunds: IChargeRefunds,
    status: succeeded | pending | failed,
    application: js.UndefOr[Null | String | IApplication] = js.undefined,
    application_fee: js.UndefOr[Null | String | IApplicationFee] = js.undefined,
    application_fee_amount: js.UndefOr[Null | Double] = js.undefined,
    billing_details: js.UndefOr[Null | Address] = js.undefined,
    customer: String | ICustomer = null,
    description: String = null,
    destination: js.UndefOr[Null | String | IAccount] = js.undefined,
    dispute: js.UndefOr[Null | String | IDispute] = js.undefined,
    failure_code: String = null,
    failure_message: String = null,
    invoice: String | IInvoice = null,
    on_behalf_of: js.UndefOr[Null | String] = js.undefined,
    order: String | IOrder = null,
    outcome: IOutcome = null,
    payment_intent: String = null,
    payment_method: String = null,
    payment_method_details: IPaymentMethodDetails = null,
    receipt_email: String = null,
    receipt_number: String = null,
    review: js.UndefOr[Null | String | IReview] = js.undefined,
    shipping: js.UndefOr[Null | IShippingInformation] = js.undefined,
    source: IStripeSource = null,
    source_transfer: String | ITransfer = null,
    statement_descriptor: String = null,
    statement_descriptor_suffix: js.UndefOr[Null | String] = js.undefined,
    transfer: String | ITransfer = null,
    transfer_data: js.UndefOr[Null | Destination] = js.undefined,
    transfer_group: js.UndefOr[Null | String] = js.undefined
  ): ICharge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], payment_method = payment_method.asInstanceOf[js.Any], payment_method_details = payment_method_details.asInstanceOf[js.Any], receipt_email = receipt_email.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], source_transfer = source_transfer.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(application)) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (!js.isUndefined(application_fee)) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (!js.isUndefined(application_fee_amount)) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (!js.isUndefined(billing_details)) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(dispute)) __obj.updateDynamic("dispute")(dispute.asInstanceOf[js.Any])
    if (!js.isUndefined(on_behalf_of)) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent.asInstanceOf[js.Any])
    if (!js.isUndefined(review)) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (!js.isUndefined(shipping)) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (!js.isUndefined(statement_descriptor_suffix)) __obj.updateDynamic("statement_descriptor_suffix")(statement_descriptor_suffix.asInstanceOf[js.Any])
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (!js.isUndefined(transfer_data)) __obj.updateDynamic("transfer_data")(transfer_data.asInstanceOf[js.Any])
    if (!js.isUndefined(transfer_group)) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharge]
  }
}


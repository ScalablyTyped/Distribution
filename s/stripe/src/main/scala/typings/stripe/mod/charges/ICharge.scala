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
@js.native
trait ICharge extends IResourceObject {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: Double = js.native
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: Double = js.native
  /**
    * ID of the Connect application that created the charge. [Expandable]
    */
  var application: js.UndefOr[String | IApplication | Null] = js.native
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details. [Expandable]
    */
  var application_fee: js.UndefOr[String | IApplicationFee | Null] = js.native
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: js.UndefOr[Double | Null] = js.native
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes). [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: js.UndefOr[Address | Null] = js.native
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: Boolean = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: String = js.native
  /**
    * ID of the customer this charge is for if one exists. [Expandable]
    */
  var customer: String | ICustomer | Null = js.native
  var description: js.UndefOr[String] = js.native
  /**
    * The account (if any) the charge was made on behalf of, with an automatic
    * transfer. See the [Connect documentation]
    * <https://stripe.com/docs/connect/destination-charges> for details.
    * [Expandable]
    */
  var destination: js.UndefOr[String | IAccount | Null] = js.native
  /**
    * Details about the dispute if the charge has been disputed. [Expandable]
    */
  var dispute: js.UndefOr[String | IDispute | Null] = js.native
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: String | Null = js.native
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: String | Null = js.native
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: Stripereport = js.native
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: String | IInvoice | Null = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is 'charge'
    */
  @JSName("object")
  var object_ICharge: charge = js.native
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: js.UndefOr[String | Null] = js.native
  /**
    * ID of the order this charge is for if one exists. [Expandable]
    */
  var order: String | IOrder | Null = js.native
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details. [Expandable]
    */
  var outcome: js.UndefOr[IOutcome] = js.native
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: Boolean = js.native
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: js.UndefOr[String] = js.native
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: String | Null = js.native
  /**
    * Details about the payment method at the time of the transaction.
    */
  var payment_method_details: IPaymentMethodDetails | Null = js.native
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: String | Null = js.native
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: String | Null = js.native
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
    * latest state of the charge, including any refunds. If the charge is for an Invoice, the
    * receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: String = js.native
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: Boolean = js.native
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: IChargeRefunds = js.native
  /**
    * ID of the review associated with this charge if one exists. [Expandable]
    */
  var review: js.UndefOr[String | IReview | Null] = js.native
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[IShippingInformation | Null] = js.native
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    * This value is null if this charge is associated with a Payment Intent instead of a Source.
    */
  var source: IStripeSource | Null = js.native
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    * [Expandable]
    */
  var source_transfer: String | ITransfer | Null = js.native
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * Provides information about the charge that customers see on their statements.
    * Concatenated with the prefix (shortened descriptor) or statement descriptor that’s
    * set on the account to form the complete statement descriptor. Maximum 22 characters
    * for the concatenated descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String | Null] = js.native
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: succeeded | pending | failed = js.native
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter). [Expandable]
    */
  var transfer: js.UndefOr[String | ITransfer] = js.native
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[Destination | Null] = js.native
  /**
    * A string that identifies this transaction as part of a group.
    * See the [Connect documentation]
    * <https://stripe.com/docs/connect/charges-transfers#grouping-transactions>
    * for details.
    */
  var transfer_group: js.UndefOr[String | Null] = js.native
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
    status: succeeded | pending | failed
  ): ICharge = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], captured = captured.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fraud_details = fraud_details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], receipt_url = receipt_url.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharge]
  }
  @scala.inline
  implicit class IChargeOps[Self <: ICharge] (val x: Self) extends AnyVal {
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
    def setAmount_refunded(value: Double): Self = this.set("amount_refunded", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transaction(value: String | IBalanceTransaction): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptured(value: Boolean): Self = this.set("captured", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setFraud_details(value: Stripereport): Self = this.set("fraud_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: charge): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaid(value: Boolean): Self = this.set("paid", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_url(value: String): Self = this.set("receipt_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefunded(value: Boolean): Self = this.set("refunded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefunds(value: IChargeRefunds): Self = this.set("refunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: succeeded | pending | failed): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: String | IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setApplicationNull: Self = this.set("application", null)
    @scala.inline
    def setApplication_fee(value: String | IApplicationFee): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee: Self = this.set("application_fee", js.undefined)
    @scala.inline
    def setApplication_feeNull: Self = this.set("application_fee", null)
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_fee_amount: Self = this.set("application_fee_amount", js.undefined)
    @scala.inline
    def setApplication_fee_amountNull: Self = this.set("application_fee_amount", null)
    @scala.inline
    def setBilling_details(value: Address): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_details: Self = this.set("billing_details", js.undefined)
    @scala.inline
    def setBilling_detailsNull: Self = this.set("billing_details", null)
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestination(value: String | IAccount): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDestinationNull: Self = this.set("destination", null)
    @scala.inline
    def setDispute(value: String | IDispute): Self = this.set("dispute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispute: Self = this.set("dispute", js.undefined)
    @scala.inline
    def setDisputeNull: Self = this.set("dispute", null)
    @scala.inline
    def setFailure_code(value: String): Self = this.set("failure_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure_codeNull: Self = this.set("failure_code", null)
    @scala.inline
    def setFailure_message(value: String): Self = this.set("failure_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure_messageNull: Self = this.set("failure_message", null)
    @scala.inline
    def setInvoice(value: String | IInvoice): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoiceNull: Self = this.set("invoice", null)
    @scala.inline
    def setOn_behalf_of(value: String): Self = this.set("on_behalf_of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn_behalf_of: Self = this.set("on_behalf_of", js.undefined)
    @scala.inline
    def setOn_behalf_ofNull: Self = this.set("on_behalf_of", null)
    @scala.inline
    def setOrder(value: String | IOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    @scala.inline
    def setOutcome(value: IOutcome): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    @scala.inline
    def setPayment_intent(value: String): Self = this.set("payment_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_intent: Self = this.set("payment_intent", js.undefined)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_methodNull: Self = this.set("payment_method", null)
    @scala.inline
    def setPayment_method_details(value: IPaymentMethodDetails): Self = this.set("payment_method_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_method_detailsNull: Self = this.set("payment_method_details", null)
    @scala.inline
    def setReceipt_email(value: String): Self = this.set("receipt_email", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_emailNull: Self = this.set("receipt_email", null)
    @scala.inline
    def setReceipt_number(value: String): Self = this.set("receipt_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceipt_numberNull: Self = this.set("receipt_number", null)
    @scala.inline
    def setReview(value: String | IReview): Self = this.set("review", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReview: Self = this.set("review", js.undefined)
    @scala.inline
    def setReviewNull: Self = this.set("review", null)
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    @scala.inline
    def setShippingNull: Self = this.set("shipping", null)
    @scala.inline
    def setSource(value: IStripeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    @scala.inline
    def setSource_transfer(value: String | ITransfer): Self = this.set("source_transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_transferNull: Self = this.set("source_transfer", null)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
    @scala.inline
    def setStatement_descriptor_suffix(value: String): Self = this.set("statement_descriptor_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor_suffix: Self = this.set("statement_descriptor_suffix", js.undefined)
    @scala.inline
    def setStatement_descriptor_suffixNull: Self = this.set("statement_descriptor_suffix", null)
    @scala.inline
    def setTransfer(value: String | ITransfer): Self = this.set("transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer: Self = this.set("transfer", js.undefined)
    @scala.inline
    def setTransfer_data(value: Destination): Self = this.set("transfer_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_data: Self = this.set("transfer_data", js.undefined)
    @scala.inline
    def setTransfer_dataNull: Self = this.set("transfer_data", null)
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransfer_group: Self = this.set("transfer_group", js.undefined)
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
  
}


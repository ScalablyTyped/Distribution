package typings.stripe.mod.invoices

import typings.stripe.mod.IAddress
import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.coupons.IDiscount
import typings.stripe.mod.customerTaxIds.ITaxIdCreationOptions
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.paymentIntents.IPaymentIntent
import typings.stripe.mod.paymentMethods.IPaymentMethod
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.mod.taxRates.ITaxAmount
import typings.stripe.mod.taxRates.ITaxRate
import typings.stripe.stripeStrings.charge_automatically
import typings.stripe.stripeStrings.draft
import typings.stripe.stripeStrings.invoice
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.open
import typings.stripe.stripeStrings.paid
import typings.stripe.stripeStrings.send_invoice
import typings.stripe.stripeStrings.subscription
import typings.stripe.stripeStrings.subscription_create
import typings.stripe.stripeStrings.subscription_cycle
import typings.stripe.stripeStrings.subscription_threshold
import typings.stripe.stripeStrings.subscription_update
import typings.stripe.stripeStrings.uncollectible
import typings.stripe.stripeStrings.upcoming
import typings.stripe.stripeStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Invoices are statements of what a customer owes for a particular billing period, including subscriptions,
  * invoice items, and any automatic proration adjustments if necessary. Once an invoice is created, payment
  * is automatically attempted. Note that the payment, while automatic, does not happen exactly at the time of
  * invoice creation. If you have configured webhooks, the invoice will wait until one hour after the last
  * webhook is successfully sent (or the last webhook times out after failing). Any customer credit on the
  * account is applied before determining how much is due for that invoice (the amount that will be actually
  * charged). If the amount due for the invoice is less than 50 cents (the minimum for a charge), we add the
  * amount to the customer's running account balance to be added to the next invoice. If this amount is
  * negative, it will act as a credit to offset the next invoice. Note that the customer account balance does
  * not include unpaid invoices; it only includes balances that need to be taken into account when calculating
  * the amount due for the next invoice.
  */
@js.native
trait IInvoice extends IResourceObject {
  
  /**
    * The country of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_country: String = js.native
  
  /**
    * The public name of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_name: String = js.native
  
  /**
    * Final amount due at this time for this invoice. If the invoice's total is smaller than the minimum charge
    * amount, for example, or if there is account credit that can be applied to the invoice, the amount_due may
    * be 0. If there is a positive starting_balance for the invoice (the customer owes money), the amount_due
    * will also take that into account. The charge that gets generated for the invoice will be for the amount
    * specified in amount_due.
    */
  var amount_due: Double = js.native
  
  /**
    * The amount, in cents, that was paid.
    */
  var amount_paid: Double = js.native
  
  /**
    * The amount remaining, in cents, that is due.
    */
  var amount_remaining: Double = js.native
  
  /**
    * The fee in cents that will be applied to the invoice and transferred to the application owner's
    * Stripe account when the invoice is paid.
    *
    * @deprecated Stripe API Version 2019-03-14 changed the name of this property
    * @see application_fee_amount
    */
  var application_fee: js.UndefOr[Double] = js.native
  
  /**
    * The fee in pence that will be applied to the invoice and transferred to the application owner’s
    * Stripe account when the invoice is paid.
    *
    * @since Stripe API Version 2019-03-14
    */
  var application_fee_amount: Double = js.native
  
  /**
    * Number of payment attempts made for this invoice, from the perspective of the payment retry schedule. Any
    * payment attempt counts as the first attempt, and subsequently only automatic retries increment the attempt
    * count. In other words, manual payment attempts after the first attempt do not affect the retry schedule.
    */
  var attempt_count: Double = js.native
  
  /**
    * Whether or not an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour after
    * the invoice.created webhook, for example, so you might not want to display that invoice as unpaid to your
    * users.
    */
  var attempted: Boolean = js.native
  
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: Boolean = js.native
  
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically,
    * Stripe will attempt to pay this invoice using the default source attached to the
    * customer. When sending an invoice, Stripe will email this invoice to the customer
    * with payment instructions.
    *
    * @deprecated This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: charge_automatically | send_invoice = js.native
  
  /**
    * Indicates the reason why the invoice was created. `subscription_cycle` indicates an
    * invoice created by a subscription advancing into a new period.
    * `subscription_create` indicates an invoice created due to creating a subscription.
    * `subscription_update` indicates an invoice created due to creating or updating a
    * subscription. `subscription` is set for all old invoices to indicate either a change
    * to a subscription or a period advancement. `manual` is set for all invoices
    * unrelated to a subscription (for example: created via the invoice editor). The
    * `upcoming` value is reserved for simulated invoices per the upcoming invoice
    * endpoint. `subscription_threshold` indicates an invoice created due to a billing
    * threshold being reached.
    */
  var billing_reason: subscription_cycle | subscription_create | subscription_update | subscription | manual | upcoming | subscription_threshold = js.native
  
  /**
    * ID of the latest charge generated for this invoice, if any. [Expandable]
    */
  var charge: String | ICharge | Null = js.native
  
  /**
    * @deprecated Whether or not the invoice is still trying to collect payment. An invoice is closed if it's either paid or
    * it has been marked closed. A closed invoice will no longer attempt to collect payment.
    */
  var closed: js.UndefOr[Boolean] = js.native
  
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  
  /**
    * Custom fields displayed on the invoice.
    */
  var custom_fields: js.Array[ICustomField] | Null = js.native
  
  var customer: String | ICustomer = js.native
  
  /**
    * The customer’s address. Until the invoice is finalized, this field will equal customer.address.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_address: IAddress | Null = js.native
  
  /**
    * The customer’s email. Until the invoice is finalized, this field will equal customer.email.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_email: String | Null = js.native
  
  /**
    * The customer’s name. Until the invoice is finalized, this field will equal customer.name.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_name: String | Null = js.native
  
  /**
    * The customer’s phone number. Until the invoice is finalized, this field will equal customer.phone.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_phone: String | Null = js.native
  
  /**
    * The customer’s shipping information. Until the invoice is finalized, this field will equal customer.shipping.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_shipping: IShippingInformation | Null = js.native
  
  /**
    * The customer’s tax exempt status. Until the invoice is finalized, this field will equal customer.tax_exempt.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_exempt: String | Null = js.native
  
  /**
    * The customer’s tax IDs. Until the invoice is finalized, this field will contain the same tax IDs as customer.tax_ids.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_ids: js.Array[ITaxIdCreationOptions] = js.native
  
  /**
    * @deprecated Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var date: js.UndefOr[Double] = js.native
  
  /**
    * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice.
    * If not set, defaults to the subscription’s default payment method, if any, or to the default payment method in
    * the customer’s invoice settings.
    */
  var default_payment_method: String | IPaymentMethod | Null = js.native
  
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to
    * the subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: String | Null = js.native
  
  /**
    * The tax rates applied to this invoice, if any.
    */
  var default_tax_rates: js.Array[ITaxRate] = js.native
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * Referenced as ‘memo’ in the Dashboard.
    */
  var description: String | Null = js.native
  
  var discount: IDiscount | Null = js.native
  
  /**
    * The date on which payment for this invoice is due. This value will be `null` for
    * invoices where `billing=charge_automatically`.
    */
  var due_date: Double | Null = js.native
  
  /**
    * Ending customer balance after attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be null.
    */
  var ending_balance: Double | Null = js.native
  
  /**
    * Footer displayed on the invoice.
    */
  var footer: String | Null = js.native
  
  /**
    * @deprecated Whether or not the invoice has been forgiven. Forgiving an invoice instructs us to update the subscription
    * status as if the invoice were succcessfully paid. Once an invoice has been forgiven, it cannot be unforgiven
    * or reopened
    */
  var forgiven: js.UndefOr[Boolean] = js.native
  
  /**
    * The URL for the hosted invoice page, which allows customers to view and pay an
    * invoice. If the invoice has not been finalized yet, this will be null.
    */
  var hosted_invoice_url: String | Null = js.native
  
  /**
    * The link to download the PDF for the invoice. If the invoice has not been finalized
    * yet, this will be null.
    */
  var invoice_pdf: String | Null = js.native
  
  /**
    * The individual line items that make up the invoice.
    *
    * `lines` is sorted as follows: invoice items in reverse chronological order, followed
    * by the subscription, if any.
    */
  var lines: IList[IInvoiceLineItem] = js.native
  
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  
  /**
    * The time at which payment will next be attempted.
    */
  var next_payment_attempt: Double | Null = js.native
  
  /**
    * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the customer’s unique invoice_prefix if it is specified.
    */
  var number: String = js.native
  
  /**
    * Value is 'invoice'
    */
  @JSName("object")
  var object_IInvoice: invoice = js.native
  
  /**
    * Whether or not payment was successfully collected for this invoice. An invoice can be paid (most commonly)
    * with a charge or with credit from the customer's account balance.
    */
  var paid: Boolean = js.native
  
  /**
    * The PaymentIntent associated with this invoice. The PaymentIntent is generated when the invoice is finalized,
    * and can then be used to pay the invoice. Note that voiding an invoice will cancel the PaymentIntent. [Expandable]
    */
  var payment_intent: IPaymentIntent | String | Null = js.native
  
  /**
    * End of the usage period during which invoice items were added to this invoice
    */
  var period_end: Double = js.native
  
  /**
    * Start of the usage period during which invoice items were added to this invoice
    */
  var period_start: Double = js.native
  
  /**
    * Total amount of all post-payment credit notes issued for this invoice.
    */
  var post_payment_credit_notes_amount: Double = js.native
  
  /**
    * Total amount of all pre-payment credit notes issued for this invoice.
    */
  var pre_payment_credit_notes_amount: Double = js.native
  
  /**
    * This is the transaction number that appears on email receipts sent for this invoice.
    */
  var receipt_number: String | Null = js.native
  
  /**
    * Starting customer balance before attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be the current customer balance.
    */
  var starting_balance: Double = js.native
  
  /**
    * Extra information about an invoice for the customer's credit card statement.
    */
  var statement_descriptor: String | Null = js.native
  
  /**
    * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`.
    */
  var status: draft | open | paid | uncollectible | void = js.native
  
  /**
    * Contains the timestamps when an invoice was finalized, paid, marked uncollectible, or voided
    */
  var status_transitions: IStatusTransitions = js.native
  
  /**
    * The subscription that this invoice was prepared for, if any.
    */
  var subscription: String | ISubscription | Null = js.native
  
  /**
    * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
    */
  var subscription_proration_date: js.UndefOr[Double | Null] = js.native
  
  /**
    * Total of all subscriptions, invoice items, and prorations on the invoice before any discount is applied
    */
  var subtotal: Double = js.native
  
  /**
    * The amount of tax included in the total, calculated from tax_percent and the subtotal. If no tax_percent
    * is defined, this value will be null.
    */
  var tax: Double | Null = js.native
  
  /**
    * This percentage of the subtotal has been added to the total amount of the invoice, including invoice line
    * items and discounts. This field is inherited from the subscription's tax_percent field, but can be changed
    * before the invoice is paid. This field defaults to null.
    */
  var tax_percent: Double | Null = js.native
  
  /**
    * If `billing_reason` is set to `subscription_threshold` this returns more information
    * on which threshold rules triggered the invoice.
    */
  var threshold_reason: js.UndefOr[IThresholdReason] = js.native
  
  /**
    * Total after discount
    */
  var total: Double = js.native
  
  /**
    * The aggregate amounts calculated per tax rate for all line items.
    */
  var total_tax_amounts: js.Array[ITaxAmount] | Null = js.native
  
  /**
    * The time at which webhooks for this invoice were successfully delivered (if the invoice had no webhooks to
    * deliver, this will match date). Invoice payment is delayed until webhooks are delivered, or until all webhook
    * delivery attempts have been exhausted.
    */
  var webhooks_delivered_at: Double | Null = js.native
}
object IInvoice {
  
  @scala.inline
  def apply(
    account_country: String,
    account_name: String,
    amount_due: Double,
    amount_paid: Double,
    amount_remaining: Double,
    application_fee_amount: Double,
    attempt_count: Double,
    attempted: Boolean,
    auto_advance: Boolean,
    billing: charge_automatically | send_invoice,
    billing_reason: subscription_cycle | subscription_create | subscription_update | subscription | manual | upcoming | subscription_threshold,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    customer_tax_ids: js.Array[ITaxIdCreationOptions],
    default_tax_rates: js.Array[ITaxRate],
    id: String,
    lines: IList[IInvoiceLineItem],
    livemode: Boolean,
    metadata: IMetadata,
    number: String,
    `object`: invoice,
    paid: Boolean,
    period_end: Double,
    period_start: Double,
    post_payment_credit_notes_amount: Double,
    pre_payment_credit_notes_amount: Double,
    starting_balance: Double,
    status: draft | open | paid | uncollectible | void,
    status_transitions: IStatusTransitions,
    subtotal: Double,
    total: Double
  ): IInvoice = {
    val __obj = js.Dynamic.literal(account_country = account_country.asInstanceOf[js.Any], account_name = account_name.asInstanceOf[js.Any], amount_due = amount_due.asInstanceOf[js.Any], amount_paid = amount_paid.asInstanceOf[js.Any], amount_remaining = amount_remaining.asInstanceOf[js.Any], application_fee_amount = application_fee_amount.asInstanceOf[js.Any], attempt_count = attempt_count.asInstanceOf[js.Any], attempted = attempted.asInstanceOf[js.Any], auto_advance = auto_advance.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], billing_reason = billing_reason.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_tax_ids = customer_tax_ids.asInstanceOf[js.Any], default_tax_rates = default_tax_rates.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], period_end = period_end.asInstanceOf[js.Any], period_start = period_start.asInstanceOf[js.Any], post_payment_credit_notes_amount = post_payment_credit_notes_amount.asInstanceOf[js.Any], pre_payment_credit_notes_amount = pre_payment_credit_notes_amount.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoice]
  }
  
  @scala.inline
  implicit class IInvoiceOps[Self <: IInvoice] (val x: Self) extends AnyVal {
    
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
    def setAccount_country(value: String): Self = this.set("account_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_name(value: String): Self = this.set("account_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_due(value: Double): Self = this.set("amount_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_paid(value: Double): Self = this.set("amount_paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_remaining(value: Double): Self = this.set("amount_remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = this.set("application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttempt_count(value: Double): Self = this.set("attempt_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttempted(value: Boolean): Self = this.set("attempted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_advance(value: Boolean): Self = this.set("auto_advance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling(value: charge_automatically | send_invoice): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_reason(
      value: subscription_cycle | subscription_create | subscription_update | subscription | manual | upcoming | subscription_threshold
    ): Self = this.set("billing_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_tax_idsVarargs(value: ITaxIdCreationOptions*): Self = this.set("customer_tax_ids", js.Array(value :_*))
    
    @scala.inline
    def setCustomer_tax_ids(value: js.Array[ITaxIdCreationOptions]): Self = this.set("customer_tax_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_tax_ratesVarargs(value: ITaxRate*): Self = this.set("default_tax_rates", js.Array(value :_*))
    
    @scala.inline
    def setDefault_tax_rates(value: js.Array[ITaxRate]): Self = this.set("default_tax_rates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: IList[IInvoiceLineItem]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: invoice): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaid(value: Boolean): Self = this.set("paid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod_end(value: Double): Self = this.set("period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod_start(value: Double): Self = this.set("period_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost_payment_credit_notes_amount(value: Double): Self = this.set("post_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_payment_credit_notes_amount(value: Double): Self = this.set("pre_payment_credit_notes_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting_balance(value: Double): Self = this.set("starting_balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: draft | open | paid | uncollectible | void): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_transitions(value: IStatusTransitions): Self = this.set("status_transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotal(value: Double): Self = this.set("subtotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee(value: Double): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication_fee: Self = this.set("application_fee", js.undefined)
    
    @scala.inline
    def setCharge(value: String | ICharge): Self = this.set("charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargeNull: Self = this.set("charge", null)
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setCollection_method(value: charge_automatically | send_invoice): Self = this.set("collection_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection_method: Self = this.set("collection_method", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: ICustomField*): Self = this.set("custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustom_fields(value: js.Array[ICustomField]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsNull: Self = this.set("custom_fields", null)
    
    @scala.inline
    def setCustomer_address(value: IAddress): Self = this.set("customer_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_addressNull: Self = this.set("customer_address", null)
    
    @scala.inline
    def setCustomer_email(value: String): Self = this.set("customer_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_emailNull: Self = this.set("customer_email", null)
    
    @scala.inline
    def setCustomer_name(value: String): Self = this.set("customer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_nameNull: Self = this.set("customer_name", null)
    
    @scala.inline
    def setCustomer_phone(value: String): Self = this.set("customer_phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_phoneNull: Self = this.set("customer_phone", null)
    
    @scala.inline
    def setCustomer_shipping(value: IShippingInformation): Self = this.set("customer_shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_shippingNull: Self = this.set("customer_shipping", null)
    
    @scala.inline
    def setCustomer_tax_exempt(value: String): Self = this.set("customer_tax_exempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_tax_exemptNull: Self = this.set("customer_tax_exempt", null)
    
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDefault_payment_method(value: String | IPaymentMethod): Self = this.set("default_payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_payment_methodNull: Self = this.set("default_payment_method", null)
    
    @scala.inline
    def setDefault_source(value: String): Self = this.set("default_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_sourceNull: Self = this.set("default_source", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDiscount(value: IDiscount): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountNull: Self = this.set("discount", null)
    
    @scala.inline
    def setDue_date(value: Double): Self = this.set("due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_dateNull: Self = this.set("due_date", null)
    
    @scala.inline
    def setEnding_balance(value: Double): Self = this.set("ending_balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnding_balanceNull: Self = this.set("ending_balance", null)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterNull: Self = this.set("footer", null)
    
    @scala.inline
    def setForgiven(value: Boolean): Self = this.set("forgiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgiven: Self = this.set("forgiven", js.undefined)
    
    @scala.inline
    def setHosted_invoice_url(value: String): Self = this.set("hosted_invoice_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosted_invoice_urlNull: Self = this.set("hosted_invoice_url", null)
    
    @scala.inline
    def setInvoice_pdf(value: String): Self = this.set("invoice_pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice_pdfNull: Self = this.set("invoice_pdf", null)
    
    @scala.inline
    def setNext_payment_attempt(value: Double): Self = this.set("next_payment_attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_payment_attemptNull: Self = this.set("next_payment_attempt", null)
    
    @scala.inline
    def setPayment_intent(value: IPaymentIntent | String): Self = this.set("payment_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_intentNull: Self = this.set("payment_intent", null)
    
    @scala.inline
    def setReceipt_number(value: String): Self = this.set("receipt_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_numberNull: Self = this.set("receipt_number", null)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
    
    @scala.inline
    def setSubscription(value: String | ISubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = this.set("subscription", null)
    
    @scala.inline
    def setSubscription_proration_date(value: Double): Self = this.set("subscription_proration_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_proration_date: Self = this.set("subscription_proration_date", js.undefined)
    
    @scala.inline
    def setSubscription_proration_dateNull: Self = this.set("subscription_proration_date", null)
    
    @scala.inline
    def setTax(value: Double): Self = this.set("tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNull: Self = this.set("tax", null)
    
    @scala.inline
    def setTax_percent(value: Double): Self = this.set("tax_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_percentNull: Self = this.set("tax_percent", null)
    
    @scala.inline
    def setThreshold_reason(value: IThresholdReason): Self = this.set("threshold_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold_reason: Self = this.set("threshold_reason", js.undefined)
    
    @scala.inline
    def setTotal_tax_amountsVarargs(value: ITaxAmount*): Self = this.set("total_tax_amounts", js.Array(value :_*))
    
    @scala.inline
    def setTotal_tax_amounts(value: js.Array[ITaxAmount]): Self = this.set("total_tax_amounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_tax_amountsNull: Self = this.set("total_tax_amounts", null)
    
    @scala.inline
    def setWebhooks_delivered_at(value: Double): Self = this.set("webhooks_delivered_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhooks_delivered_atNull: Self = this.set("webhooks_delivered_at", null)
  }
}

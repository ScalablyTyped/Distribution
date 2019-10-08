package typings.stripe.stripeMod.invoices

import typings.stripe.Anon_AmountInclusive
import typings.stripe.stripeMod.IAddress
import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.charges.ICharge
import typings.stripe.stripeMod.coupons.IDiscount
import typings.stripe.stripeMod.customerTaxIds.ITaxIdCreationOptions
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeMod.paymentIntents.IPaymentIntent
import typings.stripe.stripeMod.subscriptions.ISubscription
import typings.stripe.stripeMod.taxRates.ITaxRate
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
import scala.scalajs.js.annotation._

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
trait IInvoice extends IResourceObject {
  /**
    * The country of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_country: String
  /**
    * The public name of the business associated with this invoice, most often the business creating the invoice.
    */
  var account_name: String
  /**
    * Final amount due at this time for this invoice. If the invoice's total is smaller than the minimum charge
    * amount, for example, or if there is account credit that can be applied to the invoice, the amount_due may
    * be 0. If there is a positive starting_balance for the invoice (the customer owes money), the amount_due
    * will also take that into account. The charge that gets generated for the invoice will be for the amount
    * specified in amount_due.
    */
  var amount_due: Double
  /**
    * The amount, in cents, that was paid.
    */
  var amount_paid: Double
  /**
    * The amount remaining, in cents, that is due.
    */
  var amount_remaining: Double
  /**
    * The fee in cents that will be applied to the invoice and transferred to the application owner's
    * Stripe account when the invoice is paid.
    *
    * @deprecated Stripe API Version 2019-03-14 changed the name of this property
    * @see application_fee_amount
    */
  var application_fee: Double
  /**
    * The fee in pence that will be applied to the invoice and transferred to the application owner’s
    * Stripe account when the invoice is paid.
    *
    * @since Stripe API Version 2019-03-14
    */
  var application_fee_amount: Double
  /**
    * Number of payment attempts made for this invoice, from the perspective of the payment retry schedule. Any
    * payment attempt counts as the first attempt, and subsequently only automatic retries increment the attempt
    * count. In other words, manual payment attempts after the first attempt do not affect the retry schedule.
    */
  var attempt_count: Double
  /**
    * Whether or not an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour after
    * the invoice.created webhook, for example, so you might not want to display that invoice as unpaid to your
    * users.
    */
  var attempted: Boolean
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: Boolean
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically,
    * Stripe will attempt to pay this invoice using the default source attached to the
    * customer. When sending an invoice, Stripe will email this invoice to the customer
    * with payment instructions.
    *
    * @deprecated This field has been renamed to collection_method and will be removed in a future API version.
    */
  var billing: charge_automatically | send_invoice
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
  var billing_reason: subscription_cycle | subscription_create | subscription_update | subscription | manual | upcoming | subscription_threshold
  /**
    * ID of the latest charge generated for this invoice, if any. [Expandable]
    */
  var charge: String | ICharge | Null
  /**
    * @deprecated Whether or not the invoice is still trying to collect payment. An invoice is closed if it's either paid or
    * it has been marked closed. A closed invoice will no longer attempt to collect payment.
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  /**
    * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay
    * this invoice using the default source attached to the customer. When sending an invoice, Stripe will
    * email this invoice to the customer with payment instructions.
    */
  var collection_method: js.UndefOr[charge_automatically | send_invoice] = js.undefined
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * Custom fields displayed on the invoice.
    */
  var custom_fields: js.Array[ICustomField]
  var customer: String | ICustomer
  /**
    * The customer’s address. Until the invoice is finalized, this field will equal customer.address.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_address: IAddress | Null
  /**
    * The customer’s email. Until the invoice is finalized, this field will equal customer.email.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_email: String
  /**
    * The customer’s name. Until the invoice is finalized, this field will equal customer.name.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_name: String
  /**
    * The customer’s phone number. Until the invoice is finalized, this field will equal customer.phone.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_phone: String
  /**
    * The customer’s shipping information. Until the invoice is finalized, this field will equal customer.shipping.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_shipping: IShippingInformation
  /**
    * The customer’s tax exempt status. Until the invoice is finalized, this field will equal customer.tax_exempt.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_exempt: String
  /**
    * The customer’s tax IDs. Until the invoice is finalized, this field will contain the same tax IDs as customer.tax_ids.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_ids: js.Array[ITaxIdCreationOptions]
  /**
    * @deprecated Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var date: js.UndefOr[Double] = js.undefined
  /**
    * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice.
    * If not set, defaults to the subscription’s default payment method, if any, or to the default payment method in
    * the customer’s invoice settings.
    */
  var default_payment_method: String
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to
    * the subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: String
  /**
    * The tax rates applied to this invoice, if any.
    */
  var default_tax_rates: js.Array[ITaxRate]
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * Referenced as ‘memo’ in the Dashboard.
    */
  var description: String
  var discount: IDiscount | Null
  /**
    * The date on which payment for this invoice is due. This value will be `null` for
    * invoices where `billing=charge_automatically`.
    */
  var due_date: Double | Null
  /**
    * Ending customer balance after attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be null.
    */
  var ending_balance: Double | Null
  /**
    * Footer displayed on the invoice.
    */
  var footer: String
  /**
    * @deprecated Whether or not the invoice has been forgiven. Forgiving an invoice instructs us to update the subscription
    * status as if the invoice were succcessfully paid. Once an invoice has been forgiven, it cannot be unforgiven
    * or reopened
    */
  var forgiven: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL for the hosted invoice page, which allows customers to view and pay an
    * invoice. If the invoice has not been finalized yet, this will be null.
    */
  var hosted_invoice_url: String | Null
  /**
    * The link to download the PDF for the invoice. If the invoice has not been finalized
    * yet, this will be null.
    */
  var invoice_pdf: String | Null
  /**
    * The individual line items that make up the invoice.
    *
    * `lines` is sorted as follows: invoice items in reverse chronological order, followed
    * by the subscription, if any.
    */
  var lines: IList[IInvoiceLineItem]
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * The time at which payment will next be attempted.
    */
  var next_payment_attempt: Double
  /**
    * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the customer’s unique invoice_prefix if it is specified.
    */
  var number: String
  /**
    * Value is 'invoice'
    */
  @JSName("object")
  var object_IInvoice: invoice
  /**
    * Whether or not payment was successfully collected for this invoice. An invoice can be paid (most commonly)
    * with a charge or with credit from the customer's account balance.
    */
  var paid: Boolean
  /**
    * The PaymentIntent associated with this invoice. The PaymentIntent is generated when the invoice is finalized,
    * and can then be used to pay the invoice. Note that voiding an invoice will cancel the PaymentIntent. [Expandable]
    */
  var payment_intent: IPaymentIntent | Null
  /**
    * End of the usage period during which invoice items were added to this invoice
    */
  var period_end: Double
  /**
    * Start of the usage period during which invoice items were added to this invoice
    */
  var period_start: Double
  /**
    * Total amount of all post-payment credit notes issued for this invoice.
    */
  var post_payment_credit_notes_amount: Double
  /**
    * Total amount of all pre-payment credit notes issued for this invoice.
    */
  var pre_payment_credit_notes_amount: Double
  /**
    * This is the transaction number that appears on email receipts sent for this invoice.
    */
  var receipt_number: String
  /**
    * Starting customer balance before attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be the current customer balance.
    */
  var starting_balance: Double
  /**
    * Extra information about an invoice for the customer's credit card statement.
    */
  var statement_descriptor: String
  /**
    * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`.
    */
  var status: draft | open | paid | uncollectible | void
  /**
    * Contains the timestamps when an invoice was finalized, paid, marked uncollectible, or voided
    */
  var status_transitions: IStatusTransitions
  /**
    * The subscription that this invoice was prepared for, if any.
    */
  var subscription: String | ISubscription | Null
  /**
    * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
    */
  var subscription_proration_date: Double
  /**
    * Total of all subscriptions, invoice items, and prorations on the invoice before any discount is applied
    */
  var subtotal: Double
  /**
    * The amount of tax included in the total, calculated from tax_percent and the subtotal. If no tax_percent
    * is defined, this value will be null.
    */
  var tax: Double | Null
  /**
    * This percentage of the subtotal has been added to the total amount of the invoice, including invoice line
    * items and discounts. This field is inherited from the subscription's tax_percent field, but can be changed
    * before the invoice is paid. This field defaults to null.
    */
  var tax_percent: Double | Null
  /**
    * If `billing_reason` is set to `subscription_threshold` this returns more information
    * on which threshold rules triggered the invoice.
    */
  var threshold_reason: IThresholdReason
  /**
    * Total after discount
    */
  var total: Double
  /**
    * The aggregate amounts calculated per tax rate for all line items.
    */
  var total_tax_amounts: Anon_AmountInclusive
  /**
    * The time at which webhooks for this invoice were successfully delivered (if the invoice had no webhooks to
    * deliver, this will match date). Invoice payment is delayed until webhooks are delivered, or until all webhook
    * delivery attempts have been exhausted.
    */
  var webhooks_delivered_at: Double
}

object IInvoice {
  @scala.inline
  def apply(
    account_country: String,
    account_name: String,
    amount_due: Double,
    amount_paid: Double,
    amount_remaining: Double,
    application_fee: Double,
    application_fee_amount: Double,
    attempt_count: Double,
    attempted: Boolean,
    auto_advance: Boolean,
    billing: charge_automatically | send_invoice,
    billing_reason: subscription_cycle | subscription_create | subscription_update | subscription | manual | upcoming | subscription_threshold,
    created: Double,
    currency: String,
    custom_fields: js.Array[ICustomField],
    customer: String | ICustomer,
    customer_email: String,
    customer_name: String,
    customer_phone: String,
    customer_shipping: IShippingInformation,
    customer_tax_exempt: String,
    customer_tax_ids: js.Array[ITaxIdCreationOptions],
    default_payment_method: String,
    default_source: String,
    default_tax_rates: js.Array[ITaxRate],
    description: String,
    footer: String,
    id: String,
    lines: IList[IInvoiceLineItem],
    livemode: Boolean,
    metadata: IMetadata,
    next_payment_attempt: Double,
    number: String,
    `object`: invoice,
    paid: Boolean,
    period_end: Double,
    period_start: Double,
    post_payment_credit_notes_amount: Double,
    pre_payment_credit_notes_amount: Double,
    receipt_number: String,
    starting_balance: Double,
    statement_descriptor: String,
    status: draft | open | paid | uncollectible | void,
    status_transitions: IStatusTransitions,
    subscription_proration_date: Double,
    subtotal: Double,
    threshold_reason: IThresholdReason,
    total: Double,
    total_tax_amounts: Anon_AmountInclusive,
    webhooks_delivered_at: Double,
    charge: String | ICharge = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    collection_method: charge_automatically | send_invoice = null,
    customer_address: IAddress = null,
    date: Int | Double = null,
    discount: IDiscount = null,
    due_date: Int | Double = null,
    ending_balance: Int | Double = null,
    forgiven: js.UndefOr[Boolean] = js.undefined,
    hosted_invoice_url: String = null,
    invoice_pdf: String = null,
    payment_intent: IPaymentIntent = null,
    subscription: String | ISubscription = null,
    tax: Int | Double = null,
    tax_percent: Int | Double = null
  ): IInvoice = {
    val __obj = js.Dynamic.literal(account_country = account_country, account_name = account_name, amount_due = amount_due, amount_paid = amount_paid, amount_remaining = amount_remaining, application_fee = application_fee, application_fee_amount = application_fee_amount, attempt_count = attempt_count, attempted = attempted, auto_advance = auto_advance, billing = billing.asInstanceOf[js.Any], billing_reason = billing_reason.asInstanceOf[js.Any], created = created, currency = currency, custom_fields = custom_fields, customer = customer.asInstanceOf[js.Any], customer_email = customer_email, customer_name = customer_name, customer_phone = customer_phone, customer_shipping = customer_shipping, customer_tax_exempt = customer_tax_exempt, customer_tax_ids = customer_tax_ids, default_payment_method = default_payment_method, default_source = default_source, default_tax_rates = default_tax_rates, description = description, footer = footer, id = id, lines = lines, livemode = livemode, metadata = metadata, next_payment_attempt = next_payment_attempt, number = number, paid = paid, period_end = period_end, period_start = period_start, post_payment_credit_notes_amount = post_payment_credit_notes_amount, pre_payment_credit_notes_amount = pre_payment_credit_notes_amount, receipt_number = receipt_number, starting_balance = starting_balance, statement_descriptor = statement_descriptor, status = status.asInstanceOf[js.Any], status_transitions = status_transitions, subscription_proration_date = subscription_proration_date, subtotal = subtotal, threshold_reason = threshold_reason, total = total, total_tax_amounts = total_tax_amounts, webhooks_delivered_at = webhooks_delivered_at)
    __obj.updateDynamic("object")(`object`)
    if (charge != null) __obj.updateDynamic("charge")(charge.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (collection_method != null) __obj.updateDynamic("collection_method")(collection_method.asInstanceOf[js.Any])
    if (customer_address != null) __obj.updateDynamic("customer_address")(customer_address)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (ending_balance != null) __obj.updateDynamic("ending_balance")(ending_balance.asInstanceOf[js.Any])
    if (!js.isUndefined(forgiven)) __obj.updateDynamic("forgiven")(forgiven)
    if (hosted_invoice_url != null) __obj.updateDynamic("hosted_invoice_url")(hosted_invoice_url)
    if (invoice_pdf != null) __obj.updateDynamic("invoice_pdf")(invoice_pdf)
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoice]
  }
}


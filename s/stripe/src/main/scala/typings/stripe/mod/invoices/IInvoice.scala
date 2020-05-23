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
  var application_fee: js.UndefOr[Double] = js.undefined
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
  var custom_fields: js.Array[ICustomField] | Null
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
  var customer_email: String | Null
  /**
    * The customer’s name. Until the invoice is finalized, this field will equal customer.name.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_name: String | Null
  /**
    * The customer’s phone number. Until the invoice is finalized, this field will equal customer.phone.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_phone: String | Null
  /**
    * The customer’s shipping information. Until the invoice is finalized, this field will equal customer.shipping.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_shipping: IShippingInformation | Null
  /**
    * The customer’s tax exempt status. Until the invoice is finalized, this field will equal customer.tax_exempt.
    * Once the invoice is finalized, this field will no longer be updated.
    */
  var customer_tax_exempt: String | Null
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
  var default_payment_method: String | IPaymentMethod | Null
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to
    * the subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: String | Null
  /**
    * The tax rates applied to this invoice, if any.
    */
  var default_tax_rates: js.Array[ITaxRate]
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * Referenced as ‘memo’ in the Dashboard.
    */
  var description: String | Null
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
  var footer: String | Null
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
  var next_payment_attempt: Double | Null
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
  var payment_intent: IPaymentIntent | String | Null
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
  var receipt_number: String | Null
  /**
    * Starting customer balance before attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be the current customer balance.
    */
  var starting_balance: Double
  /**
    * Extra information about an invoice for the customer's credit card statement.
    */
  var statement_descriptor: String | Null
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
  var subscription_proration_date: js.UndefOr[Double | Null] = js.undefined
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
  var threshold_reason: js.UndefOr[IThresholdReason] = js.undefined
  /**
    * Total after discount
    */
  var total: Double
  /**
    * The aggregate amounts calculated per tax rate for all line items.
    */
  var total_tax_amounts: js.Array[ITaxAmount] | Null
  /**
    * The time at which webhooks for this invoice were successfully delivered (if the invoice had no webhooks to
    * deliver, this will match date). Invoice payment is delayed until webhooks are delivered, or until all webhook
    * delivery attempts have been exhausted.
    */
  var webhooks_delivered_at: Double | Null
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
    total: Double,
    application_fee: js.UndefOr[Double] = js.undefined,
    charge: String | ICharge = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    collection_method: charge_automatically | send_invoice = null,
    custom_fields: js.Array[ICustomField] = null,
    customer_address: IAddress = null,
    customer_email: String = null,
    customer_name: String = null,
    customer_phone: String = null,
    customer_shipping: IShippingInformation = null,
    customer_tax_exempt: String = null,
    date: js.UndefOr[Double] = js.undefined,
    default_payment_method: String | IPaymentMethod = null,
    default_source: String = null,
    description: String = null,
    discount: IDiscount = null,
    due_date: Double = null.asInstanceOf[Double],
    ending_balance: Double = null.asInstanceOf[Double],
    footer: String = null,
    forgiven: js.UndefOr[Boolean] = js.undefined,
    hosted_invoice_url: String = null,
    invoice_pdf: String = null,
    next_payment_attempt: Double = null.asInstanceOf[Double],
    payment_intent: IPaymentIntent | String = null,
    receipt_number: String = null,
    statement_descriptor: String = null,
    subscription: String | ISubscription = null,
    subscription_proration_date: js.UndefOr[Null | Double] = js.undefined,
    tax: Double = null.asInstanceOf[Double],
    tax_percent: Double = null.asInstanceOf[Double],
    threshold_reason: IThresholdReason = null,
    total_tax_amounts: js.Array[ITaxAmount] = null,
    webhooks_delivered_at: Double = null.asInstanceOf[Double]
  ): IInvoice = {
    val __obj = js.Dynamic.literal(account_country = account_country.asInstanceOf[js.Any], account_name = account_name.asInstanceOf[js.Any], amount_due = amount_due.asInstanceOf[js.Any], amount_paid = amount_paid.asInstanceOf[js.Any], amount_remaining = amount_remaining.asInstanceOf[js.Any], application_fee_amount = application_fee_amount.asInstanceOf[js.Any], attempt_count = attempt_count.asInstanceOf[js.Any], attempted = attempted.asInstanceOf[js.Any], auto_advance = auto_advance.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], billing_reason = billing_reason.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_tax_ids = customer_tax_ids.asInstanceOf[js.Any], default_tax_rates = default_tax_rates.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], period_end = period_end.asInstanceOf[js.Any], period_start = period_start.asInstanceOf[js.Any], post_payment_credit_notes_amount = post_payment_credit_notes_amount.asInstanceOf[js.Any], pre_payment_credit_notes_amount = pre_payment_credit_notes_amount.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], customer_address = customer_address.asInstanceOf[js.Any], customer_email = customer_email.asInstanceOf[js.Any], customer_name = customer_name.asInstanceOf[js.Any], customer_phone = customer_phone.asInstanceOf[js.Any], customer_shipping = customer_shipping.asInstanceOf[js.Any], customer_tax_exempt = customer_tax_exempt.asInstanceOf[js.Any], default_payment_method = default_payment_method.asInstanceOf[js.Any], default_source = default_source.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], due_date = due_date.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], hosted_invoice_url = hosted_invoice_url.asInstanceOf[js.Any], invoice_pdf = invoice_pdf.asInstanceOf[js.Any], next_payment_attempt = next_payment_attempt.asInstanceOf[js.Any], payment_intent = payment_intent.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], tax_percent = tax_percent.asInstanceOf[js.Any], total_tax_amounts = total_tax_amounts.asInstanceOf[js.Any], webhooks_delivered_at = webhooks_delivered_at.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(application_fee)) __obj.updateDynamic("application_fee")(application_fee.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (collection_method != null) __obj.updateDynamic("collection_method")(collection_method.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forgiven)) __obj.updateDynamic("forgiven")(forgiven.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_proration_date)) __obj.updateDynamic("subscription_proration_date")(subscription_proration_date.asInstanceOf[js.Any])
    if (threshold_reason != null) __obj.updateDynamic("threshold_reason")(threshold_reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoice]
  }
}


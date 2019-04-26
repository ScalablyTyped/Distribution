package typings
package stripeLib.stripeMod.invoicesNs

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
trait IInvoice
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * Final amount due at this time for this invoice. If the invoice's total is smaller than the minimum charge
    * amount, for example, or if there is account credit that can be applied to the invoice, the amount_due may
    * be 0. If there is a positive starting_balance for the invoice (the customer owes money), the amount_due
    * will also take that into account. The charge that gets generated for the invoice will be for the amount
    * specified in amount_due.
    */
  var amount_due: scala.Double
  /**
    * The amount, in cents, that was paid.
    */
  var amount_paid: scala.Double
  /**
    * The amount remaining, in cents, that is due.
    */
  var amount_remaining: scala.Double
  /**
    * The fee in cents that will be applied to the invoice and transferred to the application owner's
    * Stripe account when the invoice is paid.
    *
    * @deprecated Stripe API Version 2019-03-14 changed the name of this property
    * @see application_fee_amount
    */
  var application_fee: scala.Double
  /**
    * The fee in pence that will be applied to the invoice and transferred to the application owner’s
    * Stripe account when the invoice is paid.
    *
    * @since Stripe API Version 2019-03-14
    */
  var application_fee_amount: scala.Double
  /**
    * Number of payment attempts made for this invoice, from the perspective of the payment retry schedule. Any
    * payment attempt counts as the first attempt, and subsequently only automatic retries increment the attempt
    * count. In other words, manual payment attempts after the first attempt do not affect the retry schedule.
    */
  var attempt_count: scala.Double
  /**
    * Whether or not an attempt has been made to pay the invoice. An invoice is not attempted until 1 hour after
    * the invoice.created webhook, for example, so you might not want to display that invoice as unpaid to your
    * users.
    */
  var attempted: scala.Boolean
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: scala.Boolean
  /**
    * Either `charge_automatically`, or `send_invoice`. When charging automatically,
    * Stripe will attempt to pay this invoice using the default source attached to the
    * customer. When sending an invoice, Stripe will email this invoice to the customer
    * with payment instructions.
    */
  var billing: stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice
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
  var billing_reason: stripeLib.stripeLibStrings.subscription_cycle | stripeLib.stripeLibStrings.subscription_create | stripeLib.stripeLibStrings.subscription_update | stripeLib.stripeLibStrings.subscription | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.upcoming | stripeLib.stripeLibStrings.subscription_threshold
  /**
    * ID of the latest charge generated for this invoice, if any. [Expandable]
    */
  var charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge
  /**
    * Whether or not the invoice is still trying to collect payment. An invoice is closed if it's either paid or
    * it has been marked closed. A closed invoice will no longer attempt to collect payment.
    */
  var closed: scala.Boolean
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: java.lang.String
  /**
    * Custom fields displayed on the invoice.
    */
  var custom_fields: js.Array[ICustomField]
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var date: scala.Double
  /**
    * ID of the default payment source for the invoice. It must belong to the customer
    * associated with the invoice and be in a chargeable state. If not set, defaults to
    * the subscription’s default source, if any, or to the customer’s default source.
    */
  var default_source: java.lang.String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * Referenced as ‘memo’ in the Dashboard.
    */
  var description: java.lang.String
  var discount: stripeLib.stripeMod.couponsNs.IDiscount | scala.Null
  /**
    * The date on which payment for this invoice is due. This value will be `null` for
    * invoices where `billing=charge_automatically`.
    */
  var due_date: scala.Double | scala.Null
  /**
    * Ending customer balance after attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be null.
    */
  var ending_balance: scala.Double | scala.Null
  /**
    * Footer displayed on the invoice.
    */
  var footer: java.lang.String
  /**
    * Whether or not the invoice has been forgiven. Forgiving an invoice instructs us to update the subscription
    * status as if the invoice were succcessfully paid. Once an invoice has been forgiven, it cannot be unforgiven
    * or reopened
    */
  var forgiven: scala.Boolean
  /**
    * The URL for the hosted invoice page, which allows customers to view and pay an
    * invoice. If the invoice has not been finalized yet, this will be null.
    */
  var hosted_invoice_url: java.lang.String | scala.Null
  /**
    * The link to download the PDF for the invoice. If the invoice has not been finalized
    * yet, this will be null.
    */
  var invoice_pdf: java.lang.String | scala.Null
  /**
    * The individual line items that make up the invoice.
    *
    * `lines` is sorted as follows: invoice items in reverse chronological order, followed
    * by the subscription, if any.
    */
  var lines: stripeLib.stripeMod.IList[IInvoiceLineItem]
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: scala.Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * The time at which payment will next be attempted.
    */
  var next_payment_attempt: scala.Double
  /**
    * A unique, identifying string that appears on emails sent to the customer for this invoice. This starts with the customer’s unique invoice_prefix if it is specified.
    */
  var number: java.lang.String
  /**
    * Value is 'invoice'
    */
  @JSName("object")
  var object_IInvoice: stripeLib.stripeLibStrings.invoice
  /**
    * Whether or not payment was successfully collected for this invoice. An invoice can be paid (most commonly)
    * with a charge or with credit from the customer's account balance.
    */
  var paid: scala.Boolean
  /**
    * End of the usage period during which invoice items were added to this invoice
    */
  var period_end: scala.Double
  /**
    * Start of the usage period during which invoice items were added to this invoice
    */
  var period_start: scala.Double
  /**
    * This is the transaction number that appears on email receipts sent for this invoice.
    */
  var receipt_number: java.lang.String
  /**
    * Starting customer balance before attempting to pay invoice. If the invoice has not been attempted yet,
    * this will be the current customer balance.
    */
  var starting_balance: scala.Double
  /**
    * Extra information about an invoice for the customer's credit card statement.
    */
  var statement_descriptor: java.lang.String
  /**
    * The status of the invoice, one of `draft`, `open`, `paid`, `uncollectible`, or `void`.
    */
  var status: stripeLib.stripeLibStrings.draft | stripeLib.stripeLibStrings.open | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.uncollectible | stripeLib.stripeLibStrings.void
  /**
    * Contains the timestamps when an invoice was finalized, paid, marked uncollectible, or voided
    */
  var status_transitions: IStatusTransitions
  /**
    * The subscription that this invoice was prepared for, if any.
    */
  var subscription: java.lang.String | stripeLib.stripeMod.subscriptionsNs.ISubscription
  /**
    * Only set for upcoming invoices that preview prorations. The time used to calculate prorations.
    */
  var subscription_proration_date: scala.Double
  /**
    * Total of all subscriptions, invoice items, and prorations on the invoice before any discount is applied
    */
  var subtotal: scala.Double
  /**
    * The amount of tax included in the total, calculated from tax_percent and the subtotal. If no tax_percent
    * is defined, this value will be null.
    */
  var tax: scala.Double | scala.Null
  /**
    * This percentage of the subtotal has been added to the total amount of the invoice, including invoice line
    * items and discounts. This field is inherited from the subscription's tax_percent field, but can be changed
    * before the invoice is paid. This field defaults to null.
    */
  var tax_percent: scala.Double | scala.Null
  /**
    * If `billing_reason` is set to `subscription_threshold` this returns more information
    * on which threshold rules triggered the invoice.
    */
  var threshold_reason: IThresholdReason
  /**
    * Total after discount
    */
  var total: scala.Double
  /**
    * The time at which webhooks for this invoice were successfully delivered (if the invoice had no webhooks to
    * deliver, this will match date). Invoice payment is delayed until webhooks are delivered, or until all webhook
    * delivery attempts have been exhausted.
    */
  var webhooks_delivered_at: scala.Double
}

object IInvoice {
  @scala.inline
  def apply(
    amount_due: scala.Double,
    amount_paid: scala.Double,
    amount_remaining: scala.Double,
    application_fee: scala.Double,
    application_fee_amount: scala.Double,
    attempt_count: scala.Double,
    attempted: scala.Boolean,
    auto_advance: scala.Boolean,
    billing: stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice,
    billing_reason: stripeLib.stripeLibStrings.subscription_cycle | stripeLib.stripeLibStrings.subscription_create | stripeLib.stripeLibStrings.subscription_update | stripeLib.stripeLibStrings.subscription | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.upcoming | stripeLib.stripeLibStrings.subscription_threshold,
    charge: java.lang.String | stripeLib.stripeMod.chargesNs.ICharge,
    closed: scala.Boolean,
    created: scala.Double,
    currency: java.lang.String,
    custom_fields: js.Array[ICustomField],
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer,
    date: scala.Double,
    default_source: java.lang.String,
    description: java.lang.String,
    footer: java.lang.String,
    forgiven: scala.Boolean,
    id: java.lang.String,
    lines: stripeLib.stripeMod.IList[IInvoiceLineItem],
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    next_payment_attempt: scala.Double,
    number: java.lang.String,
    `object`: stripeLib.stripeLibStrings.invoice,
    paid: scala.Boolean,
    period_end: scala.Double,
    period_start: scala.Double,
    receipt_number: java.lang.String,
    starting_balance: scala.Double,
    statement_descriptor: java.lang.String,
    status: stripeLib.stripeLibStrings.draft | stripeLib.stripeLibStrings.open | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.uncollectible | stripeLib.stripeLibStrings.void,
    status_transitions: IStatusTransitions,
    subscription: java.lang.String | stripeLib.stripeMod.subscriptionsNs.ISubscription,
    subscription_proration_date: scala.Double,
    subtotal: scala.Double,
    threshold_reason: IThresholdReason,
    total: scala.Double,
    webhooks_delivered_at: scala.Double,
    discount: stripeLib.stripeMod.couponsNs.IDiscount = null,
    due_date: scala.Int | scala.Double = null,
    ending_balance: scala.Int | scala.Double = null,
    hosted_invoice_url: java.lang.String = null,
    invoice_pdf: java.lang.String = null,
    tax: scala.Int | scala.Double = null,
    tax_percent: scala.Int | scala.Double = null
  ): IInvoice = {
    val __obj = js.Dynamic.literal(amount_due = amount_due, amount_paid = amount_paid, amount_remaining = amount_remaining, application_fee = application_fee, application_fee_amount = application_fee_amount, attempt_count = attempt_count, attempted = attempted, auto_advance = auto_advance, billing = billing.asInstanceOf[js.Any], billing_reason = billing_reason.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], closed = closed, created = created, currency = currency, custom_fields = custom_fields, customer = customer.asInstanceOf[js.Any], date = date, default_source = default_source, description = description, footer = footer, forgiven = forgiven, id = id, lines = lines, livemode = livemode, metadata = metadata, next_payment_attempt = next_payment_attempt, number = number, paid = paid, period_end = period_end, period_start = period_start, receipt_number = receipt_number, starting_balance = starting_balance, statement_descriptor = statement_descriptor, status = status.asInstanceOf[js.Any], status_transitions = status_transitions, subscription = subscription.asInstanceOf[js.Any], subscription_proration_date = subscription_proration_date, subtotal = subtotal, threshold_reason = threshold_reason, total = total, webhooks_delivered_at = webhooks_delivered_at)
    __obj.updateDynamic("object")(`object`)
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (ending_balance != null) __obj.updateDynamic("ending_balance")(ending_balance.asInstanceOf[js.Any])
    if (hosted_invoice_url != null) __obj.updateDynamic("hosted_invoice_url")(hosted_invoice_url)
    if (invoice_pdf != null) __obj.updateDynamic("invoice_pdf")(invoice_pdf)
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoice]
  }
}


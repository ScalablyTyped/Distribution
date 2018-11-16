package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

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
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
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
               */
  var application_fee: scala.Double
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
               * Either charge_automatically, or send_invoice. When charging automatically, Stripe will attempt to pay this invoice using the default source attached to the customer. When sending an invoice, Stripe will email this invoice to the customer with payment instructions.
               */
  var billing: stripeLib.stripeLibStrings.charge_automatically | stripeLib.stripeLibStrings.send_invoice
  /**
               * Indicates the reason why the invoice was created. subscription_cycle indicates an invoice created by a subscription advancing into a new period. subscription_update indicates an invoice created due to creating or updating a subscription. subscription is set for all old invoices to indicate either a change to a subscription or a period advancement. manual is set for all invoices unrelated to a subscription (for example: created via the invoice editor). The upcoming value is reserved for simulated invoices per the upcoming invoice endpoint.
               */
  var billing_reason: stripeLib.stripeLibStrings.subscription_cycle | stripeLib.stripeLibStrings.subscription_update | stripeLib.stripeLibStrings.subscription | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.upcoming
  /**
               * ID of the latest charge generated for this invoice, if any. [Expandable]
               */
  var charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
  /**
               * Whether or not the invoice is still trying to collect payment. An invoice is closed if it's either paid or
               * it has been marked closed. A closed invoice will no longer attempt to collect payment.
               */
  var closed: scala.Boolean
  /**
               * Three-letter ISO currency code, in lowercase. Must be a supported currency.
               */
  var currency: java.lang.String
  var customer: java.lang.String
  /**
               * Time at which the object was created. Measured in seconds since the Unix epoch.
               */
  var date: scala.Double
  /**
               * An arbitrary string attached to the object. Often useful for displaying to users.
               */
  var description: java.lang.String
  var discount: stripeLib.stripeMod.StripeNs.couponsNs.IDiscount
  /**
               * The date on which payment for this invoice is due. This value will be null for invoices where billing=charge_automatically.
               */
  var due_date: scala.Double | scala.Null
  /**
               * Ending customer balance after attempting to pay invoice. If the invoice has not been attempted yet,
               * this will be null.
               */
  var ending_balance: scala.Double | scala.Null
  /**
               * Whether or not the invoice has been forgiven. Forgiving an invoice instructs us to update the subscription
               * status as if the invoice were succcessfully paid. Once an invoice has been forgiven, it cannot be unforgiven
               * or reopened
               */
  var forgiven: scala.Boolean
  /**
               * The URL for the hosted invoice page, which allows customers to view and pay an invoice. If the invoice has not been frozen yet, this will be null.
               */
  var hosted_invoice_url: java.lang.String | scala.Null
  /**
               * The link to download the PDF for the invoice. If the invoice has not been frozen yet, this will be null.
               */
  var invoice_pdf: java.lang.String | scala.Null
  /**
               * The individual line items that make up the invoice.
               *
               * lines is sorted as follows: invoice items in reverse chronological order, followed by the subscription, if any.
               */
  var lines: stripeLib.stripeMod.StripeNs.IList[IInvoiceLineItem]
  /**
               * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
               */
  var livemode: scala.Boolean
  /**
               * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
               */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
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
               * The subscription that this invoice was prepared for, if any.
               */
  var subscription: java.lang.String | stripeLib.stripeMod.StripeNs.subscriptionsNs.ISubscription
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


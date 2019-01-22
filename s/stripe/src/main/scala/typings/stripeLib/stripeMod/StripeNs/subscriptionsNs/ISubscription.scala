package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscriptions allow you to charge a customer's card on a recurring basis. A subscription ties a customer to
  * a particular plan you've created: https://stripe.com/docs/api#create_plan
  */
trait ISubscription
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * A positive decimal that represents the fee percentage of the subscription invoice amount that will be transferred to
    * the application owner's Stripe account each billing period.
    */
  var application_fee_percent: scala.Double
  /**
    * Either "charge_automatically", or "send_invoice". When charging automatically, Stripe will attempt to pay this subscription at the
    * end of the cycle using the default source attached to the customer. When sending an invoice, Stripe will email your customer an
    * invoice with payment instructions.
    */
  var billing: SubscriptionBilling
  /**
    * If the subscription has been canceled with the at_period_end flag set to true, cancel_at_period_end on the
    * subscription will be true. You can use this attribute to determine whether a subscription that has a status
    * of active is scheduled to be canceled at the end of the current period.
    */
  var cancel_at_period_end: scala.Boolean
  /**
    * If the subscription has been canceled, the date of that cancellation. If the subscription was canceled with
    * cancel_at_period_end, canceled_at will still reflect the date of the initial cancellation request, not the end of the
    * subscription period when the subscription is automatically moved to a canceled state.
    */
  var canceled_at: scala.Double | scala.Null
  var created: scala.Double
  /**
    * End of the current period that the subscription has been invoiced for. At the end of this period, a new invoice will be created.
    */
  var current_period_end: scala.Double
  /**
    * Start of the current period that the subscription has been invoiced for
    */
  var current_period_start: scala.Double
  /**
    * ID of the customer who owns the subscription. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer
  /**
    * Describes the current discount applied to this subscription, if there is one. When billing, a discount applied to a
    * subscription overrides a discount applied on a customer-wide basis.
    */
  var discount: stripeLib.stripeMod.StripeNs.couponsNs.IDiscount | scala.Null
  /**
    * If the subscription has ended (either because it was canceled or because the customer was switched to a subscription
    * to a new plan), the date the subscription ended
    */
  var ended_at: scala.Double | scala.Null
  var items: stripeLib.stripeMod.StripeNs.IList[stripeLib.stripeMod.StripeNs.subscriptionItemsNs.ISubscriptionItem]
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "subscription"
    */
  @JSName("object")
  var object_ISubscription: stripeLib.stripeLibStrings.subscription
  /**
    * Hash describing the plan the customer is subscribed to
    */
  var plan: stripeLib.stripeMod.StripeNs.plansNs.IPlan
  /**
    * The number of subscriptions for the associated plan
    */
  var quantity: scala.Double
  /**
    * Date the subscription started
    */
  var start: scala.Double
  /**
    * Possible values are "trialing", "active", "past_due", "canceled", or "unpaid". A subscription still in its trial period is trialing
    * and moves to active when the trial period is over. When payment to renew the subscription fails, the subscription becomes
    * past_due. After Stripe has exhausted all payment retry attempts, the subscription ends up with a status of either canceled
    * or unpaid depending on your retry settings. Note that when a subscription has a status of unpaid, no subsequent invoices
    * will be attempted (invoices will be created, but then immediately automatically closed. Additionally, updating customer
    * card details will not lead to Stripe retrying the latest invoice.). After receiving updated card details from a customer,
    * you may choose to reopen and pay their closed invoices.
    */
  var status: SubscriptionStatus
  /**
    * If provided, each invoice created by this subscription will apply the tax rate, increasing the amount billed to the customer.
    */
  var tax_percent: scala.Double
  /**
    * If the subscription has a trial, the end of that trial.
    */
  var trial_end: scala.Double | scala.Null
  /**
    * If the subscription has a trial, the beginning of that trial.
    */
  var trial_start: scala.Double | scala.Null
}


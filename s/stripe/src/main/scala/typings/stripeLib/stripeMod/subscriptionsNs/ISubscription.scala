package typings
package stripeLib.stripeMod.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscriptions allow you to charge a customer's card on a recurring basis. A subscription ties a customer to
  * a particular plan you've created: https://stripe.com/docs/api#create_plan
  */
trait ISubscription
  extends stripeLib.stripeMod.IResourceObject {
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
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer
  /**
    * ID of the default payment source for the subscription.
    * It must belong to the customer associated with the subscription and be in a chargeable state.
    * If not set, defaults to the customer’s default source. [Expandable]
    */
  var default_source: java.lang.String
  /**
    * Describes the current discount applied to this subscription, if there is one. When billing, a discount applied to a
    * subscription overrides a discount applied on a customer-wide basis.
    */
  var discount: stripeLib.stripeMod.couponsNs.IDiscount | scala.Null
  /**
    * If the subscription has ended (either because it was canceled or because the customer was switched to a subscription
    * to a new plan), the date the subscription ended
    */
  var ended_at: scala.Double | scala.Null
  var items: stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem]
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * Value is "subscription"
    */
  @JSName("object")
  var object_ISubscription: stripeLib.stripeLibStrings.subscription
  /**
    * Hash describing the plan the customer is subscribed to.  Only set if the subscription
    * contains a single plan.
    */
  var plan: js.UndefOr[stripeLib.stripeMod.plansNs.IPlan | scala.Null] = js.undefined
  /**
    * The number of subscriptions for the associated plan
    */
  var quantity: scala.Double
  /**
    * Date the subscription started
    */
  var start: scala.Double
  /**
    * Possible values are `incomplete`, `incomplete_expired`, `trialing`, `active`,
    * `past_due`, `canceled`, or `unpaid`.
    *
    * For `billing=charge_automatically` a subscription moves into `incomplete` if the
    * initial payment attempt fails. A subscription in this state can only have metadata
    * and default_source updated. Once the first invoice is paid, the subscription moves
    * into an `active` state. If the first invoice is not paid within 23 hours, the
    * subscription transitions to `incomplete_expired`. This is a terminal state, the open
    * invoice will be voided and no further invoices will be generated.
    *
    * A subscription that is currently in a trial period is `trialing` and moves to
    * `active` when the trial period is over.
    *
    * If subscription `billing=charge_automatically` it becomes `past_due` when payment to
    * renew it fails and `canceled` or `unpaid` (depending on your subscriptions settings)
    * when Stripe has exhausted all payment retry attempts.
    *
    * If subscription `billing=send_invoice` it becomes `past_due` when its invoice is not
    * paid by the due date, and `canceled` or `unpaid` if it is still not paid by an
    * additional deadline after that. Note that when a subscription has a status of
    * `unpaid`, no subsequent invoices will be attempted (invoices will be created, but
    * then immediately automatically closed). After receiving updated payment information
    * from a customer, you may choose to reopen and pay their closed invoices.
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

object ISubscription {
  @scala.inline
  def apply(
    application_fee_percent: scala.Double,
    billing: SubscriptionBilling,
    cancel_at_period_end: scala.Boolean,
    created: scala.Double,
    current_period_end: scala.Double,
    current_period_start: scala.Double,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer,
    default_source: java.lang.String,
    id: java.lang.String,
    items: stripeLib.stripeMod.IList[stripeLib.stripeMod.subscriptionItemsNs.ISubscriptionItem],
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.subscription,
    quantity: scala.Double,
    start: scala.Double,
    status: SubscriptionStatus,
    tax_percent: scala.Double,
    canceled_at: scala.Int | scala.Double = null,
    discount: stripeLib.stripeMod.couponsNs.IDiscount = null,
    ended_at: scala.Int | scala.Double = null,
    plan: stripeLib.stripeMod.plansNs.IPlan = null,
    trial_end: scala.Int | scala.Double = null,
    trial_start: scala.Int | scala.Double = null
  ): ISubscription = {
    val __obj = js.Dynamic.literal(application_fee_percent = application_fee_percent, billing = billing, cancel_at_period_end = cancel_at_period_end, created = created, current_period_end = current_period_end, current_period_start = current_period_start, customer = customer.asInstanceOf[js.Any], default_source = default_source, id = id, items = items, metadata = metadata, quantity = quantity, start = start, status = status, tax_percent = tax_percent)
    __obj.updateDynamic("object")(`object`)
    if (canceled_at != null) __obj.updateDynamic("canceled_at")(canceled_at.asInstanceOf[js.Any])
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (ended_at != null) __obj.updateDynamic("ended_at")(ended_at.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    if (trial_start != null) __obj.updateDynamic("trial_start")(trial_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscription]
  }
}


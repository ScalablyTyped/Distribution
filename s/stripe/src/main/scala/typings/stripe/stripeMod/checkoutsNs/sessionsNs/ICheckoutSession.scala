package typings.stripe.stripeMod.checkoutsNs.sessionsNs

import typings.stripe.stripeMod.customersNs.ICustomer
import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntent
import typings.stripe.stripeMod.subscriptionsNs.ISubscription
import typings.stripe.stripeStrings.payment
import typings.stripe.stripeStrings.setup
import typings.stripe.stripeStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutSession extends js.Object {
  /**
    * Whether or not billing address was collected
    */
  var billing_address_collection: js.UndefOr[String] = js.undefined
  /**
    * URL the customer will be redirected to upon cancellation
    */
  var cancel_url: String
  /**
    * Unique reference to session
    */
  var client_reference_id: js.UndefOr[String] = js.undefined
  /**
    * ID of customer [Expandable]
    */
  var customer: js.UndefOr[String | ICustomer] = js.undefined
  /**
    * Email address of customer
    */
  var customer_email: js.UndefOr[String] = js.undefined
  /**
    * The line items purchased
    */
  var display_items: js.Array[ICheckoutLineItems]
  /**
    * Unique ID for checkout session to pass to `redirectToCheckout` in Stripe.js
    */
  var id: String
  /**
    * If the object is in live mode or not
    */
  var livemode: Boolean
  /**
    * Language tag of the checkout session
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.undefined
  /**
    * String of object type. Is always 'checkout.session'
    */
  var `object`: String
  /**
    * ID of payment intent created [Expandable]
    */
  var payment_intent: js.UndefOr[String | IPaymentIntent] = js.undefined
  /**
    * Array of accepted payment methods
    */
  var payment_method_types: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The ID of the SetupIntent for Checkout Sessions in setup mode.
    */
  var setup_intent: js.UndefOr[String | Null] = js.undefined
  /**
    * ID of subscription if one was created [Expandable]
    */
  var subscription: js.UndefOr[String | ISubscription] = js.undefined
  /**
    * URL to redirect to upon success
    */
  var success_url: String
}

object ICheckoutSession {
  @scala.inline
  def apply(
    cancel_url: String,
    display_items: js.Array[ICheckoutLineItems],
    id: String,
    livemode: Boolean,
    `object`: String,
    success_url: String,
    billing_address_collection: String = null,
    client_reference_id: String = null,
    customer: String | ICustomer = null,
    customer_email: String = null,
    locale: String = null,
    mode: payment | setup | subscription = null,
    payment_intent: String | IPaymentIntent = null,
    payment_method_types: js.Array[String] = null,
    setup_intent: String = null,
    subscription: String | ISubscription = null
  ): ICheckoutSession = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url, display_items = display_items, id = id, livemode = livemode, success_url = success_url)
    __obj.updateDynamic("object")(`object`)
    if (billing_address_collection != null) __obj.updateDynamic("billing_address_collection")(billing_address_collection)
    if (client_reference_id != null) __obj.updateDynamic("client_reference_id")(client_reference_id)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent.asInstanceOf[js.Any])
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types)
    if (setup_intent != null) __obj.updateDynamic("setup_intent")(setup_intent)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutSession]
  }
}


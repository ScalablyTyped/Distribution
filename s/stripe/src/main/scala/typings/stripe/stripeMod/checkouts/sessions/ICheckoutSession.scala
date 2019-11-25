package typings.stripe.stripeMod.checkouts.sessions

import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeMod.paymentIntents.IPaymentIntent
import typings.stripe.stripeMod.subscriptions.ISubscription
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
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], display_items = display_items.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (billing_address_collection != null) __obj.updateDynamic("billing_address_collection")(billing_address_collection.asInstanceOf[js.Any])
    if (client_reference_id != null) __obj.updateDynamic("client_reference_id")(client_reference_id.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (payment_intent != null) __obj.updateDynamic("payment_intent")(payment_intent.asInstanceOf[js.Any])
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types.asInstanceOf[js.Any])
    if (setup_intent != null) __obj.updateDynamic("setup_intent")(setup_intent.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutSession]
  }
}


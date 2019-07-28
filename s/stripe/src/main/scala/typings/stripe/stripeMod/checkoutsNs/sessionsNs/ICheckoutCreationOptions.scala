package typings.stripe.stripeMod.checkoutsNs.sessionsNs

import typings.stripe.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions
import typings.stripe.stripeMod.subscriptionsNs.ISubscription
import typings.stripe.stripeStrings.auto
import typings.stripe.stripeStrings.da
import typings.stripe.stripeStrings.de
import typings.stripe.stripeStrings.en
import typings.stripe.stripeStrings.es
import typings.stripe.stripeStrings.fi
import typings.stripe.stripeStrings.fr
import typings.stripe.stripeStrings.it
import typings.stripe.stripeStrings.ja
import typings.stripe.stripeStrings.nb
import typings.stripe.stripeStrings.nl
import typings.stripe.stripeStrings.pl
import typings.stripe.stripeStrings.pt
import typings.stripe.stripeStrings.required
import typings.stripe.stripeStrings.sv
import typings.stripe.stripeStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutCreationOptions extends js.Object {
  /**
    * Whether to collect shipping info.
    * If 'required', info will always be collected.
    * When 'auto' or not specified, info will be collected when required
    */
  var billing_address_collection: js.UndefOr[required | auto] = js.undefined
  /**
    * The URL to return the customer to if they cancel payment
    */
  var cancel_url: String
  /**
    * An optional unique ID to associate with the checkout
    */
  var client_reference_id: js.UndefOr[String] = js.undefined
  /**
    * Must be used with @param line_items
    * ID of existing customer to use
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * Email of the customer
    */
  var customer_email: js.UndefOr[String] = js.undefined
  /**
    * A list of items the customer is purchasing. One-time.
    */
  var line_items: js.UndefOr[js.Array[ICheckoutLineItems]] = js.undefined
  /**
    * Language to use. If 'auto' or not specified, browser default is used
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh] = js.undefined
  /**
    * Details for creation of payment intent
    */
  var payment_intent_data: js.UndefOr[IPaymentIntentCaptureOptions] = js.undefined
  /**
    * A list of accepted payment types.
    * 'card' is currently the only supported options
    */
  var payment_method_types: js.Array[String]
  /**
    * Use instead of @param line_items when using a subscription
    */
  var subscription_data: js.UndefOr[ISubscription] = js.undefined
  /**
    * The url to return to upon successful payment
    */
  var success_url: String
}

object ICheckoutCreationOptions {
  @scala.inline
  def apply(
    cancel_url: String,
    payment_method_types: js.Array[String],
    success_url: String,
    billing_address_collection: required | auto = null,
    client_reference_id: String = null,
    customer: String = null,
    customer_email: String = null,
    line_items: js.Array[ICheckoutLineItems] = null,
    locale: auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh = null,
    payment_intent_data: IPaymentIntentCaptureOptions = null,
    subscription_data: ISubscription = null
  ): ICheckoutCreationOptions = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url, payment_method_types = payment_method_types, success_url = success_url)
    if (billing_address_collection != null) __obj.updateDynamic("billing_address_collection")(billing_address_collection.asInstanceOf[js.Any])
    if (client_reference_id != null) __obj.updateDynamic("client_reference_id")(client_reference_id)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email)
    if (line_items != null) __obj.updateDynamic("line_items")(line_items)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (payment_intent_data != null) __obj.updateDynamic("payment_intent_data")(payment_intent_data)
    if (subscription_data != null) __obj.updateDynamic("subscription_data")(subscription_data)
    __obj.asInstanceOf[ICheckoutCreationOptions]
  }
}


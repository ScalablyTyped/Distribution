package typings
package stripeLib.stripeMod.checkoutsNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckoutCreationOptions extends js.Object {
  /**
    * Whether to collect shipping info.
    * If 'required', info will always be collected.
    * When 'auto' or not specified, info will be collected when required
    */
  var billing_address_collection: js.UndefOr[stripeLib.stripeLibStrings.required | stripeLib.stripeLibStrings.auto] = js.undefined
  /**
    * The URL to return the customer to if they cancel payment
    */
  var cancel_url: java.lang.String
  /**
    * An optional unique ID to associate with the checkout
    */
  var client_reference_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Must be used with @param line_items
    * ID of existing customer to use
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Email of the customer
    */
  var customer_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of items the customer is purchasing. One-time.
    */
  var line_items: js.UndefOr[js.Array[ICheckoutLineItems]] = js.undefined
  /**
    * Language to use. If 'auto' or not specified, browser default is used
    */
  var locale: js.UndefOr[
    stripeLib.stripeLibStrings.auto | stripeLib.stripeLibStrings.da | stripeLib.stripeLibStrings.de | stripeLib.stripeLibStrings.en | stripeLib.stripeLibStrings.es | stripeLib.stripeLibStrings.fi | stripeLib.stripeLibStrings.fr | stripeLib.stripeLibStrings.it | stripeLib.stripeLibStrings.ja | stripeLib.stripeLibStrings.nb | stripeLib.stripeLibStrings.nl | stripeLib.stripeLibStrings.pl | stripeLib.stripeLibStrings.pt | stripeLib.stripeLibStrings.sv | stripeLib.stripeLibStrings.zh
  ] = js.undefined
  /**
    * Details for creation of payment intent
    */
  var payment_intent_data: js.UndefOr[stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions] = js.undefined
  /**
    * A list of accepted payment types.
    * 'card' is currently the only supported options
    */
  var payment_method_types: js.Array[java.lang.String]
  /**
    * Use instead of @param line_items when using a subscription
    */
  var subscription_data: js.UndefOr[stripeLib.stripeMod.subscriptionsNs.ISubscription] = js.undefined
  /**
    * The url to return to upon successful payment
    */
  var success_url: java.lang.String
}

object ICheckoutCreationOptions {
  @scala.inline
  def apply(
    cancel_url: java.lang.String,
    payment_method_types: js.Array[java.lang.String],
    success_url: java.lang.String,
    billing_address_collection: stripeLib.stripeLibStrings.required | stripeLib.stripeLibStrings.auto = null,
    client_reference_id: java.lang.String = null,
    customer: java.lang.String = null,
    customer_email: java.lang.String = null,
    line_items: js.Array[ICheckoutLineItems] = null,
    locale: stripeLib.stripeLibStrings.auto | stripeLib.stripeLibStrings.da | stripeLib.stripeLibStrings.de | stripeLib.stripeLibStrings.en | stripeLib.stripeLibStrings.es | stripeLib.stripeLibStrings.fi | stripeLib.stripeLibStrings.fr | stripeLib.stripeLibStrings.it | stripeLib.stripeLibStrings.ja | stripeLib.stripeLibStrings.nb | stripeLib.stripeLibStrings.nl | stripeLib.stripeLibStrings.pl | stripeLib.stripeLibStrings.pt | stripeLib.stripeLibStrings.sv | stripeLib.stripeLibStrings.zh = null,
    payment_intent_data: stripeLib.stripeMod.paymentIntentsNs.IPaymentIntentCaptureOptions = null,
    subscription_data: stripeLib.stripeMod.subscriptionsNs.ISubscription = null
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


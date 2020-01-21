package typings.stripe.mod.checkouts.sessions

import typings.stripe.mod.paymentIntents.IPaymentIntentData
import typings.stripe.mod.paymentIntents.IPaymentIntentSessionSubset
import typings.stripe.mod.setupIntents.ISetupIntentSessionSubset
import typings.stripe.mod.subscriptions.ISubscriptionCustCreationOptions
import typings.stripe.stripeStrings.auto
import typings.stripe.stripeStrings.book
import typings.stripe.stripeStrings.da
import typings.stripe.stripeStrings.de
import typings.stripe.stripeStrings.donate
import typings.stripe.stripeStrings.en
import typings.stripe.stripeStrings.es
import typings.stripe.stripeStrings.fi
import typings.stripe.stripeStrings.fr
import typings.stripe.stripeStrings.it
import typings.stripe.stripeStrings.ja
import typings.stripe.stripeStrings.nb
import typings.stripe.stripeStrings.nl
import typings.stripe.stripeStrings.pay
import typings.stripe.stripeStrings.payment
import typings.stripe.stripeStrings.pl
import typings.stripe.stripeStrings.pt
import typings.stripe.stripeStrings.required
import typings.stripe.stripeStrings.setup
import typings.stripe.stripeStrings.subscription
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
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.undefined
  /**
    * Details for creation of payment intent
    */
  var payment_intent_data: js.UndefOr[IPaymentIntentSessionSubset | IPaymentIntentData] = js.undefined
  /**
    * A list of accepted payment types.
    * 'card' is currently the only supported options
    */
  var payment_method_types: js.Array[String]
  /**
    * A subset of parameters to be passed to SetupIntent creation.
    */
  var setup_intent_data: js.UndefOr[ISetupIntentSessionSubset] = js.undefined
  /**
    * Describes the type of transaction being performed by Checkout in order to customize relevant text on the page, such as the submit button.
    * submit_type can only be specified on Checkout Sessions using line items or a SKU, but not Checkout Sessions for subscriptions.
    * Supported values are auto, book, donate, or pay.
    */
  var submit_type: js.UndefOr[auto | book | donate | pay] = js.undefined
  /**
    * Use instead of @param line_items when using a subscription
    */
  var subscription_data: js.UndefOr[ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions] = js.undefined
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
    mode: payment | setup | subscription = null,
    payment_intent_data: IPaymentIntentSessionSubset | IPaymentIntentData = null,
    setup_intent_data: ISetupIntentSessionSubset = null,
    submit_type: auto | book | donate | pay = null,
    subscription_data: ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions = null
  ): ICheckoutCreationOptions = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    if (billing_address_collection != null) __obj.updateDynamic("billing_address_collection")(billing_address_collection.asInstanceOf[js.Any])
    if (client_reference_id != null) __obj.updateDynamic("client_reference_id")(client_reference_id.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email.asInstanceOf[js.Any])
    if (line_items != null) __obj.updateDynamic("line_items")(line_items.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (payment_intent_data != null) __obj.updateDynamic("payment_intent_data")(payment_intent_data.asInstanceOf[js.Any])
    if (setup_intent_data != null) __obj.updateDynamic("setup_intent_data")(setup_intent_data.asInstanceOf[js.Any])
    if (submit_type != null) __obj.updateDynamic("submit_type")(submit_type.asInstanceOf[js.Any])
    if (subscription_data != null) __obj.updateDynamic("subscription_data")(subscription_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutCreationOptions]
  }
}


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

@js.native
trait ICheckoutCreationOptions extends js.Object {
  /**
    * Whether to collect shipping info.
    * If 'required', info will always be collected.
    * When 'auto' or not specified, info will be collected when required
    */
  var billing_address_collection: js.UndefOr[required | auto] = js.native
  /**
    * The URL to return the customer to if they cancel payment
    */
  var cancel_url: String = js.native
  /**
    * An optional unique ID to associate with the checkout
    */
  var client_reference_id: js.UndefOr[String] = js.native
  /**
    * Must be used with @param line_items
    * ID of existing customer to use
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * Email of the customer
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * A list of items the customer is purchasing. One-time.
    */
  var line_items: js.UndefOr[js.Array[ICheckoutLineItems]] = js.native
  /**
    * Language to use. If 'auto' or not specified, browser default is used
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh] = js.native
  /**
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.native
  /**
    * Details for creation of payment intent
    */
  var payment_intent_data: js.UndefOr[IPaymentIntentSessionSubset | IPaymentIntentData] = js.native
  /**
    * A list of accepted payment types.
    * 'card' is currently the only supported options
    */
  var payment_method_types: js.Array[String] = js.native
  /**
    * A subset of parameters to be passed to SetupIntent creation.
    */
  var setup_intent_data: js.UndefOr[ISetupIntentSessionSubset] = js.native
  /**
    * Describes the type of transaction being performed by Checkout in order to customize relevant text on the page, such as the submit button.
    * submit_type can only be specified on Checkout Sessions using line items or a SKU, but not Checkout Sessions for subscriptions.
    * Supported values are auto, book, donate, or pay.
    */
  var submit_type: js.UndefOr[auto | book | donate | pay] = js.native
  /**
    * Use instead of @param line_items when using a subscription
    */
  var subscription_data: js.UndefOr[ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions] = js.native
  /**
    * The url to return to upon successful payment
    */
  var success_url: String = js.native
}

object ICheckoutCreationOptions {
  @scala.inline
  def apply(cancel_url: String, payment_method_types: js.Array[String], success_url: String): ICheckoutCreationOptions = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutCreationOptions]
  }
  @scala.inline
  implicit class ICheckoutCreationOptionsOps[Self <: ICheckoutCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel_url(value: String): Self = this.set("cancel_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment_method_typesVarargs(value: String*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[String]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess_url(value: String): Self = this.set("success_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_address_collection(value: required | auto): Self = this.set("billing_address_collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_address_collection: Self = this.set("billing_address_collection", js.undefined)
    @scala.inline
    def setClient_reference_id(value: String): Self = this.set("client_reference_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_reference_id: Self = this.set("client_reference_id", js.undefined)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setCustomer_email(value: String): Self = this.set("customer_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_email: Self = this.set("customer_email", js.undefined)
    @scala.inline
    def setLine_itemsVarargs(value: ICheckoutLineItems*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[ICheckoutLineItems]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_items: Self = this.set("line_items", js.undefined)
    @scala.inline
    def setLocale(value: auto | da | de | en | es | fi | fr | it | ja | nb | nl | pl | pt | sv | zh): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: payment | setup | subscription): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPayment_intent_data(value: IPaymentIntentSessionSubset | IPaymentIntentData): Self = this.set("payment_intent_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_intent_data: Self = this.set("payment_intent_data", js.undefined)
    @scala.inline
    def setSetup_intent_data(value: ISetupIntentSessionSubset): Self = this.set("setup_intent_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_intent_data: Self = this.set("setup_intent_data", js.undefined)
    @scala.inline
    def setSubmit_type(value: auto | book | donate | pay): Self = this.set("submit_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmit_type: Self = this.set("submit_type", js.undefined)
    @scala.inline
    def setSubscription_data(value: ICheckOutCreationSubscriptionData | ISubscriptionCustCreationOptions): Self = this.set("subscription_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_data: Self = this.set("subscription_data", js.undefined)
  }
  
}


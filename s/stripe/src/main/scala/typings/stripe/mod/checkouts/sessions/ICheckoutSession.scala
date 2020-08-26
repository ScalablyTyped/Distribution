package typings.stripe.mod.checkouts.sessions

import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.paymentIntents.IPaymentIntent
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.stripeStrings.payment
import typings.stripe.stripeStrings.setup
import typings.stripe.stripeStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckoutSession extends js.Object {
  /**
    * Whether or not billing address was collected
    */
  var billing_address_collection: js.UndefOr[String] = js.native
  /**
    * URL the customer will be redirected to upon cancellation
    */
  var cancel_url: String = js.native
  /**
    * Unique reference to session
    */
  var client_reference_id: js.UndefOr[String] = js.native
  /**
    * ID of customer [Expandable]
    */
  var customer: js.UndefOr[String | ICustomer] = js.native
  /**
    * Email address of customer
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * The line items purchased
    */
  var display_items: js.Array[ICheckoutLineItems] = js.native
  /**
    * Unique ID for checkout session to pass to `redirectToCheckout` in Stripe.js
    */
  var id: String = js.native
  /**
    * If the object is in live mode or not
    */
  var livemode: Boolean = js.native
  /**
    * Language tag of the checkout session
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The mode of the Checkout Session, one of payment, setup, or subscription.
    */
  var mode: js.UndefOr[payment | setup | subscription] = js.native
  /**
    * String of object type. Is always 'checkout.session'
    */
  var `object`: String = js.native
  /**
    * ID of payment intent created [Expandable]
    */
  var payment_intent: js.UndefOr[String | IPaymentIntent] = js.native
  /**
    * Array of accepted payment methods
    */
  var payment_method_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the SetupIntent for Checkout Sessions in setup mode.
    */
  var setup_intent: js.UndefOr[String | Null] = js.native
  /**
    * ID of subscription if one was created [Expandable]
    */
  var subscription: js.UndefOr[String | ISubscription] = js.native
  /**
    * URL to redirect to upon success
    */
  var success_url: String = js.native
}

object ICheckoutSession {
  @scala.inline
  def apply(
    cancel_url: String,
    display_items: js.Array[ICheckoutLineItems],
    id: String,
    livemode: Boolean,
    `object`: String,
    success_url: String
  ): ICheckoutSession = {
    val __obj = js.Dynamic.literal(cancel_url = cancel_url.asInstanceOf[js.Any], display_items = display_items.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], success_url = success_url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckoutSession]
  }
  @scala.inline
  implicit class ICheckoutSessionOps[Self <: ICheckoutSession] (val x: Self) extends AnyVal {
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
    def setDisplay_itemsVarargs(value: ICheckoutLineItems*): Self = this.set("display_items", js.Array(value :_*))
    @scala.inline
    def setDisplay_items(value: js.Array[ICheckoutLineItems]): Self = this.set("display_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess_url(value: String): Self = this.set("success_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_address_collection(value: String): Self = this.set("billing_address_collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_address_collection: Self = this.set("billing_address_collection", js.undefined)
    @scala.inline
    def setClient_reference_id(value: String): Self = this.set("client_reference_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_reference_id: Self = this.set("client_reference_id", js.undefined)
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setCustomer_email(value: String): Self = this.set("customer_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_email: Self = this.set("customer_email", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: payment | setup | subscription): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPayment_intent(value: String | IPaymentIntent): Self = this.set("payment_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_intent: Self = this.set("payment_intent", js.undefined)
    @scala.inline
    def setPayment_method_typesVarargs(value: String*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[String]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_types: Self = this.set("payment_method_types", js.undefined)
    @scala.inline
    def setSetup_intent(value: String): Self = this.set("setup_intent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_intent: Self = this.set("setup_intent", js.undefined)
    @scala.inline
    def setSetup_intentNull: Self = this.set("setup_intent", null)
    @scala.inline
    def setSubscription(value: String | ISubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}


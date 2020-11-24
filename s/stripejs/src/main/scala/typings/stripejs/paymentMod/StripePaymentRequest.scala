package typings.stripejs.paymentMod

import typings.stripejs.stripejsStrings.cancel
import typings.stripejs.stripejsStrings.shippingaddresschange
import typings.stripejs.stripejsStrings.shippingoptionchange
import typings.stripejs.stripejsStrings.source
import typings.stripejs.stripejsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripePaymentRequest extends js.Object {
  
  /**
    * Whether or not a payment can be made
    * NOTE: When no API is available it resolves with `null`
    *
    * @see https://stripe.com/docs/stripe-js/reference#payment-request-can-make-payment
    */
  def canMakePayment(): js.Promise[CanMakePaymentResult | Null] = js.native
  
  /**
    * Register your event listener
    * @see https://stripe.com/docs/stripe-js/reference#payment-request-on
    */
  @JSName("on")
  def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_shippingaddresschange(event: shippingaddresschange, handler: js.Function1[/* event */ NewShippingAddress, Unit]): Unit = js.native
  @JSName("on")
  def on_shippingoptionchange(event: shippingoptionchange, handler: js.Function1[/* event */ NewShippingOptions, Unit]): Unit = js.native
  @JSName("on")
  def on_source(event: source, handler: js.Function1[/* event */ StripePaymentResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_token(event: token, handler: js.Function1[/* event */ StripePaymentResponse, Unit]): Unit = js.native
  
  /**
    * Shows the browser’s payment UI
    * NOTE: When using the paymentRequestButton Element, this is called for you under the hood
    * NOTE: This method must be called as the result of a user interaction (for example, in a click handler)
    *
    * @see https://stripe.com/docs/stripe-js/reference#payment-request-show
    */
  def show(): Unit = js.native
  
  /**
    * Updates the payment information
    * NOTE: can only be called when the browser payment UI is not showing
    *
    * @param options - Payment information that should be used by Stripe
    *
    * @see https://stripe.com/docs/stripe-js/reference#payment-request-update
    */
  def update(options: UpdateOptions): Unit = js.native
}

package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequest extends js.Object {
  /**
       * Whether or not a payment can be made
       * NOTE: When no API is available it resolves with `null`
       *
       * @see https://stripe.com/docs/stripe-js/reference#payment-request-can-make-payment
       */
  def canMakePayment(): js.Promise[CanMakePaymentResult | scala.Null] = js.native
  /**
       * Register your event listener
       * @see https://stripe.com/docs/stripe-js/reference#payment-request-on
       */
  @JSName("on")
  def on_cancel(event: stripejsLib.stripejsLibStrings.cancel, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_shippingaddresschange(
    event: stripejsLib.stripejsLibStrings.shippingaddresschange,
    handler: js.Function1[/* event */ NewShippingAddress, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_shippingoptionchange(
    event: stripejsLib.stripejsLibStrings.shippingoptionchange,
    handler: js.Function1[/* event */ NewShippingOptions, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_source(
    event: stripejsLib.stripejsLibStrings.source,
    handler: js.Function1[/* event */ StripePaymentResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_token(
    event: stripejsLib.stripejsLibStrings.token,
    handler: js.Function1[/* event */ StripePaymentResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Shows the browser’s payment UI
       * NOTE: When using the paymentRequestButton Element, this is called for you under the hood
       * NOTE: This method must be called as the result of a user interaction (for example, in a click handler)
       *
       * @see https://stripe.com/docs/stripe-js/reference#payment-request-show
       */
  def show(): scala.Unit = js.native
  /**
       * Updates the payment information
       * NOTE: can only be called when the browser payment UI is not showing
       *
       * @param options - Payment information that should be used by Stripe
       *
       * @see https://stripe.com/docs/stripe-js/reference#payment-request-update
       */
  def update(options: UpdateOptions): scala.Unit = js.native
}


package typings.stripeV3.stripe.paymentRequest

import typings.stripeV3.anon.ApplePay
import typings.stripeV3.stripeV3Strings.cancel
import typings.stripeV3.stripeV3Strings.paymentmethod
import typings.stripeV3.stripeV3Strings.shippingaddresschange
import typings.stripeV3.stripeV3Strings.shippingoptionchange
import typings.stripeV3.stripeV3Strings.source
import typings.stripeV3.stripeV3Strings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripePaymentRequest extends js.Object {
  def canMakePayment(): js.Promise[ApplePay | Null] = js.native
  @JSName("on")
  def on_cancel(event: cancel, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_paymentmethod(
    event: paymentmethod,
    handler: js.Function1[/* response */ StripePaymentMethodPaymentResponse, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_shippingaddresschange(
    event: shippingaddresschange,
    handler: js.Function1[/* response */ typings.stripeV3.anon.ShippingAddress, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_shippingoptionchange(
    event: shippingoptionchange,
    handler: js.Function1[/* response */ typings.stripeV3.anon.ShippingOption, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_source(event: source, handler: js.Function1[/* response */ StripeSourcePaymentResponse, Unit]): Unit = js.native
  @JSName("on")
  def on_token(event: token, handler: js.Function1[/* response */ StripeTokenPaymentResponse, Unit]): Unit = js.native
  def show(): Unit = js.native
  def update(options: StripePaymentRequestUpdateOptions): Unit = js.native
}


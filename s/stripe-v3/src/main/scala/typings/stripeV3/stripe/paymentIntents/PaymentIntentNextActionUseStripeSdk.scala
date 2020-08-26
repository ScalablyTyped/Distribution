package typings.stripeV3.stripe.paymentIntents

import typings.stripeV3.stripeV3Strings.use_stripe_sdk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntentNextActionUseStripeSdk extends js.Object {
  /**
    * Type of the next action to perform
    */
  var `type`: use_stripe_sdk = js.native
  /**
    * When confirming a PaymentIntent with Stripe.js,
    * Stripe.js depends on the contents of this dictionary
    * to invoke authentication flows. The shape of the contents
    * is subject to change and is only intended to be used by Stripe.js.
    */
  var use_stripe_sdk: js.Any = js.native
}

object PaymentIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): PaymentIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntentNextActionUseStripeSdk]
  }
  @scala.inline
  implicit class PaymentIntentNextActionUseStripeSdkOps[Self <: PaymentIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
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
    def setType(value: use_stripe_sdk): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_stripe_sdk(value: js.Any): Self = this.set("use_stripe_sdk", value.asInstanceOf[js.Any])
  }
  
}


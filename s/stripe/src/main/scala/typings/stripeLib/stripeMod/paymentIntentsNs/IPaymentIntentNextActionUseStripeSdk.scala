package typings
package stripeLib.stripeMod.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentNextActionUseStripeSdk extends js.Object {
  var `type`: stripeLib.stripeLibStrings.use_stripe_sdk
  /**
    * When confirming a PaymentIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any
}

object IPaymentIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.use_stripe_sdk, use_stripe_sdk: js.Any): IPaymentIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPaymentIntentNextActionUseStripeSdk]
  }
}


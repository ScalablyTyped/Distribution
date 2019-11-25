package typings.stripe.stripeMod.setupIntents

import typings.stripe.stripeStrings.use_stripe_sdk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentNextActionUseStripeSdk extends js.Object {
  var `type`: use_stripe_sdk
  /**
    * When confirming a SetupIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any
}

object ISetupIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): ISetupIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentNextActionUseStripeSdk]
  }
}


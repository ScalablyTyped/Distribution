package typings.stripe.mod.setupIntents

import typings.stripe.stripeStrings.use_stripe_sdk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentNextActionUseStripeSdk extends js.Object {
  var `type`: use_stripe_sdk = js.native
  /**
    * When confirming a SetupIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any = js.native
}

object ISetupIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): ISetupIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentNextActionUseStripeSdk]
  }
  @scala.inline
  implicit class ISetupIntentNextActionUseStripeSdkOps[Self <: ISetupIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
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


package typings.stripe.mod.paymentIntents

import typings.stripe.stripeStrings.use_stripe_sdk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentNextActionUseStripeSdk extends js.Object {
  
  var `type`: use_stripe_sdk = js.native
  
  /**
    * When confirming a PaymentIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
    */
  var use_stripe_sdk: js.Any = js.native
}
object IPaymentIntentNextActionUseStripeSdk {
  
  @scala.inline
  def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): IPaymentIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentNextActionUseStripeSdk]
  }
  
  @scala.inline
  implicit class IPaymentIntentNextActionUseStripeSdkOps[Self <: IPaymentIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
    
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

package typings.stripe.mod.charges

import typings.stripe.stripeStrings.stripe_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStripeAccountPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: stripe_account = js.native
}
object IStripeAccountPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: stripe_account): IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeAccountPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IStripeAccountPaymentMethodDetailsOps[Self <: IStripeAccountPaymentMethodDetails] (val x: Self) extends AnyVal {
    
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
    def setType(value: stripe_account): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

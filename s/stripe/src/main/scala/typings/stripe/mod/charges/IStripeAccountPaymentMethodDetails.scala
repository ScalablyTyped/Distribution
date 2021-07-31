package typings.stripe.mod.charges

import typings.stripe.stripeStrings.stripe_account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStripeAccountPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: stripe_account
}
object IStripeAccountPaymentMethodDetails {
  
  @scala.inline
  def apply(): IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stripe_account")
    __obj.asInstanceOf[IStripeAccountPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IStripeAccountPaymentMethodDetailsMutableBuilder[Self <: IStripeAccountPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: stripe_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.charges

import typings.stripe.stripeStrings.eps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEpsPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: eps
}
object IEpsPaymentMethodDetails {
  
  @scala.inline
  def apply(): IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("eps")
    __obj.asInstanceOf[IEpsPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IEpsPaymentMethodDetailsMutableBuilder[Self <: IEpsPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: eps): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ideal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIdealPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: ideal
}
object IIdealPaymentMethodDetails {
  
  @scala.inline
  def apply(): IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ideal")
    __obj.asInstanceOf[IIdealPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IIdealPaymentMethodDetailsMutableBuilder[Self <: IIdealPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ideal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

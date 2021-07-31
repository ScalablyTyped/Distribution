package typings.stripe.mod.charges

import typings.stripe.stripeStrings.giropay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGiropayPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: giropay
}
object IGiropayPaymentMethodDetails {
  
  @scala.inline
  def apply(): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("giropay")
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IGiropayPaymentMethodDetailsMutableBuilder[Self <: IGiropayPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: giropay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

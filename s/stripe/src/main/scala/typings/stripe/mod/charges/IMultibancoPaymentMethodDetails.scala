package typings.stripe.mod.charges

import typings.stripe.stripeStrings.multibanco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultibancoPaymentMethodDetails extends StObject {
  
  var `type`: multibanco
}
object IMultibancoPaymentMethodDetails {
  
  @scala.inline
  def apply(): IMultibancoPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("multibanco")
    __obj.asInstanceOf[IMultibancoPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IMultibancoPaymentMethodDetailsMutableBuilder[Self <: IMultibancoPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: multibanco): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.charges

import typings.stripe.stripeStrings.multibanco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultibancoPaymentMethodDetails extends StObject {
  
  var `type`: multibanco = js.native
}
object IMultibancoPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: multibanco): IMultibancoPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultibancoPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IMultibancoPaymentMethodDetailsMutableBuilder[Self <: IMultibancoPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: multibanco): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

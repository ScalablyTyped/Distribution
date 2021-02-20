package typings.stripe.mod.charges

import typings.stripe.stripeStrings.sofort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISofortPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: sofort = js.native
}
object ISofortPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: sofort): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class ISofortPaymentMethodDetailsMutableBuilder[Self <: ISofortPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sofort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

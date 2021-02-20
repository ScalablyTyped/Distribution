package typings.stripe.mod.charges

import typings.stripe.stripeStrings.p24
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IP24PaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: p24 = js.native
}
object IP24PaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: p24): IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IP24PaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IP24PaymentMethodDetailsMutableBuilder[Self <: IP24PaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: p24): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

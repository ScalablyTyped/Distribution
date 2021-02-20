package typings.stripe.mod.charges

import typings.stripe.stripeStrings.giropay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: giropay = js.native
}
object IGiropayPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IGiropayPaymentMethodDetailsMutableBuilder[Self <: IGiropayPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: giropay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

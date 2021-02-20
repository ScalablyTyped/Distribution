package typings.stripe.mod.charges

import typings.stripe.stripeStrings.bancontact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBancontactPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: bancontact = js.native
}
object IBancontactPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: bancontact): IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBancontactPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IBancontactPaymentMethodDetailsMutableBuilder[Self <: IBancontactPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: bancontact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

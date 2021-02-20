package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingDetails extends StObject {
  
  var address: js.UndefOr[BillingDetailsAddress | Null] = js.native
  
  var email: js.UndefOr[String | Null] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var phone: js.UndefOr[String | Null] = js.native
}
object BillingDetails {
  
  @scala.inline
  def apply(): BillingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDetails]
  }
  
  @scala.inline
  implicit class BillingDetailsMutableBuilder[Self <: BillingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: BillingDetailsAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}

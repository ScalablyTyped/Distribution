package typings.stripe.anon

import typings.stripe.mod.IAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phone extends StObject {
  
  var address: js.UndefOr[IAddress | Null] = js.native
  
  var email: js.UndefOr[String | Null] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var phone: js.UndefOr[String | Null] = js.native
  
  var verified_address: js.UndefOr[IAddress | Null] = js.native
  
  var verified_email: js.UndefOr[String | Null] = js.native
  
  var verified_name: js.UndefOr[String | Null] = js.native
  
  var verified_phone: js.UndefOr[String | Null] = js.native
}
object Phone {
  
  @scala.inline
  def apply(): Phone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setVerified_address(value: IAddress): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_addressNull: Self = StObject.set(x, "verified_address", null)
    
    @scala.inline
    def setVerified_addressUndefined: Self = StObject.set(x, "verified_address", js.undefined)
    
    @scala.inline
    def setVerified_email(value: String): Self = StObject.set(x, "verified_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_emailNull: Self = StObject.set(x, "verified_email", null)
    
    @scala.inline
    def setVerified_emailUndefined: Self = StObject.set(x, "verified_email", js.undefined)
    
    @scala.inline
    def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_nameNull: Self = StObject.set(x, "verified_name", null)
    
    @scala.inline
    def setVerified_nameUndefined: Self = StObject.set(x, "verified_name", js.undefined)
    
    @scala.inline
    def setVerified_phone(value: String): Self = StObject.set(x, "verified_phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_phoneNull: Self = StObject.set(x, "verified_phone", null)
    
    @scala.inline
    def setVerified_phoneUndefined: Self = StObject.set(x, "verified_phone", js.undefined)
  }
}

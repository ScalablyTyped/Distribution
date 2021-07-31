package typings.stripe.anon

import typings.stripe.mod.IAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var address: IAddress | Null
  
  var email: String | Null
  
  var name: String | Null
  
  /** Billing phone number (including extension). */
  var phone: String | Null
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal(address = null, email = null, name = null, phone = null)
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
  }
}

package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountInput extends StObject {
  
  var email: String
  
  var email_optin: js.UndefOr[Boolean] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
}
object CreateAccountInput {
  
  inline def apply(email: String): CreateAccountInput = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountInput]
  }
  
  extension [Self <: CreateAccountInput](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmail_optin(value: Boolean): Self = StObject.set(x, "email_optin", value.asInstanceOf[js.Any])
    
    inline def setEmail_optinUndefined: Self = StObject.set(x, "email_optin", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}

package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAuthenticationOptions extends StObject {
  
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Password to use for authentication.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Authentication token used when type is 'azure-active-directory-access-token'
    */
  var token: js.UndefOr[String] = js.undefined
  
  /**
    * User name to use for authentication.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object ConnectionAuthenticationOptions {
  
  inline def apply(): ConnectionAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAuthenticationOptions]
  }
  
  extension [Self <: ConnectionAuthenticationOptions](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}

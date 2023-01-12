package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPAuthCredentials extends StObject {
  
  /**
    * The domain name.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The password for the account.
    */
  var password: String
  
  /**
    * The user name for the account.
    */
  var username: String
  
  /**
    * The workstation's ID in the local network.
    */
  var workstation: js.UndefOr[String] = js.undefined
}
object HTTPAuthCredentials {
  
  inline def apply(password: String, username: String): HTTPAuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPAuthCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPAuthCredentials] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setWorkstation(value: String): Self = StObject.set(x, "workstation", value.asInstanceOf[js.Any])
    
    inline def setWorkstationUndefined: Self = StObject.set(x, "workstation", js.undefined)
  }
}

package typings.testcafeHammerhead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var username: String
  
  var workstation: js.UndefOr[String] = js.undefined
}
object Credentials {
  
  inline def apply(password: String, username: String): Credentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setWorkstation(value: String): Self = StObject.set(x, "workstation", value.asInstanceOf[js.Any])
    
    inline def setWorkstationUndefined: Self = StObject.set(x, "workstation", js.undefined)
  }
}

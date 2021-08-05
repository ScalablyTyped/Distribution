package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionConfig extends StObject {
  
  /**
    * Authentication Options
    */
  var authentication: js.UndefOr[ConnectionAuthentication] = js.undefined
  
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Further options
    */
  var options: js.UndefOr[ConnectionOptions] = js.undefined
  
  /**
    * Hostname to connect to.
    */
  var server: js.UndefOr[String] = js.undefined
}
object ConnectionConfig {
  
  inline def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  
  extension [Self <: ConnectionConfig](x: Self) {
    
    inline def setAuthentication(value: ConnectionAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setOptions(value: ConnectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}

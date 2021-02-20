package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfig extends StObject {
  
  /**
    * Authentication Options
    */
  var authentication: js.UndefOr[ConnectionAuthentication] = js.native
  
  /**
    * Once you set domain, driver will connect to SQL Server using domain login.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Further options
    */
  var options: js.UndefOr[ConnectionOptions] = js.native
  
  /**
    * Hostname to connect to.
    */
  var server: js.UndefOr[String] = js.native
}
object ConnectionConfig {
  
  @scala.inline
  def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  
  @scala.inline
  implicit class ConnectionConfigMutableBuilder[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: ConnectionAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setOptions(value: ConnectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}

package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the proxy configuration for the current user. */
@js.native
trait ProxyConfiguration extends StObject {
  
  /** Gets a value that indicates if this configuration can connect directly. */
  var canConnectDirectly: Boolean = js.native
  
  /** Gets a list of URIs for the proxies from the proxy configuration. */
  var proxyUris: IVectorView[Uri] = js.native
}
object ProxyConfiguration {
  
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
  
  @scala.inline
  implicit class ProxyConfigurationMutableBuilder[Self <: ProxyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanConnectDirectly(value: Boolean): Self = StObject.set(x, "canConnectDirectly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUris(value: IVectorView[Uri]): Self = StObject.set(x, "proxyUris", value.asInstanceOf[js.Any])
  }
}

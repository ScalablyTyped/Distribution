package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProxyConfiguration extends StObject {
  
  var canConnectDirectly: Boolean
  
  var proxyUris: IVectorView[Uri]
}
object IProxyConfiguration {
  
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
  
  @scala.inline
  implicit class IProxyConfigurationMutableBuilder[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanConnectDirectly(value: Boolean): Self = StObject.set(x, "canConnectDirectly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUris(value: IVectorView[Uri]): Self = StObject.set(x, "proxyUris", value.asInstanceOf[js.Any])
  }
}

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
  
  inline def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanConnectDirectly(value: Boolean): Self = StObject.set(x, "canConnectDirectly", value.asInstanceOf[js.Any])
    
    inline def setProxyUris(value: IVectorView[Uri]): Self = StObject.set(x, "proxyUris", value.asInstanceOf[js.Any])
  }
}

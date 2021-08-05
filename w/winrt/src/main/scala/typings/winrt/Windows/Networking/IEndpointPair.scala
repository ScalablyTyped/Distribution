package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEndpointPair extends StObject {
  
  var localHostName: HostName
  
  var localServiceName: String
  
  var remoteHostName: HostName
  
  var remoteServiceName: String
}
object IEndpointPair {
  
  inline def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): IEndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEndpointPair]
  }
  
  extension [Self <: IEndpointPair](x: Self) {
    
    inline def setLocalHostName(value: HostName): Self = StObject.set(x, "localHostName", value.asInstanceOf[js.Any])
    
    inline def setLocalServiceName(value: String): Self = StObject.set(x, "localServiceName", value.asInstanceOf[js.Any])
    
    inline def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    inline def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
  }
}

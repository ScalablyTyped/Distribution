package typings.winrtUwp.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the local endpoint and remote endpoint for a network connection used by network apps. */
trait EndpointPair extends StObject {
  
  /** Get or set the local hostname for the EndpointPair object. */
  var localHostName: HostName
  
  /** Get or set the local service name for the EndpointPair object. */
  var localServiceName: String
  
  /** Get or set the remote hostname for the EndpointPair object. */
  var remoteHostName: HostName
  
  /** Get or set the remote service name for the EndpointPair object. */
  var remoteServiceName: String
}
object EndpointPair {
  
  inline def apply(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ): EndpointPair = {
    val __obj = js.Dynamic.literal(localHostName = localHostName.asInstanceOf[js.Any], localServiceName = localServiceName.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any], remoteServiceName = remoteServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointPair]
  }
  
  extension [Self <: EndpointPair](x: Self) {
    
    inline def setLocalHostName(value: HostName): Self = StObject.set(x, "localHostName", value.asInstanceOf[js.Any])
    
    inline def setLocalServiceName(value: String): Self = StObject.set(x, "localServiceName", value.asInstanceOf[js.Any])
    
    inline def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
    
    inline def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
  }
}

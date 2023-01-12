package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies a peer. */
trait PeerInformation extends StObject {
  
  /** Gets the device data included during device discovery. */
  var discoveryData: IBuffer
  
  /** Gets the display name of the peer. */
  var displayName: String
  
  /** Gets the hostname or IP address of the peer. */
  var hostName: HostName
  
  /** Gets the app id for the peer app. */
  var id: String
  
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: String
}
object PeerInformation {
  
  inline def apply(discoveryData: IBuffer, displayName: String, hostName: HostName, id: String, serviceName: String): PeerInformation = {
    val __obj = js.Dynamic.literal(discoveryData = discoveryData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerInformation] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryData(value: IBuffer): Self = StObject.set(x, "discoveryData", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: HostName): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies a peer. */
@js.native
trait PeerInformation extends StObject {
  
  /** Gets the device data included during device discovery. */
  var discoveryData: IBuffer = js.native
  
  /** Gets the display name of the peer. */
  var displayName: String = js.native
  
  /** Gets the hostname or IP address of the peer. */
  var hostName: HostName = js.native
  
  /** Gets the app id for the peer app. */
  var id: String = js.native
  
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: String = js.native
}
object PeerInformation {
  
  @scala.inline
  def apply(discoveryData: IBuffer, displayName: String, hostName: HostName, id: String, serviceName: String): PeerInformation = {
    val __obj = js.Dynamic.literal(discoveryData = discoveryData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInformation]
  }
  
  @scala.inline
  implicit class PeerInformationMutableBuilder[Self <: PeerInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscoveryData(value: IBuffer): Self = StObject.set(x, "discoveryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: HostName): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}

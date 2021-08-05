package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation
import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
trait RfcommConnectionTrigger extends StObject {
  
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  var allowMultipleConnections: Boolean
  
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  var inboundConnection: RfcommInboundConnectionInformation
  
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  var outboundConnection: RfcommOutboundConnectionInformation
  
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  var protectionLevel: SocketProtectionLevel
  
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  var remoteHostName: HostName
}
object RfcommConnectionTrigger {
  
  inline def apply(
    allowMultipleConnections: Boolean,
    inboundConnection: RfcommInboundConnectionInformation,
    outboundConnection: RfcommOutboundConnectionInformation,
    protectionLevel: SocketProtectionLevel,
    remoteHostName: HostName
  ): RfcommConnectionTrigger = {
    val __obj = js.Dynamic.literal(allowMultipleConnections = allowMultipleConnections.asInstanceOf[js.Any], inboundConnection = inboundConnection.asInstanceOf[js.Any], outboundConnection = outboundConnection.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], remoteHostName = remoteHostName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommConnectionTrigger]
  }
  
  extension [Self <: RfcommConnectionTrigger](x: Self) {
    
    inline def setAllowMultipleConnections(value: Boolean): Self = StObject.set(x, "allowMultipleConnections", value.asInstanceOf[js.Any])
    
    inline def setInboundConnection(value: RfcommInboundConnectionInformation): Self = StObject.set(x, "inboundConnection", value.asInstanceOf[js.Any])
    
    inline def setOutboundConnection(value: RfcommOutboundConnectionInformation): Self = StObject.set(x, "outboundConnection", value.asInstanceOf[js.Any])
    
    inline def setProtectionLevel(value: SocketProtectionLevel): Self = StObject.set(x, "protectionLevel", value.asInstanceOf[js.Any])
    
    inline def setRemoteHostName(value: HostName): Self = StObject.set(x, "remoteHostName", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation
import typings.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
@JSGlobal("Windows.ApplicationModel.Background.RfcommConnectionTrigger")
@js.native
/** Initializes a new instance of the RfcommConnectionTrigger class. */
open class RfcommConnectionTrigger ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Background.RfcommConnectionTrigger {
  
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  /* CompleteClass */
  var allowMultipleConnections: Boolean = js.native
  
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  /* CompleteClass */
  var inboundConnection: RfcommInboundConnectionInformation = js.native
  
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  /* CompleteClass */
  var outboundConnection: RfcommOutboundConnectionInformation = js.native
  
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  /* CompleteClass */
  var protectionLevel: SocketProtectionLevel = js.native
  
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  /* CompleteClass */
  var remoteHostName: HostName = js.native
}

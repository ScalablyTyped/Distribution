package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs.RfcommInboundConnectionInformation
import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs.RfcommOutboundConnectionInformation
import typings.winrtDashUwp.WindowsNs.NetworkingNs.HostName
import typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
@JSGlobal("Windows.ApplicationModel.Background.RfcommConnectionTrigger")
@js.native
/** Initializes a new instance of the RfcommConnectionTrigger class. */
class RfcommConnectionTrigger () extends js.Object {
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  var allowMultipleConnections: Boolean = js.native
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  var inboundConnection: RfcommInboundConnectionInformation = js.native
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  var outboundConnection: RfcommOutboundConnectionInformation = js.native
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  var protectionLevel: SocketProtectionLevel = js.native
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  var remoteHostName: HostName = js.native
}


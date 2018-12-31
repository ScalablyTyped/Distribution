package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when an RFCOMM inbound or outbound connections are established. */
@JSGlobal("Windows.ApplicationModel.Background.RfcommConnectionTrigger")
@js.native
/** Initializes a new instance of the RfcommConnectionTrigger class. */
class RfcommConnectionTrigger () extends js.Object {
  /** Gets or sets whether the app wants to handle multiple connections at a time. */
  var allowMultipleConnections: scala.Boolean = js.native
  /** Gets or sets the RfcommInboundConnectionInformation object that describes how the system will advertise and listen for inbound connections on behalf of the app. */
  var inboundConnection: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs.RfcommInboundConnectionInformation = js.native
  /** Gets or sets the RfcommOutboundConnectionInformation object that describes how the system will create outgoing connections on behalf of the app. */
  var outboundConnection: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs.RfcommOutboundConnectionInformation = js.native
  /** Gets or sets the minimum protection level required for connections that are created or accepted on behalf of the app. */
  var protectionLevel: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketProtectionLevel = js.native
  /** Gets or sets specific remote Bluetooth device the system will connect to, or accept connections from, on behalf of the app. */
  var remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
}


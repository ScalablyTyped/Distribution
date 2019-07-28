package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

import typings.winrtDashUwp.WindowsNs.NetworkingNs.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a MessageWebSocket . */
@JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
@js.native
abstract class MessageWebSocketInformation () extends js.Object {
  /** Gets bandwidth information for network data transfer on a MessageWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the IP address associated with a MessageWebSocket object. */
  var localAddress: HostName = js.native
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a MessageWebSocket object. */
  var protocol: String = js.native
}


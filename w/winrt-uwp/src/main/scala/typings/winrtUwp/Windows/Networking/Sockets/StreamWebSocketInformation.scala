package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamWebSocket object. */
trait StreamWebSocketInformation extends js.Object {
  /** Gets bandwidth information for network data transfer on a StreamWebSocket object. */
  var bandwidthStatistics: BandwidthStatistics
  /** Gets the IP address associated with a StreamWebSocket object. */
  var localAddress: HostName
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a StreamWebSocket object. */
  var protocol: String
}

object StreamWebSocketInformation {
  @scala.inline
  def apply(bandwidthStatistics: BandwidthStatistics, localAddress: HostName, protocol: String): StreamWebSocketInformation = {
    val __obj = js.Dynamic.literal(bandwidthStatistics = bandwidthStatistics.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamWebSocketInformation]
  }
}


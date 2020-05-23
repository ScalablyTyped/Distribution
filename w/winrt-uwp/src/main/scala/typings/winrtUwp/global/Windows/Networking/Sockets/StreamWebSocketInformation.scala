package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.BandwidthStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
@js.native
abstract class StreamWebSocketInformation ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketInformation {
  /** Gets bandwidth information for network data transfer on a StreamWebSocket object. */
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /** Gets the IP address associated with a StreamWebSocket object. */
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /** Gets the WebSocket sub-protocol negotiated with the server during WebSocket handshake on a StreamWebSocket object. */
  /* CompleteClass */
  override var protocol: String = js.native
}


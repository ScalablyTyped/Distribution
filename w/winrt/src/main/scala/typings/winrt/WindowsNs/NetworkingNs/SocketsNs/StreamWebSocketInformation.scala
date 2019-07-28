package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.NetworkingNs.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamWebSocketInformation")
@js.native
class StreamWebSocketInformation () extends IWebSocketInformation {
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var protocol: String = js.native
}


package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketInformation")
@js.native
class MessageWebSocketInformation () extends IWebSocketInformation {
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var protocol: String = js.native
}


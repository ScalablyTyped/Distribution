package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
@js.native
class StreamSocketInformation () extends IStreamSocketInformation {
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var localPort: String = js.native
  /* CompleteClass */
  override var protectionLevel: SocketProtectionLevel = js.native
  /* CompleteClass */
  override var remoteAddress: HostName = js.native
  /* CompleteClass */
  override var remoteHostName: HostName = js.native
  /* CompleteClass */
  override var remotePort: String = js.native
  /* CompleteClass */
  override var remoteServiceName: String = js.native
  /* CompleteClass */
  override var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  /* CompleteClass */
  override var sessionKey: IBuffer = js.native
}


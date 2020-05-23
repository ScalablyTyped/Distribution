package typings.winrt.global.Windows.Networking.Sockets

import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Networking.Sockets.BandwidthStatistics
import typings.winrt.Windows.Networking.Sockets.RoundTripTimeStatistics
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
@js.native
class StreamSocketInformation ()
  extends typings.winrt.Windows.Networking.Sockets.StreamSocketInformation {
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /* CompleteClass */
  override var localAddress: HostName = js.native
  /* CompleteClass */
  override var localPort: String = js.native
  /* CompleteClass */
  override var protectionLevel: typings.winrt.Windows.Networking.Sockets.SocketProtectionLevel = js.native
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


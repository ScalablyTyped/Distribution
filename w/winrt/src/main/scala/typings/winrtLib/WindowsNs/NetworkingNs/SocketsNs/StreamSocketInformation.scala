package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketInformation")
@js.native
class StreamSocketInformation () extends IStreamSocketInformation {
  /* CompleteClass */
  override var bandwidthStatistics: BandwidthStatistics = js.native
  /* CompleteClass */
  override var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName = js.native
  /* CompleteClass */
  override var localPort: java.lang.String = js.native
  /* CompleteClass */
  override var protectionLevel: SocketProtectionLevel = js.native
  /* CompleteClass */
  override var remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName = js.native
  /* CompleteClass */
  override var remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName = js.native
  /* CompleteClass */
  override var remotePort: java.lang.String = js.native
  /* CompleteClass */
  override var remoteServiceName: java.lang.String = js.native
  /* CompleteClass */
  override var roundTripTimeStatistics: RoundTripTimeStatistics = js.native
  /* CompleteClass */
  override var sessionKey: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}


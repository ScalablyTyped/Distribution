package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
@js.native
class StreamSocketControl () extends IStreamSocketControl {
  /* CompleteClass */
  override var keepAlive: scala.Boolean = js.native
  /* CompleteClass */
  override var noDelay: scala.Boolean = js.native
  /* CompleteClass */
  override var outboundBufferSizeInBytes: scala.Double = js.native
  /* CompleteClass */
  override var outboundUnicastHopLimit: scala.Double = js.native
  /* CompleteClass */
  override var qualityOfService: SocketQualityOfService = js.native
}


package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamSocketControl")
@js.native
class StreamSocketControl () extends IStreamSocketControl {
  /* CompleteClass */
  override var keepAlive: Boolean = js.native
  /* CompleteClass */
  override var noDelay: Boolean = js.native
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /* CompleteClass */
  override var outboundUnicastHopLimit: Double = js.native
  /* CompleteClass */
  override var qualityOfService: SocketQualityOfService = js.native
}


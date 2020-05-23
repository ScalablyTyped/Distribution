package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketQualityOfService extends js.Object

/** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends js.Object {
  /** Low latency quality of service commonly used for audio. */
  @js.native
  sealed trait lowLatency extends SocketQualityOfService
  
  /** Normal quality of service. */
  @js.native
  sealed trait normal extends SocketQualityOfService
  
}


package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait lowLatency
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService
  
  /** Normal quality of service. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService
  
  val lowLatency: lowLatency with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService with java.lang.String
  ] = js.native
}


package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketQualityOfService extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends js.Object {
  @js.native
  sealed trait lowLatency
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService
  
  /* 1 */ val lowLatency: lowLatency with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService with scala.Double
  ] = js.native
}


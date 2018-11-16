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
  
  val lowLatency: lowLatency with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketQualityOfService with java.lang.String
  ] = js.native
}


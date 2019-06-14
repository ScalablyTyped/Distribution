package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketMessageType extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketMessageType")
@js.native
object SocketMessageType extends js.Object {
  @js.native
  sealed trait binary
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType
  
  @js.native
  sealed trait utf8
    extends winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType
  
  /* 0 */ val binary: binary with scala.Double = js.native
  /* 1 */ val utf8: utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType with scala.Double] = js.native
}


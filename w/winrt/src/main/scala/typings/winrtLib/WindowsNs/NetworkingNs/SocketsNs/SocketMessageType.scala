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
  
  val binary: binary with java.lang.String = js.native
  val utf8: utf8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType with java.lang.String
  ] = js.native
}


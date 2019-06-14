package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketMessageType extends js.Object

/** Specifies the type of a message for a MessageWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketMessageType")
@js.native
object SocketMessageType extends js.Object {
  /** The message type is binary. */
  @js.native
  sealed trait binary
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType
  
  /** The message type is UTF-8 text. */
  @js.native
  sealed trait utf8
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType
  
  /* 0 */ val binary: binary with scala.Double = js.native
  /* 1 */ val utf8: utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType with scala.Double
  ] = js.native
}


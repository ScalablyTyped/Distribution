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
  
  val binary: binary with java.lang.String = js.native
  val utf8: utf8 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketMessageType with java.lang.String
  ] = js.native
}


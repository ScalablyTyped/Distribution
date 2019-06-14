package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketActivityKind extends js.Object

/** Describes the kind of socket object being transferred to or from the socket broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityKind")
@js.native
object SocketActivityKind extends js.Object {
  /** A socket type of DatagramSocket . */
  @js.native
  sealed trait datagramSocket
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind
  
  /** The socket type is unknown. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind
  
  /** A socket type of StreamSocket . */
  @js.native
  sealed trait streamSocket
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind
  
  /** A socket type of StreamSocketListener . */
  @js.native
  sealed trait streamSocketListener
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind
  
  /* 2 */ val datagramSocket: datagramSocket with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val streamSocket: streamSocket with scala.Double = js.native
  /* 1 */ val streamSocketListener: streamSocketListener with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind with scala.Double
  ] = js.native
}


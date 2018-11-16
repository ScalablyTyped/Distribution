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
  
  val datagramSocket: datagramSocket with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val streamSocket: streamSocket with java.lang.String = js.native
  val streamSocketListener: streamSocketListener with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind with java.lang.String
  ] = js.native
}


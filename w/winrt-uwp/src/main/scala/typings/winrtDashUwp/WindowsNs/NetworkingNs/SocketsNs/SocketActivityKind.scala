package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait datagramSocket extends SocketActivityKind
  
  /** The socket type is unknown. */
  @js.native
  sealed trait none extends SocketActivityKind
  
  /** A socket type of StreamSocket . */
  @js.native
  sealed trait streamSocket extends SocketActivityKind
  
  /** A socket type of StreamSocketListener . */
  @js.native
  sealed trait streamSocketListener extends SocketActivityKind
  
  /* 2 */ val datagramSocket: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind.datagramSocket with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind.none with Double = js.native
  /* 3 */ val streamSocket: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind.streamSocket with Double = js.native
  /* 1 */ val streamSocketListener: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityKind.streamSocketListener with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketActivityKind with Double] = js.native
}


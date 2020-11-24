package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the kind of socket object being transferred to or from the socket broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityKind")
@js.native
object SocketActivityKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind with Double] = js.native
  
  /* 2 */ val datagramSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.datagramSocket with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.none with Double = js.native
  
  /* 3 */ val streamSocket: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocket with Double = js.native
  
  /* 1 */ val streamSocketListener: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityKind.streamSocketListener with Double = js.native
}

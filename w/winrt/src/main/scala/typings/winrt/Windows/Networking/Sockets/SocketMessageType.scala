package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketMessageType extends js.Object

@JSGlobal("Windows.Networking.Sockets.SocketMessageType")
@js.native
object SocketMessageType extends js.Object {
  @js.native
  sealed trait binary extends SocketMessageType
  
  @js.native
  sealed trait utf8 extends SocketMessageType
  
  /* 0 */ val binary: typings.winrt.Windows.Networking.Sockets.SocketMessageType.binary with Double = js.native
  /* 1 */ val utf8: typings.winrt.Windows.Networking.Sockets.SocketMessageType.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketMessageType with Double] = js.native
}


package typings.winrtDashUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketMessageType.binary
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketMessageType.utf8
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
  sealed trait binary extends SocketMessageType
  
  /** The message type is UTF-8 text. */
  @js.native
  sealed trait utf8 extends SocketMessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketMessageType with Double] = js.native
  /* 0 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /* 1 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
  
}


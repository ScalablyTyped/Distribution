package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketMessageType with Double] = js.native
  /* 0 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /* 1 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
  
}


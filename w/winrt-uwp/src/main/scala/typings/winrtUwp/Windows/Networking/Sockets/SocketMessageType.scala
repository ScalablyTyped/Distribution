package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketMessageType extends StObject
/** Specifies the type of a message for a MessageWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketMessageType")
@js.native
object SocketMessageType extends StObject {
  
  /** The message type is binary. */
  @js.native
  sealed trait binary extends SocketMessageType
  
  /** The message type is UTF-8 text. */
  @js.native
  sealed trait utf8 extends SocketMessageType
}

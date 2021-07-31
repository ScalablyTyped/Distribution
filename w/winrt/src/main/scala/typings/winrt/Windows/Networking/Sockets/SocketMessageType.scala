package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketMessageType extends StObject
@JSGlobal("Windows.Networking.Sockets.SocketMessageType")
@js.native
object SocketMessageType extends StObject {
  
  @js.native
  sealed trait binary
    extends StObject
       with SocketMessageType
  
  @js.native
  sealed trait utf8
    extends StObject
       with SocketMessageType
}

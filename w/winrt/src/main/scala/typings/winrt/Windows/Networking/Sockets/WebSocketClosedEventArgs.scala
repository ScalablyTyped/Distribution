package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketClosedEventArgs
  extends StObject
     with IWebSocketClosedEventArgs
object WebSocketClosedEventArgs {
  
  @scala.inline
  def apply(code: Double, reason: String): WebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketClosedEventArgs]
  }
}

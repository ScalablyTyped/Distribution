package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSocketListenerConnectionReceivedEventArgs
  extends StObject
     with IStreamSocketListenerConnectionReceivedEventArgs
object StreamSocketListenerConnectionReceivedEventArgs {
  
  inline def apply(socket: StreamSocket): StreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerConnectionReceivedEventArgs]
  }
}

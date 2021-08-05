package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamSocketListenerConnectionReceivedEventArgs extends StObject {
  
  var socket: StreamSocket
}
object IStreamSocketListenerConnectionReceivedEventArgs {
  
  inline def apply(socket: StreamSocket): IStreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListenerConnectionReceivedEventArgs]
  }
  
  extension [Self <: IStreamSocketListenerConnectionReceivedEventArgs](x: Self) {
    
    inline def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}

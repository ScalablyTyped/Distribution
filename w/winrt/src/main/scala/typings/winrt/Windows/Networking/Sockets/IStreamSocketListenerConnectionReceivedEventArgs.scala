package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamSocketListenerConnectionReceivedEventArgs extends StObject {
  
  var socket: StreamSocket
}
object IStreamSocketListenerConnectionReceivedEventArgs {
  
  @scala.inline
  def apply(socket: StreamSocket): IStreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamSocketListenerConnectionReceivedEventArgs]
  }
  
  @scala.inline
  implicit class IStreamSocketListenerConnectionReceivedEventArgsMutableBuilder[Self <: IStreamSocketListenerConnectionReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}

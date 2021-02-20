package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
@js.native
trait StreamSocketListenerConnectionReceivedEventArgs extends StObject {
  
  /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var socket: StreamSocket = js.native
}
object StreamSocketListenerConnectionReceivedEventArgs {
  
  @scala.inline
  def apply(socket: StreamSocket): StreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSocketListenerConnectionReceivedEventArgs]
  }
  
  @scala.inline
  implicit class StreamSocketListenerConnectionReceivedEventArgsMutableBuilder[Self <: StreamSocketListenerConnectionReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}

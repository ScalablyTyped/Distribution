package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The context associated with a socket while transferring ownership of the socket between an app and the socket brokering service. */
trait SocketActivityContext extends StObject {
  
  /** Get the serialized data to associate the app context to a transferred socket. */
  var data: IBuffer
}
object SocketActivityContext {
  
  inline def apply(data: IBuffer): SocketActivityContext = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityContext]
  }
  
  extension [Self <: SocketActivityContext](x: Self) {
    
    inline def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

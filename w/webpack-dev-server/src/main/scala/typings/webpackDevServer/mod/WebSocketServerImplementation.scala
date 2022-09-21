package typings.webpackDevServer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketServerImplementation extends StObject {
  
  var clients: js.Array[ClientConnection]
  
  var implementation: WebSocketServer
}
object WebSocketServerImplementation {
  
  inline def apply(clients: js.Array[ClientConnection], implementation: WebSocketServer): WebSocketServerImplementation = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketServerImplementation]
  }
  
  extension [Self <: WebSocketServerImplementation](x: Self) {
    
    inline def setClients(value: js.Array[ClientConnection]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsVarargs(value: ClientConnection*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setImplementation(value: WebSocketServer): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
  }
}

package typings.webpackDevServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibServersBaseServerMod {
  
  @JSImport("webpack-dev-server/types/lib/servers/BaseServer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BaseServer {
    /**
      * @param {import("../Server")} server
      */
    def this(server: typings.webpackDevServer.mod.^) = this()
    
    /** @type {ClientConnection[]} */
    /* CompleteClass */
    var clients: js.Array[ClientConnection] = js.native
    
    /** @type {import("../Server")} */
    /* CompleteClass */
    var server: typings.webpackDevServer.mod.^ = js.native
  }
  
  trait BaseServer extends StObject {
    
    /** @type {ClientConnection[]} */
    var clients: js.Array[ClientConnection]
    
    /** @type {import("../Server")} */
    var server: typings.webpackDevServer.mod.^
  }
  object BaseServer {
    
    inline def apply(clients: js.Array[ClientConnection], server: typings.webpackDevServer.mod.^): BaseServer = {
      val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseServer]
    }
    
    extension [Self <: BaseServer](x: Self) {
      
      inline def setClients(value: js.Array[ClientConnection]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      inline def setClientsVarargs(value: ClientConnection*): Self = StObject.set(x, "clients", js.Array(value*))
      
      inline def setServer(value: typings.webpackDevServer.mod.^): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  type ClientConnection = typings.webpackDevServer.mod.ClientConnection
}

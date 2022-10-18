package typings.webpackDevServer

import typings.sockjs.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibServersSockJSServerMod {
  
  @JSImport("webpack-dev-server/types/lib/servers/SockJSServer", JSImport.Namespace)
  @js.native
  open class ^ () extends SockJSServer
  
  type ClientConnection = typings.webpackDevServer.mod.ClientConnection
  
  @js.native
  trait SockJSServer
    extends typings.webpackDevServer.typesLibServersBaseServerMod.^ {
    
    var implementation: Server = js.native
  }
  
  type WebSocketServerConfiguration = typings.webpackDevServer.mod.WebSocketServerConfiguration
}

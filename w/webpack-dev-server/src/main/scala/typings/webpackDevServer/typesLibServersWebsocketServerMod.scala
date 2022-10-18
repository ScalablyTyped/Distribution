package typings.webpackDevServer

import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibServersWebsocketServerMod {
  
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", JSImport.Namespace)
  @js.native
  open class ^ () extends WebsocketServer
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", "heartbeatInterval")
  @js.native
  def heartbeatInterval: Double = js.native
  inline def heartbeatInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(x.asInstanceOf[js.Any])
  
  type ClientConnection = typings.webpackDevServer.mod.ClientConnection
  
  type WebSocketServerConfiguration = typings.webpackDevServer.mod.WebSocketServerConfiguration
  
  @js.native
  trait WebsocketServer
    extends typings.webpackDevServer.typesLibServersBaseServerMod.^ {
    
    var implementation: Server[WebSocket] = js.native
  }
}

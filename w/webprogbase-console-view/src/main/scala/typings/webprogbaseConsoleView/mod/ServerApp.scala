package typings.webprogbaseConsoleView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webprogbase-console-view", "ServerApp")
@js.native
class ServerApp () extends js.Object {
  
  /**
    * Start listening for new clients' connections
    * @param port port number where server will listen for new connections
    */
  def listen(port: Double): Unit = js.native
  
  /**
    * Register a request handler function for the state
    * @param stateName name of the state
    * @param handler state request handler function
    */
  def use(stateName: String, handler: ServerAppHandler): Unit = js.native
}

package typings.websocket.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterConfig extends js.Object {
  /*
    * The WebSocketServer instance to attach to.
    */
  var server: typings.websocket.websocketMod.server
}

object IRouterConfig {
  @scala.inline
  def apply(server: server): IRouterConfig = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRouterConfig]
  }
}


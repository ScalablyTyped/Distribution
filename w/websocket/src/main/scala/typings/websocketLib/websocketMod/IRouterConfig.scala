package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterConfig extends js.Object {
  /*
    * The WebSocketServer instance to attach to.
    */
  var server: websocketLib.websocketMod.server
}

object IRouterConfig {
  @scala.inline
  def apply(server: server): IRouterConfig = {
    val __obj = js.Dynamic.literal(server = server)
  
    __obj.asInstanceOf[IRouterConfig]
  }
}


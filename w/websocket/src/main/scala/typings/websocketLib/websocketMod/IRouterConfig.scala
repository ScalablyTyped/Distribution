package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterConfig extends js.Object {
  /*
    * The WebSocketServer instance to attach to.
    */
  var server: server
}

object IRouterConfig {
  @scala.inline
  def apply(server: server): IRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[IRouterConfig]
  }
}


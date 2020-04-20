package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterHandler extends js.Object {
  var path: String
  var pathString: String
  var protocol: String
  def callback(request: IRouterRequest): Unit
}

object IRouterHandler {
  @scala.inline
  def apply(callback: IRouterRequest => Unit, path: String, pathString: String, protocol: String): IRouterHandler = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), path = path.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterHandler]
  }
}


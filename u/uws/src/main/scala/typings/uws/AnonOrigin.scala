package typings.uws

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrigin extends js.Object {
  var origin: String
  var req: IncomingMessage
  var secure: Boolean
}

object AnonOrigin {
  @scala.inline
  def apply(origin: String, req: IncomingMessage, secure: Boolean): AnonOrigin = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrigin]
  }
}


package typings.uws.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  var origin: String
  var req: IncomingMessage
  var secure: Boolean
}

object Origin {
  @scala.inline
  def apply(origin: String, req: IncomingMessage, secure: Boolean): Origin = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}


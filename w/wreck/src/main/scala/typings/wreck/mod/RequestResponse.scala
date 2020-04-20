package typings.wreck.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestResponse extends js.Object {
  var payload: js.Any
  var res: IncomingMessage
}

object RequestResponse {
  @scala.inline
  def apply(payload: js.Any, res: IncomingMessage): RequestResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestResponse]
  }
}


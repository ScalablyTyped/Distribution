package typings.wreck

import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReqClientRequest extends js.Object {
  var req: ClientRequest
}

object AnonReqClientRequest {
  @scala.inline
  def apply(req: ClientRequest): AnonReqClientRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReqClientRequest]
  }
}


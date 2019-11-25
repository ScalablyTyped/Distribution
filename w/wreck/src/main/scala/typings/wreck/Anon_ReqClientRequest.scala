package typings.wreck

import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReqClientRequest extends js.Object {
  var req: ClientRequest
}

object Anon_ReqClientRequest {
  @scala.inline
  def apply(req: ClientRequest): Anon_ReqClientRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReqClientRequest]
  }
}


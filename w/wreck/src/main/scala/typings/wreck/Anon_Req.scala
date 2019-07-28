package typings.wreck

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: ClientRequest
  var res: js.UndefOr[IncomingMessage] = js.undefined
  var start: Double
  var url: URL
}

object Anon_Req {
  @scala.inline
  def apply(req: ClientRequest, start: Double, url: URL, res: IncomingMessage = null): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req, start = start, url = url)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Req]
  }
}


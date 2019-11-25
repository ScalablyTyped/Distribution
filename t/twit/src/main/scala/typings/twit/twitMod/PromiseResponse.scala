package typings.twit.twitMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseResponse extends js.Object {
  var data: Response
  var resp: IncomingMessage
}

object PromiseResponse {
  @scala.inline
  def apply(data: Response, resp: IncomingMessage): PromiseResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resp = resp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseResponse]
  }
}


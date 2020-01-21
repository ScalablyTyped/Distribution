package typings.teenyRequest.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPart extends js.Object {
  var body: String | Readable
}

object RequestPart {
  @scala.inline
  def apply(body: String | Readable): RequestPart = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestPart]
  }
}


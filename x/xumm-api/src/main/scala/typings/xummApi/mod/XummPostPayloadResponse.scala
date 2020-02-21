package typings.xummApi.mod

import typings.xummApi.AnonAlways
import typings.xummApi.AnonQrmatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPostPayloadResponse extends js.Object {
  var next: AnonAlways
  var pushed: Boolean
  var refs: AnonQrmatrix
  var uuid: String
}

object XummPostPayloadResponse {
  @scala.inline
  def apply(next: AnonAlways, pushed: Boolean, refs: AnonQrmatrix, uuid: String): XummPostPayloadResponse = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XummPostPayloadResponse]
  }
}


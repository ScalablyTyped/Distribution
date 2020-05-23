package typings.xummApi.mod

import typings.xummApi.anon.Always
import typings.xummApi.anon.Qrmatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPostPayloadResponse extends js.Object {
  var next: Always
  var pushed: Boolean
  var refs: Qrmatrix
  var uuid: String
}

object XummPostPayloadResponse {
  @scala.inline
  def apply(next: Always, pushed: Boolean, refs: Qrmatrix, uuid: String): XummPostPayloadResponse = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadResponse]
  }
}


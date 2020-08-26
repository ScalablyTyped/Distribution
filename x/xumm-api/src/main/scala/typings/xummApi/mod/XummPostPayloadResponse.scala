package typings.xummApi.mod

import typings.xummApi.anon.Always
import typings.xummApi.anon.Qrmatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPostPayloadResponse extends js.Object {
  var next: Always = js.native
  var pushed: Boolean = js.native
  var refs: Qrmatrix = js.native
  var uuid: String = js.native
}

object XummPostPayloadResponse {
  @scala.inline
  def apply(next: Always, pushed: Boolean, refs: Qrmatrix, uuid: String): XummPostPayloadResponse = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadResponse]
  }
  @scala.inline
  implicit class XummPostPayloadResponseOps[Self <: XummPostPayloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNext(value: Always): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushed(value: Boolean): Self = this.set("pushed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefs(value: Qrmatrix): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}


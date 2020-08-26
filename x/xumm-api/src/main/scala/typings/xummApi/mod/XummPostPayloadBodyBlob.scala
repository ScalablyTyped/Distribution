package typings.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPostPayloadBodyBlob extends XummPayloadBodyBase {
  var txblob: String = js.native
}

object XummPostPayloadBodyBlob {
  @scala.inline
  def apply(txblob: String): XummPostPayloadBodyBlob = {
    val __obj = js.Dynamic.literal(txblob = txblob.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyBlob]
  }
  @scala.inline
  implicit class XummPostPayloadBodyBlobOps[Self <: XummPostPayloadBodyBlob] (val x: Self) extends AnyVal {
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
    def setTxblob(value: String): Self = this.set("txblob", value.asInstanceOf[js.Any])
  }
  
}


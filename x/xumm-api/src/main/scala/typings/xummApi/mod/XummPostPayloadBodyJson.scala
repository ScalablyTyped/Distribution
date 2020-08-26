package typings.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPostPayloadBodyJson extends XummPayloadBodyBase {
  var txjson: XummJsonTransaction = js.native
}

object XummPostPayloadBodyJson {
  @scala.inline
  def apply(txjson: XummJsonTransaction): XummPostPayloadBodyJson = {
    val __obj = js.Dynamic.literal(txjson = txjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadBodyJson]
  }
  @scala.inline
  implicit class XummPostPayloadBodyJsonOps[Self <: XummPostPayloadBodyJson] (val x: Self) extends AnyVal {
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
    def setTxjson(value: XummJsonTransaction): Self = this.set("txjson", value.asInstanceOf[js.Any])
  }
  
}


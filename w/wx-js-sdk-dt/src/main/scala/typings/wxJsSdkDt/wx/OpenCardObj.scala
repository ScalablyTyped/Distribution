package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCardObj extends js.Object {
  var cardId: String = js.native
  var code: String = js.native
}

object OpenCardObj {
  @scala.inline
  def apply(cardId: String, code: String): OpenCardObj = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardObj]
  }
  @scala.inline
  implicit class OpenCardObjOps[Self <: OpenCardObj] (val x: Self) extends AnyVal {
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
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
  }
  
}


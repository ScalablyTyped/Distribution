package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCardData extends js.Object {
  /**
    * 需要打开的卡券 Id
    */
  var cardId: js.UndefOr[String] = js.native
  /**
    * 由 addCard 的返回对象中的加密 code 通过解密后得到
    */
  var code: js.UndefOr[String] = js.native
}

object OpenCardData {
  @scala.inline
  def apply(): OpenCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCardData]
  }
  @scala.inline
  implicit class OpenCardDataOps[Self <: OpenCardData] (val x: Self) extends AnyVal {
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
    def deleteCardId: Self = this.set("cardId", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
  
}


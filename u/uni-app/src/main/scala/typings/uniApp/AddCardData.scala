package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardData extends js.Object {
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[String] = js.native
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[String] = js.native
}

object AddCardData {
  @scala.inline
  def apply(): AddCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardData]
  }
  @scala.inline
  implicit class AddCardDataOps[Self <: AddCardData] (val x: Self) extends AnyVal {
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
    def setCardExt(value: String): Self = this.set("cardExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardExt: Self = this.set("cardExt", js.undefined)
    @scala.inline
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardId: Self = this.set("cardId", js.undefined)
  }
  
}


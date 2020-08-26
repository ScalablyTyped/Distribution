package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 需要打开的卡券列表
  */
@js.native
trait OpenCardConfig extends WxBaseRequestConfig {
  var cardList: js.Array[OpenCardObj] = js.native
}

object OpenCardConfig {
  @scala.inline
  def apply(cardList: js.Array[OpenCardObj]): OpenCardConfig = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardConfig]
  }
  @scala.inline
  implicit class OpenCardConfigOps[Self <: OpenCardConfig] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: OpenCardObj*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[OpenCardObj]): Self = this.set("cardList", value.asInstanceOf[js.Any])
  }
  
}


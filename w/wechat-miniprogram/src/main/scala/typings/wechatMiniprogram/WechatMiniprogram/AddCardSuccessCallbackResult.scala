package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardSuccessCallbackResult extends js.Object {
  /** 卡券添加结果列表 */
  var cardList: js.Array[AddCardResponseInfo] = js.native
  var errMsg: String = js.native
}

object AddCardSuccessCallbackResult {
  @scala.inline
  def apply(cardList: js.Array[AddCardResponseInfo], errMsg: String): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
  @scala.inline
  implicit class AddCardSuccessCallbackResultOps[Self <: AddCardSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setCardListVarargs(value: AddCardResponseInfo*): Self = this.set("cardList", js.Array(value :_*))
    @scala.inline
    def setCardList(value: js.Array[AddCardResponseInfo]): Self = this.set("cardList", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}


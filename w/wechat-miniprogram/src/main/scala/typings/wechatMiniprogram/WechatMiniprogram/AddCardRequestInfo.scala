package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 需要添加的卡券列表 */
@js.native
trait AddCardRequestInfo extends js.Object {
  /** 卡券的扩展参数。需将 CardExt 对象 JSON 序列化为**字符串**传入 */
  var cardExt: String = js.native
  /** 卡券 ID */
  var cardId: String = js.native
}

object AddCardRequestInfo {
  @scala.inline
  def apply(cardExt: String, cardId: String): AddCardRequestInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardRequestInfo]
  }
  @scala.inline
  implicit class AddCardRequestInfoOps[Self <: AddCardRequestInfo] (val x: Self) extends AnyVal {
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
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
  }
  
}


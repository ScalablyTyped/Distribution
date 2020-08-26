package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardId extends js.Object {
  /**
    * 卡券 ID
    */
  var cardId: String = js.native
  /**
    * 由 wx.addCard 的返回对象中的加密 code 通过解密后得到，解密请参照：code 解码接口（https://developers.weixin.qq.com/doc/offiaccount/Cards_and_Offer/Coupons-Mini_Program_Start_Up.html）
    */
  var code: String = js.native
}

object CardId {
  @scala.inline
  def apply(cardId: String, code: String): CardId = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardId]
  }
  @scala.inline
  implicit class CardIdOps[Self <: CardId] (val x: Self) extends AnyVal {
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


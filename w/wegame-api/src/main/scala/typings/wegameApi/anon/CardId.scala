package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardId extends js.Object {
  /**
    * 卡券 ID
    */
  var cardId: String
  /**
    * 由 wx.addCard 的返回对象中的加密 code 通过解密后得到，解密请参照：code 解码接口（https://developers.weixin.qq.com/doc/offiaccount/Cards_and_Offer/Coupons-Mini_Program_Start_Up.html）
    */
  var code: String
}

object CardId {
  @scala.inline
  def apply(cardId: String, code: String): CardId = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardId]
  }
}


package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardExt extends js.Object {
  /**
    * 卡券的扩展参数。需将 CardExt 对象 JSON 序列化为字符串传入
    */
  var cardExt: String
  /**
    * 卡券 ID
    */
  var cardId: String
}

object AnonCardExt {
  @scala.inline
  def apply(cardExt: String, cardId: String): AnonCardExt = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardExt]
  }
}


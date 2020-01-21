package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 卡券对象
  */
trait Card extends js.Object {
  var cardExt: String
  var cardId: String
}

object Card {
  @scala.inline
  def apply(cardExt: String, cardId: String): Card = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Card]
  }
}


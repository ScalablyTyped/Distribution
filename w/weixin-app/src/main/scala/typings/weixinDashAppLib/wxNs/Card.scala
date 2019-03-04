package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----卡券
trait Card extends js.Object {
  var cardExt: java.lang.String
  var cardId: java.lang.String
  var code: js.UndefOr[java.lang.String] = js.undefined
}

object Card {
  @scala.inline
  def apply(cardExt: java.lang.String, cardId: java.lang.String, code: java.lang.String = null): Card = {
    val __obj = js.Dynamic.literal(cardExt = cardExt, cardId = cardId)
    if (code != null) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[Card]
  }
}


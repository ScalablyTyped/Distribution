package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 卡券对象
  */
trait Card extends js.Object {
  var cardExt: java.lang.String
  var cardId: java.lang.String
}

object Card {
  @scala.inline
  def apply(cardExt: java.lang.String, cardId: java.lang.String): Card = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cardExt")(cardExt)
    __obj.updateDynamic("cardId")(cardId)
    __obj.asInstanceOf[Card]
  }
}


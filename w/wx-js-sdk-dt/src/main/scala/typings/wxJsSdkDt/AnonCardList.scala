package typings.wxJsSdkDt

import typings.wxJsSdkDt.wx.Card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardList extends js.Object {
  var cardList: js.Array[Card]
}

object AnonCardList {
  @scala.inline
  def apply(cardList: js.Array[Card]): AnonCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardList]
  }
}


package typings.wxJsSdkDt.anon

import typings.wxJsSdkDt.wx.Card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardList extends js.Object {
  var cardList: js.Array[Card]
}

object CardList {
  @scala.inline
  def apply(cardList: js.Array[Card]): CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardList]
  }
}


package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardList extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[AnonCardId]
}

object AnonCardList {
  @scala.inline
  def apply(cardList: js.Array[AnonCardId]): AnonCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardList]
  }
}


package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardList extends js.Object {
  /**
    * 卡券添加结果列表
    */
  var cardList: js.Array[AnonIsSuccess]
}

object AnonCardList {
  @scala.inline
  def apply(cardList: js.Array[AnonIsSuccess]): AnonCardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardList]
  }
}


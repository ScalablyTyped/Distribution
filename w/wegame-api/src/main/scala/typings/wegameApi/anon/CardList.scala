package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardList extends js.Object {
  /**
    * 卡券添加结果列表
    */
  var cardList: js.Array[IsSuccess]
}

object CardList {
  @scala.inline
  def apply(cardList: js.Array[IsSuccess]): CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardList]
  }
}


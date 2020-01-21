package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardListAnonCardExt extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.Array[AnonCardExt]
}

object AnonCardListAnonCardExt {
  @scala.inline
  def apply(cardList: js.Array[AnonCardExt]): AnonCardListAnonCardExt = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardListAnonCardExt]
  }
}


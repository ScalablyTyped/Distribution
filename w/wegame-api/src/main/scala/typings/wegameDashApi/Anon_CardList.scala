package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CardList extends js.Object {
  /**
    * 需要打开的卡券列表
    */
  var cardList: js.Array[Anon_CardId]
}

object Anon_CardList {
  @scala.inline
  def apply(cardList: js.Array[Anon_CardId]): Anon_CardList = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CardList]
  }
}


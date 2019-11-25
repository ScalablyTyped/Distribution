package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardRes extends js.Object {
  /**
    * 卡券 id
    */
  var cardList: js.UndefOr[js.Array[CardData]] = js.undefined
}

object AddCardRes {
  @scala.inline
  def apply(cardList: js.Array[CardData] = null): AddCardRes = {
    val __obj = js.Dynamic.literal()
    if (cardList != null) __obj.updateDynamic("cardList")(cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardRes]
  }
}


package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardData extends js.Object {
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[String] = js.undefined
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[String] = js.undefined
}

object AddCardData {
  @scala.inline
  def apply(cardExt: String = null, cardId: String = null): AddCardData = {
    val __obj = js.Dynamic.literal()
    if (cardExt != null) __obj.updateDynamic("cardExt")(cardExt.asInstanceOf[js.Any])
    if (cardId != null) __obj.updateDynamic("cardId")(cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardData]
  }
}


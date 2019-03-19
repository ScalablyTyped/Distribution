package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardData extends js.Object {
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[java.lang.String] = js.undefined
}

object AddCardData {
  @scala.inline
  def apply(cardExt: java.lang.String = null, cardId: java.lang.String = null): AddCardData = {
    val __obj = js.Dynamic.literal()
    if (cardExt != null) __obj.updateDynamic("cardExt")(cardExt)
    if (cardId != null) __obj.updateDynamic("cardId")(cardId)
    __obj.asInstanceOf[AddCardData]
  }
}


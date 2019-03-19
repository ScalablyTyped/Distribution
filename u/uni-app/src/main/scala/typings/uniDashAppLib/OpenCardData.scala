package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCardData extends js.Object {
  /**
    * 需要打开的卡券 Id
    */
  var cardId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 由 addCard 的返回对象中的加密 code 通过解密后得到
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
}

object OpenCardData {
  @scala.inline
  def apply(cardId: java.lang.String = null, code: java.lang.String = null): OpenCardData = {
    val __obj = js.Dynamic.literal()
    if (cardId != null) __obj.updateDynamic("cardId")(cardId)
    if (code != null) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[OpenCardData]
  }
}


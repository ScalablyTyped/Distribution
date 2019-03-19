package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardData extends js.Object {
  /**
    * 用户领取到卡券的扩展参数，与调用时传入的参数相同
    */
  var cardExt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 用户领取到卡券的id
    */
  var cardId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否成功
    */
  var isSuccess: js.UndefOr[scala.Boolean] = js.undefined
}

object CardData {
  @scala.inline
  def apply(
    cardExt: java.lang.String = null,
    cardId: java.lang.String = null,
    code: java.lang.String = null,
    isSuccess: js.UndefOr[scala.Boolean] = js.undefined
  ): CardData = {
    val __obj = js.Dynamic.literal()
    if (cardExt != null) __obj.updateDynamic("cardExt")(cardExt)
    if (cardId != null) __obj.updateDynamic("cardId")(cardId)
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(isSuccess)) __obj.updateDynamic("isSuccess")(isSuccess)
    __obj.asInstanceOf[CardData]
  }
}


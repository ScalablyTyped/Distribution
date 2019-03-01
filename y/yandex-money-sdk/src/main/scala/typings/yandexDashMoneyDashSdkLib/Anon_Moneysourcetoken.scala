package typings
package yandexDashMoneyDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Moneysourcetoken extends js.Object {
  var money_source_token: js.UndefOr[java.lang.String] = js.undefined
  var pan_fragment: js.UndefOr[java.lang.String] = js.undefined
  var payment_card_type: java.lang.String
  var `type`: java.lang.String
}

object Anon_Moneysourcetoken {
  @scala.inline
  def apply(
    payment_card_type: java.lang.String,
    `type`: java.lang.String,
    money_source_token: java.lang.String = null,
    pan_fragment: java.lang.String = null
  ): Anon_Moneysourcetoken = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payment_card_type")(payment_card_type)
    if (money_source_token != null) __obj.updateDynamic("money_source_token")(money_source_token)
    if (pan_fragment != null) __obj.updateDynamic("pan_fragment")(pan_fragment)
    __obj.asInstanceOf[Anon_Moneysourcetoken]
  }
}


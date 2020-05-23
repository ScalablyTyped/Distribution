package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moneysourcetoken extends js.Object {
  var money_source_token: js.UndefOr[String] = js.undefined
  var pan_fragment: js.UndefOr[String] = js.undefined
  var payment_card_type: String
  var `type`: String
}

object Moneysourcetoken {
  @scala.inline
  def apply(
    payment_card_type: String,
    `type`: String,
    money_source_token: String = null,
    pan_fragment: String = null
  ): Moneysourcetoken = {
    val __obj = js.Dynamic.literal(payment_card_type = payment_card_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (money_source_token != null) __obj.updateDynamic("money_source_token")(money_source_token.asInstanceOf[js.Any])
    if (pan_fragment != null) __obj.updateDynamic("pan_fragment")(pan_fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Moneysourcetoken]
  }
}


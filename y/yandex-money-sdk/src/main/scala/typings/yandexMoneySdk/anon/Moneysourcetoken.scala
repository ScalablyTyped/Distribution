package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moneysourcetoken extends js.Object {
  var money_source_token: js.UndefOr[String] = js.native
  var pan_fragment: js.UndefOr[String] = js.native
  var payment_card_type: String = js.native
  var `type`: String = js.native
}

object Moneysourcetoken {
  @scala.inline
  def apply(payment_card_type: String, `type`: String): Moneysourcetoken = {
    val __obj = js.Dynamic.literal(payment_card_type = payment_card_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Moneysourcetoken]
  }
  @scala.inline
  implicit class MoneysourcetokenOps[Self <: Moneysourcetoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPayment_card_type(value: String): Self = this.set("payment_card_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoney_source_token(value: String): Self = this.set("money_source_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_source_token: Self = this.set("money_source_token", js.undefined)
    @scala.inline
    def setPan_fragment(value: String): Self = this.set("pan_fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan_fragment: Self = this.set("pan_fragment", js.undefined)
  }
  
}


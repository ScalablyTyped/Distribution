package typings.stripe.mod.charges

import typings.stripe.anon.Brand
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardPaymentMethodDetails extends IPaymentMethodDetails {
  var card: Brand = js.native
  var `type`: card = js.native
}

object ICardPaymentMethodDetails {
  @scala.inline
  def apply(card: Brand, `type`: card): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
  @scala.inline
  implicit class ICardPaymentMethodDetailsOps[Self <: ICardPaymentMethodDetails] (val x: Self) extends AnyVal {
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
    def setCard(value: Brand): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: card): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


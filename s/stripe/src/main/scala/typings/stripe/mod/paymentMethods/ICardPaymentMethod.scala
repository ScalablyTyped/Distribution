package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.mod.IMetadata
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: Checks = js.native
  var `type`: card = js.native
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: Checks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
  @scala.inline
  implicit class ICardPaymentMethodOps[Self <: ICardPaymentMethod] (val x: Self) extends AnyVal {
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
    def setCard(value: Checks): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: card): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


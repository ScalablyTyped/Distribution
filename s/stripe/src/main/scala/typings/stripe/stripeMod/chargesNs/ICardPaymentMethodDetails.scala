package typings.stripe.stripeMod.chargesNs

import typings.stripe.Anon_Brand
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethodDetails extends IPaymentMethodDetails {
  var card: Anon_Brand
  var `type`: card
}

object ICardPaymentMethodDetails {
  @scala.inline
  def apply(card: Anon_Brand, `type`: card): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
}


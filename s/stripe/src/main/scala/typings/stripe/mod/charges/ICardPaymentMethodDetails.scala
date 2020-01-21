package typings.stripe.mod.charges

import typings.stripe.AnonBrand
import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethodDetails extends IPaymentMethodDetails {
  var card: AnonBrand
  var `type`: card
}

object ICardPaymentMethodDetails {
  @scala.inline
  def apply(card: AnonBrand, `type`: card): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
}


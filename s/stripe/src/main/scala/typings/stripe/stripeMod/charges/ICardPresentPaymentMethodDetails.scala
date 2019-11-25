package typings.stripe.stripeMod.charges

import typings.stripe.stripeStrings.card_present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPresentPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: card_present
}

object ICardPresentPaymentMethodDetails {
  @scala.inline
  def apply(`type`: card_present): ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethodDetails]
  }
}


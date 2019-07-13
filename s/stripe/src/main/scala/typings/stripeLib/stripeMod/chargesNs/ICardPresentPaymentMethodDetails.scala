package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPresentPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.card_present
}

object ICardPresentPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.card_present): ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICardPresentPaymentMethodDetails]
  }
}


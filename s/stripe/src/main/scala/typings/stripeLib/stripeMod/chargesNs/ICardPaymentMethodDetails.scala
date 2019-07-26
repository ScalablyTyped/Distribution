package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethodDetails extends IPaymentMethodDetails {
  var card: stripeLib.Anon_Brand
  var `type`: stripeLib.stripeLibStrings.card
}

object ICardPaymentMethodDetails {
  @scala.inline
  def apply(card: stripeLib.Anon_Brand, `type`: stripeLib.stripeLibStrings.card): ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICardPaymentMethodDetails]
  }
}


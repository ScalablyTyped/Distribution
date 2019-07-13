package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISofortPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.sofort
}

object ISofortPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.sofort): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
}


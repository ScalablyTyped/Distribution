package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultibancoPaymentMethodDetails extends js.Object {
  var `type`: stripeLib.stripeLibStrings.multibanco
}

object IMultibancoPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.multibanco): IMultibancoPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMultibancoPaymentMethodDetails]
  }
}


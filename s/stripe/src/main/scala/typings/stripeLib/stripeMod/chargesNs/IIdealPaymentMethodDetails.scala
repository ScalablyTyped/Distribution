package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdealPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.ideal
}

object IIdealPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.ideal): IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IIdealPaymentMethodDetails]
  }
}


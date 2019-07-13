package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.giropay
}

object IGiropayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
}


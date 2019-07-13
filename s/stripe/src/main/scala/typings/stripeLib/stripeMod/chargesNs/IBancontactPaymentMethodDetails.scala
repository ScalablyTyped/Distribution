package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBancontactPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.bancontact
}

object IBancontactPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.bancontact): IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IBancontactPaymentMethodDetails]
  }
}


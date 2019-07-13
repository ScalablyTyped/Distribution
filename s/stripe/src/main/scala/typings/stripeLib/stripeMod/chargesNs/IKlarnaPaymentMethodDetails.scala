package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKlarnaPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.klarna
}

object IKlarnaPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.klarna): IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IKlarnaPaymentMethodDetails]
  }
}


package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlipayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.alipay
}

object IAlipayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.alipay): IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAlipayPaymentMethodDetails]
  }
}


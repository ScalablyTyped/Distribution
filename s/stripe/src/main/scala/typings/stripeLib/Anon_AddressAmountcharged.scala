package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressAmountcharged extends js.Object {
  var address: java.lang.String
  var amount_charged: scala.Double
  var amount_received: scala.Double
  var amount_returned: scala.Double
  var refund_attributes_method: stripeLib.stripeLibStrings.email | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.none
  var refund_attributes_status: stripeLib.stripeLibStrings.missing | stripeLib.stripeLibStrings.requested | stripeLib.stripeLibStrings.available
}

object Anon_AddressAmountcharged {
  @scala.inline
  def apply(
    address: java.lang.String,
    amount_charged: scala.Double,
    amount_received: scala.Double,
    amount_returned: scala.Double,
    refund_attributes_method: stripeLib.stripeLibStrings.email | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.none,
    refund_attributes_status: stripeLib.stripeLibStrings.missing | stripeLib.stripeLibStrings.requested | stripeLib.stripeLibStrings.available
  ): Anon_AddressAmountcharged = {
    val __obj = js.Dynamic.literal(address = address, amount_charged = amount_charged, amount_received = amount_received, amount_returned = amount_returned, refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddressAmountcharged]
  }
}


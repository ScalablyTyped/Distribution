package typings.stripe

import typings.stripe.stripeStrings.available
import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.missing
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.requested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressAmountcharged extends js.Object {
  var address: String
  var amount_charged: Double
  var amount_received: Double
  var amount_returned: Double
  var refund_attributes_method: email | manual | none
  var refund_attributes_status: missing | requested | available
}

object Anon_AddressAmountcharged {
  @scala.inline
  def apply(
    address: String,
    amount_charged: Double,
    amount_received: Double,
    amount_returned: Double,
    refund_attributes_method: email | manual | none,
    refund_attributes_status: missing | requested | available
  ): Anon_AddressAmountcharged = {
    val __obj = js.Dynamic.literal(address = address, amount_charged = amount_charged, amount_received = amount_received, amount_returned = amount_returned, refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddressAmountcharged]
  }
}


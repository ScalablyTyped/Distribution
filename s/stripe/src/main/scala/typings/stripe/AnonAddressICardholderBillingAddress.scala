package typings.stripe

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressICardholderBillingAddress extends js.Object {
  var address: ICardholderBillingAddress
}

object AnonAddressICardholderBillingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress): AnonAddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressICardholderBillingAddress]
  }
}


package typings.stripe.anon

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressICardholderBillingAddress extends js.Object {
  var address: ICardholderBillingAddress
}

object AddressICardholderBillingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress): AddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressICardholderBillingAddress]
  }
}


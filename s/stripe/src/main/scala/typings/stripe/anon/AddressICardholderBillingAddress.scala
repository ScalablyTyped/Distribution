package typings.stripe.anon

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressICardholderBillingAddress extends js.Object {
  var address: ICardholderBillingAddress = js.native
}

object AddressICardholderBillingAddress {
  @scala.inline
  def apply(address: ICardholderBillingAddress): AddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressICardholderBillingAddress]
  }
  @scala.inline
  implicit class AddressICardholderBillingAddressOps[Self <: AddressICardholderBillingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: ICardholderBillingAddress): Self = this.set("address", value.asInstanceOf[js.Any])
  }
  
}


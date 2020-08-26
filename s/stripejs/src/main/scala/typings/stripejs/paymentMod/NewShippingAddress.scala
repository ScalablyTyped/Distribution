package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewShippingAddress extends js.Object {
  /**
    * The customer's selected ShippingAddress.
    */
  var shippingAddress: ShippingAddress = js.native
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit = js.native
}

object NewShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Unit): NewShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[NewShippingAddress]
  }
  @scala.inline
  implicit class NewShippingAddressOps[Self <: NewShippingAddress] (val x: Self) extends AnyVal {
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
    def setShippingAddress(value: ShippingAddress): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateWith(value: UpdateOptions => Unit): Self = this.set("updateWith", js.Any.fromFunction1(value))
  }
  
}


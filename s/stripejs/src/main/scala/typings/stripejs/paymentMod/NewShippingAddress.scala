package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingAddress extends js.Object {
  /**
    * The customer's selected ShippingAddress.
    */
  var shippingAddress: ShippingAddress
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit
}

object NewShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Unit): NewShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[NewShippingAddress]
  }
}


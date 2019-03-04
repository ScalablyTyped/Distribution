package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingAddress extends js.Object {
  /**
    * The customer's selected ShippingAddress.
    */
  var shippingAddress: stripejsLib.shippingMod.ShippingAddress
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): scala.Unit
}

object NewShippingAddress {
  @scala.inline
  def apply(
    shippingAddress: stripejsLib.shippingMod.ShippingAddress,
    updateWith: js.Function1[UpdateOptions, scala.Unit]
  ): NewShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress, updateWith = updateWith)
  
    __obj.asInstanceOf[NewShippingAddress]
  }
}


package typings.stripejs.paymentMod

import typings.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingOptions extends js.Object {
  /**
    * The selected shipping option
    */
  var shippingOption: ShippingOption
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit
}

object NewShippingOptions {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Unit): NewShippingOptions = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
  
    __obj.asInstanceOf[NewShippingOptions]
  }
}


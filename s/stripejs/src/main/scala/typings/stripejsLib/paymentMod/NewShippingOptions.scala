package typings
package stripejsLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingOptions extends js.Object {
  /**
    * The selected shipping option
    */
  var shippingOption: stripejsLib.shippingMod.ShippingOption
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): scala.Unit
}

object NewShippingOptions {
  @scala.inline
  def apply(
    shippingOption: stripejsLib.shippingMod.ShippingOption,
    updateWith: js.Function1[UpdateOptions, scala.Unit]
  ): NewShippingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.updateDynamic("updateWith")(updateWith)
    __obj.asInstanceOf[NewShippingOptions]
  }
}


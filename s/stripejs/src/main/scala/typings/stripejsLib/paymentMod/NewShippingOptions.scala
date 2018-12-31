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


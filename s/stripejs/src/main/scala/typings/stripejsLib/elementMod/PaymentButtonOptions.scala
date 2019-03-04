package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentButtonOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[stripejsLib.Anon_Base] = js.undefined
  var paymentRequest: js.Any
  var style: js.UndefOr[stripejsLib.Anon_BaseComplete] = js.undefined
}

object PaymentButtonOptions {
  @scala.inline
  def apply(
    paymentRequest: js.Any,
    classes: stripejsLib.Anon_Base = null,
    style: stripejsLib.Anon_BaseComplete = null
  ): PaymentButtonOptions = {
    val __obj = js.Dynamic.literal(paymentRequest = paymentRequest)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaymentButtonOptions]
  }
}


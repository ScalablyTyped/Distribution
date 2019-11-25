package typings.stripejs.elementMod

import typings.stripejs.Anon_Base
import typings.stripejs.Anon_BaseComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentButtonOptions extends js.Object {
  /**
    * Set custom class names on the container DOM element when the Stripe Element is in a
    * particular state.
    */
  var classes: js.UndefOr[Anon_Base] = js.undefined
  var paymentRequest: js.Any
  var style: js.UndefOr[Anon_BaseComplete] = js.undefined
}

object PaymentButtonOptions {
  @scala.inline
  def apply(paymentRequest: js.Any, classes: Anon_Base = null, style: Anon_BaseComplete = null): PaymentButtonOptions = {
    val __obj = js.Dynamic.literal(paymentRequest = paymentRequest.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentButtonOptions]
  }
}


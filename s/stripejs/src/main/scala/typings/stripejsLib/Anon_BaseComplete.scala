package typings
package stripejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseComplete extends js.Object {
  var base: js.UndefOr[stripejsLib.elementMod.PaymentRequestButtonStyle] = js.undefined
  var complete: js.UndefOr[stripejsLib.elementMod.PaymentRequestButtonStyle] = js.undefined
  var empty: js.UndefOr[stripejsLib.elementMod.PaymentRequestButtonStyle] = js.undefined
  var invalid: js.UndefOr[stripejsLib.elementMod.PaymentRequestButtonStyle] = js.undefined
  var paymentRequestButton: js.UndefOr[stripejsLib.elementMod.PaymentRequestButtonStyle] = js.undefined
}

object Anon_BaseComplete {
  @scala.inline
  def apply(
    base: stripejsLib.elementMod.PaymentRequestButtonStyle = null,
    complete: stripejsLib.elementMod.PaymentRequestButtonStyle = null,
    empty: stripejsLib.elementMod.PaymentRequestButtonStyle = null,
    invalid: stripejsLib.elementMod.PaymentRequestButtonStyle = null,
    paymentRequestButton: stripejsLib.elementMod.PaymentRequestButtonStyle = null
  ): Anon_BaseComplete = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (paymentRequestButton != null) __obj.updateDynamic("paymentRequestButton")(paymentRequestButton)
    __obj.asInstanceOf[Anon_BaseComplete]
  }
}


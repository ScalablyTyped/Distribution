package typings
package stripejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseCompleteEmpty extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement */ var complete: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement--complete */ var empty: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement--empty */ var focus: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement--focus */ var invalid: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement--invalid */ var webkitAutofill: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BaseCompleteEmpty {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    complete: java.lang.String = null,
    empty: java.lang.String = null,
    focus: java.lang.String = null,
    invalid: java.lang.String = null,
    webkitAutofill: java.lang.String = null
  ): Anon_BaseCompleteEmpty = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (webkitAutofill != null) __obj.updateDynamic("webkitAutofill")(webkitAutofill)
    __obj.asInstanceOf[Anon_BaseCompleteEmpty]
  }
}


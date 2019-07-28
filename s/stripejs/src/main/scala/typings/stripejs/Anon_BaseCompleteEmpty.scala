package typings.stripejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseCompleteEmpty extends js.Object {
  var base: js.UndefOr[String] = js.undefined
   /** @default StripeElement */ var complete: js.UndefOr[String] = js.undefined
   /** @default StripeElement--complete */ var empty: js.UndefOr[String] = js.undefined
   /** @default StripeElement--empty */ var focus: js.UndefOr[String] = js.undefined
   /** @default StripeElement--focus */ var invalid: js.UndefOr[String] = js.undefined
   /** @default StripeElement--invalid */ var webkitAutofill: js.UndefOr[String] = js.undefined
}

object Anon_BaseCompleteEmpty {
  @scala.inline
  def apply(
    base: String = null,
    complete: String = null,
    empty: String = null,
    focus: String = null,
    invalid: String = null,
    webkitAutofill: String = null
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


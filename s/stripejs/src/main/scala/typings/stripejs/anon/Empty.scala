package typings.stripejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Empty extends js.Object {
  var base: js.UndefOr[String] = js.undefined
   /** @default StripeElement */ var complete: js.UndefOr[String] = js.undefined
   /** @default StripeElement--complete */ var empty: js.UndefOr[String] = js.undefined
   /** @default StripeElement--empty */ var focus: js.UndefOr[String] = js.undefined
   /** @default StripeElement--focus */ var invalid: js.UndefOr[String] = js.undefined
   /** @default StripeElement--invalid */ var webkitAutofill: js.UndefOr[String] = js.undefined
}

object Empty {
  @scala.inline
  def apply(
    base: String = null,
    complete: String = null,
    empty: String = null,
    focus: String = null,
    invalid: String = null,
    webkitAutofill: String = null
  ): Empty = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (webkitAutofill != null) __obj.updateDynamic("webkitAutofill")(webkitAutofill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Empty]
  }
}


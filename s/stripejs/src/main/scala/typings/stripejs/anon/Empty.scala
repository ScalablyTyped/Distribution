package typings.stripejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Empty extends js.Object {
  var base: js.UndefOr[String] = js.native
   /** @default StripeElement */ var complete: js.UndefOr[String] = js.native
   /** @default StripeElement--complete */ var empty: js.UndefOr[String] = js.native
   /** @default StripeElement--empty */ var focus: js.UndefOr[String] = js.native
   /** @default StripeElement--focus */ var invalid: js.UndefOr[String] = js.native
   /** @default StripeElement--invalid */ var webkitAutofill: js.UndefOr[String] = js.native
}

object Empty {
  @scala.inline
  def apply(): Empty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Empty]
  }
  @scala.inline
  implicit class EmptyOps[Self <: Empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setInvalid(value: String): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setWebkitAutofill(value: String): Self = this.set("webkitAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitAutofill: Self = this.set("webkitAutofill", js.undefined)
  }
  
}


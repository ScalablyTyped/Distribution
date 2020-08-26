package typings.stripejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: js.UndefOr[String] = js.native
   /** @default StripeElement */ var complete: js.UndefOr[String] = js.native
   /** @default StripeElement--complete */ var focus: String = js.native
   /** @default StripeElement--focus */ var invalid: String = js.native
}

object Base {
  @scala.inline
  def apply(focus: String, invalid: String): Base = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalid(value: String): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
  }
  
}


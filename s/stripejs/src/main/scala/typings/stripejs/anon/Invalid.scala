package typings.stripejs.anon

import typings.stripejs.elementMod.StyleAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalid extends js.Object {
  var base: js.UndefOr[StyleAttributes] = js.native
  var complete: js.UndefOr[StyleAttributes] = js.native
  var empty: js.UndefOr[StyleAttributes] = js.native
  var invalid: js.UndefOr[StyleAttributes] = js.native
}

object Invalid {
  @scala.inline
  def apply(): Invalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalid]
  }
  @scala.inline
  implicit class InvalidOps[Self <: Invalid] (val x: Self) extends AnyVal {
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
    def setBase(value: StyleAttributes): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setComplete(value: StyleAttributes): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setEmpty(value: StyleAttributes): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setInvalid(value: StyleAttributes): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
  }
  
}


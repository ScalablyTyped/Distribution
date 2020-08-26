package typings.vueTelInput.mod

import typings.vue.optionsMod.DirectiveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputDirective extends js.Object {
  var `click-outside`: DirectiveOptions = js.native
}

object VueTelInputDirective {
  @scala.inline
  def apply(`click-outside`: DirectiveOptions): VueTelInputDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click-outside")(`click-outside`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputDirective]
  }
  @scala.inline
  implicit class VueTelInputDirectiveOps[Self <: VueTelInputDirective] (val x: Self) extends AnyVal {
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
    def `setClick-outside`(value: DirectiveOptions): Self = this.set("click-outside", value.asInstanceOf[js.Any])
  }
  
}


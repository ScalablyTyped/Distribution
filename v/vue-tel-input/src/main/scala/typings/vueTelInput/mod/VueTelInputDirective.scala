package typings.vueTelInput.mod

import typings.vue.optionsMod.DirectiveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTelInputDirective extends js.Object {
  var `click-outside`: DirectiveOptions
}

object VueTelInputDirective {
  @scala.inline
  def apply(`click-outside`: DirectiveOptions): VueTelInputDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click-outside")(`click-outside`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputDirective]
  }
}


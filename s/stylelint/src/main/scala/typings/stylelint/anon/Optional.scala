package typings.stylelint.anon

import typings.stylelint.mod.ValidateOptionsAssertion
import typings.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optional extends ValidateOptionsAssertion {
  var actual: js.UndefOr[js.Any] = js.native
  var optional: `true` = js.native
  var possible: js.Any = js.native
}

object Optional {
  @scala.inline
  def apply(optional: `true`, possible: js.Any): Optional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional]
  }
  @scala.inline
  implicit class OptionalOps[Self <: Optional] (val x: Self) extends AnyVal {
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
    def setOptional(value: `true`): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setPossible(value: js.Any): Self = this.set("possible", value.asInstanceOf[js.Any])
    @scala.inline
    def setActual(value: js.Any): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActual: Self = this.set("actual", js.undefined)
  }
  
}


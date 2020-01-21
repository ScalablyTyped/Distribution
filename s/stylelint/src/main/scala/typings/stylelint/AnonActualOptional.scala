package typings.stylelint

import typings.stylelint.mod.ValidateOptionsAssertion
import typings.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActualOptional extends ValidateOptionsAssertion {
  var actual: js.UndefOr[js.Any] = js.undefined
  var optional: `true`
  var possible: js.Any
}

object AnonActualOptional {
  @scala.inline
  def apply(optional: `true`, possible: js.Any, actual: js.Any = null): AnonActualOptional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActualOptional]
  }
}


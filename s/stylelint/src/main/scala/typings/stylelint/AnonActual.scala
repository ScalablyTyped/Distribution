package typings.stylelint

import typings.stylelint.mod.ValidateOptionsAssertion
import typings.stylelint.stylelintBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActual extends ValidateOptionsAssertion {
  var actual: js.Any
  var optional: js.UndefOr[`false`] = js.undefined
  var possible: js.UndefOr[js.Any] = js.undefined
}

object AnonActual {
  @scala.inline
  def apply(actual: js.Any, optional: `false` = null, possible: js.Any = null): AnonActual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (possible != null) __obj.updateDynamic("possible")(possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActual]
  }
}


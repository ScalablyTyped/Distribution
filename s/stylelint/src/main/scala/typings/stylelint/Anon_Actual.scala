package typings.stylelint

import typings.stylelint.stylelintBooleans.`false`
import typings.stylelint.stylelintMod.ValidateOptionsAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends ValidateOptionsAssertion {
  var actual: js.Any
  var optional: js.UndefOr[`false`] = js.undefined
  var possible: js.UndefOr[js.Any] = js.undefined
}

object Anon_Actual {
  @scala.inline
  def apply(actual: js.Any, optional: `false` = null, possible: js.Any = null): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (possible != null) __obj.updateDynamic("possible")(possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Actual]
  }
}


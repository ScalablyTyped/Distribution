package typings.stylelint.stylelintMod

import typings.stylelint.stylelintNumbers.`false`
import typings.stylelint.stylelintNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptionsAssertion extends js.Object {
  var actual: js.UndefOr[js.Any] = js.undefined
  var optional: js.UndefOr[`false` | `true`] = js.undefined
  var possible: js.UndefOr[js.Any] = js.undefined
}

object ValidateOptionsAssertion {
  @scala.inline
  def apply(actual: js.Any = null, optional: `false` = null, possible: js.Any = null): ValidateOptionsAssertion = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual)
    if (optional != null) __obj.updateDynamic("optional")(optional)
    if (possible != null) __obj.updateDynamic("possible")(possible)
    __obj.asInstanceOf[ValidateOptionsAssertion]
  }
}


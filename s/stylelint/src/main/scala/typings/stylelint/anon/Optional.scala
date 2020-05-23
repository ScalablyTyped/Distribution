package typings.stylelint.anon

import typings.stylelint.mod.ValidateOptionsAssertion
import typings.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optional extends ValidateOptionsAssertion {
  var actual: js.UndefOr[js.Any] = js.undefined
  var optional: `true`
  var possible: js.Any
}

object Optional {
  @scala.inline
  def apply(optional: `true`, possible: js.Any, actual: js.Any = null): Optional = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optional]
  }
}


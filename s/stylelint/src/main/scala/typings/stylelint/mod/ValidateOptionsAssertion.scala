package typings.stylelint.mod

import typings.stylelint.stylelintBooleans.`false`
import typings.stylelint.stylelintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stylelint.AnonActual
  - typings.stylelint.AnonActualOptional
*/
trait ValidateOptionsAssertion extends js.Object

object ValidateOptionsAssertion {
  @scala.inline
  def AnonActual(actual: js.Any, optional: `false` = null, possible: js.Any = null): ValidateOptionsAssertion = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (possible != null) __obj.updateDynamic("possible")(possible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptionsAssertion]
  }
  @scala.inline
  def AnonActualOptional(optional: `true`, possible: js.Any, actual: js.Any = null): ValidateOptionsAssertion = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptionsAssertion]
  }
}


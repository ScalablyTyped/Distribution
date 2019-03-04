package typings
package stylelintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualOptional
  extends stylelintLib.stylelintMod.RuleOption {
  var actual: js.UndefOr[js.Any] = js.undefined
  var optional: stylelintLib.stylelintLibNumbers.`true`
  var possible: js.Any
}

object Anon_ActualOptional {
  @scala.inline
  def apply(optional: stylelintLib.stylelintLibNumbers.`true`, possible: js.Any, actual: js.Any = null): Anon_ActualOptional = {
    val __obj = js.Dynamic.literal(optional = optional, possible = possible)
    if (actual != null) __obj.updateDynamic("actual")(actual)
    __obj.asInstanceOf[Anon_ActualOptional]
  }
}


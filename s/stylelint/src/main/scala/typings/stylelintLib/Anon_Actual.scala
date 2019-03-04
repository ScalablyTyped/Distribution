package typings
package stylelintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual
  extends stylelintLib.stylelintMod.RuleOption {
  var actual: js.Any
  var optional: js.UndefOr[stylelintLib.stylelintLibNumbers.`false`] = js.undefined
  var possible: js.UndefOr[js.Any] = js.undefined
}

object Anon_Actual {
  @scala.inline
  def apply(actual: js.Any, optional: stylelintLib.stylelintLibNumbers.`false` = null, possible: js.Any = null): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual)
    if (optional != null) __obj.updateDynamic("optional")(optional)
    if (possible != null) __obj.updateDynamic("possible")(possible)
    __obj.asInstanceOf[Anon_Actual]
  }
}


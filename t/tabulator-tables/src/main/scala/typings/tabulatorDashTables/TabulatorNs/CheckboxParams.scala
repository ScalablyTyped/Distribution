package typings.tabulatorDashTables.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxParams extends _EditorParams {
  var indeterminateValue: js.UndefOr[String] = js.undefined
  // tick
  var tristate: js.UndefOr[Boolean] = js.undefined
}

object CheckboxParams {
  @scala.inline
  def apply(indeterminateValue: String = null, tristate: js.UndefOr[Boolean] = js.undefined): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    if (indeterminateValue != null) __obj.updateDynamic("indeterminateValue")(indeterminateValue)
    if (!js.isUndefined(tristate)) __obj.updateDynamic("tristate")(tristate)
    __obj.asInstanceOf[CheckboxParams]
  }
}


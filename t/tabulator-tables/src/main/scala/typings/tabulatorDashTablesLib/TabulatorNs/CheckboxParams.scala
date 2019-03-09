package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxParams extends _EditorParams {
  var indeterminateValue: js.UndefOr[java.lang.String] = js.undefined
  // tick
  var tristate: js.UndefOr[scala.Boolean] = js.undefined
}

object CheckboxParams {
  @scala.inline
  def apply(indeterminateValue: java.lang.String = null, tristate: js.UndefOr[scala.Boolean] = js.undefined): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    if (indeterminateValue != null) __obj.updateDynamic("indeterminateValue")(indeterminateValue)
    if (!js.isUndefined(tristate)) __obj.updateDynamic("tristate")(tristate)
    __obj.asInstanceOf[CheckboxParams]
  }
}


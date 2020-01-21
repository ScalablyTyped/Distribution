package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxParams
  extends SharedEditorParams
     with _EditorParams {
  var indeterminateValue: js.UndefOr[String] = js.undefined
  // tick
  var tristate: js.UndefOr[Boolean] = js.undefined
}

object CheckboxParams {
  @scala.inline
  def apply(
    elementAttributes: JSONRecord = null,
    indeterminateValue: String = null,
    tristate: js.UndefOr[Boolean] = js.undefined
  ): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (indeterminateValue != null) __obj.updateDynamic("indeterminateValue")(indeterminateValue.asInstanceOf[js.Any])
    if (!js.isUndefined(tristate)) __obj.updateDynamic("tristate")(tristate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxParams]
  }
}


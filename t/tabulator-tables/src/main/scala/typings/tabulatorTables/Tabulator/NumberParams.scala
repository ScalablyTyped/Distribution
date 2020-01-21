package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberParams
  extends SharedEditorParams
     with _EditorParams {
  var max: js.UndefOr[Double] = js.undefined
  // range,number
  var min: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var verticalNavigation: js.UndefOr[editor | table] = js.undefined
}

object NumberParams {
  @scala.inline
  def apply(
    elementAttributes: JSONRecord = null,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null,
    verticalNavigation: editor | table = null
  ): NumberParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberParams]
  }
}


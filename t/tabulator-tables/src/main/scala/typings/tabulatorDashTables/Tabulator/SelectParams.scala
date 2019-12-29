package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.editor
import typings.tabulatorDashTables.tabulatorDashTablesStrings.hybrid
import typings.tabulatorDashTables.tabulatorDashTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object SelectParams {
  @scala.inline
  def apply(
    values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null,
    verticalNavigation: editor | table | hybrid = null
  ): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParams]
  }
}


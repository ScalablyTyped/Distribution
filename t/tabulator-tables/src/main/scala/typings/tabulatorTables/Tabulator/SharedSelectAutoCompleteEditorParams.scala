package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSelectAutoCompleteEditorParams extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var sortValuesList: js.UndefOr[asc | desc] = js.undefined
}

object SharedSelectAutoCompleteEditorParams {
  @scala.inline
  def apply(defaultValue: String = null, sortValuesList: asc | desc = null): SharedSelectAutoCompleteEditorParams = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (sortValuesList != null) __obj.updateDynamic("sortValuesList")(sortValuesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
  }
}


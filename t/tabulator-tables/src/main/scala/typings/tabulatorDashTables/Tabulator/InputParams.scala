package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParams
  extends SharedEditorParams
     with _EditorParams {
  /**Changes input type to 'search' and shows an 'X' clear button to clear the cell value easily */
  var search: js.UndefOr[Boolean] = js.undefined
}

object InputParams {
  @scala.inline
  def apply(elementAttributes: JSONRecord = null, search: js.UndefOr[Boolean] = js.undefined): InputParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[InputParams]
  }
}


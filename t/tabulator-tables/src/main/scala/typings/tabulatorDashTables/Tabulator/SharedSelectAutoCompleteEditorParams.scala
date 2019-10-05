package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSelectAutoCompleteEditorParams extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
}

object SharedSelectAutoCompleteEditorParams {
  @scala.inline
  def apply(defaultValue: String = null): SharedSelectAutoCompleteEditorParams = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
  }
}


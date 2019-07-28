package typings.tabulatorDashTables.TabulatorNs

import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParams extends _EditorParams {
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord
}

object SelectParams {
  @scala.inline
  def apply(
    values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null
  ): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    __obj.asInstanceOf[SelectParams]
  }
}


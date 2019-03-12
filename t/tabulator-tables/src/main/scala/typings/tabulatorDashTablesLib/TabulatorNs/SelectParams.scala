package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParams extends _EditorParams {
  var listItemFormatter: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* text */ java.lang.String, java.lang.String]
  ] = js.undefined
  var values: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | js.Array[java.lang.String] | JSONRecord | js.Array[SelectParamsGroup]
}

object SelectParams {
  @scala.inline
  def apply(
    values: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | js.Array[java.lang.String] | JSONRecord | js.Array[SelectParamsGroup],
    listItemFormatter: (/* value */ java.lang.String, /* text */ java.lang.String) => java.lang.String = null
  ): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    __obj.asInstanceOf[SelectParams]
  }
}


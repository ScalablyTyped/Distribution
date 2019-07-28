package typings.tabulatorDashTables.TabulatorNs

import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteParams extends _EditorParams {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var freetext: js.UndefOr[Boolean] = js.undefined
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var searchFunc: js.UndefOr[js.Function2[/* term */ String, /* values */ js.Array[String], js.Array[String]]] = js.undefined
  var showListOnEmpty: js.UndefOr[Boolean] = js.undefined
  var values: `true` | js.Array[String] | JSONRecord
}

object AutoCompleteParams {
  @scala.inline
  def apply(
    values: `true` | js.Array[String] | JSONRecord,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    freetext: js.UndefOr[Boolean] = js.undefined,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null,
    searchFunc: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] = null,
    showListOnEmpty: js.UndefOr[Boolean] = js.undefined
  ): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(freetext)) __obj.updateDynamic("freetext")(freetext)
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (searchFunc != null) __obj.updateDynamic("searchFunc")(js.Any.fromFunction2(searchFunc))
    if (!js.isUndefined(showListOnEmpty)) __obj.updateDynamic("showListOnEmpty")(showListOnEmpty)
    __obj.asInstanceOf[AutoCompleteParams]
  }
}


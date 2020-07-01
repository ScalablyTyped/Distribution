package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.desc
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var emptyPlaceholder: js.UndefOr[String | HTMLElement] = js.undefined
  var freetext: js.UndefOr[Boolean] = js.undefined
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.undefined
  var searchFunc: js.UndefOr[
    js.Function2[
      /* term */ String, 
      /* values */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.undefined
  /**If you return a promise from the searchFunc callback then a "Searching..." placeholder will be displayed until the promise resolved.
    You can customise this placeholder using the searchingPlaceholder option. */
  var searchingPlaceholder: js.UndefOr[String | HTMLElement] = js.undefined
  var showListOnEmpty: js.UndefOr[Boolean] = js.undefined
  var values: `true` | (js.Array[_ | String]) | JSONRecord | String
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object AutoCompleteParams {
  @scala.inline
  def apply(
    values: `true` | (js.Array[_ | String]) | JSONRecord | String,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    emptyPlaceholder: String | HTMLElement = null,
    freetext: js.UndefOr[Boolean] = js.undefined,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    searchFunc: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]] = null,
    searchingPlaceholder: String | HTMLElement = null,
    showListOnEmpty: js.UndefOr[Boolean] = js.undefined,
    sortValuesList: asc | desc = null,
    verticalNavigation: editor | table | hybrid = null
  ): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (emptyPlaceholder != null) __obj.updateDynamic("emptyPlaceholder")(emptyPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(freetext)) __obj.updateDynamic("freetext")(freetext.get.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.get.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (searchFunc != null) __obj.updateDynamic("searchFunc")(js.Any.fromFunction2(searchFunc))
    if (searchingPlaceholder != null) __obj.updateDynamic("searchingPlaceholder")(searchingPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showListOnEmpty)) __obj.updateDynamic("showListOnEmpty")(showListOnEmpty.get.asInstanceOf[js.Any])
    if (sortValuesList != null) __obj.updateDynamic("sortValuesList")(sortValuesList.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteParams]
  }
}


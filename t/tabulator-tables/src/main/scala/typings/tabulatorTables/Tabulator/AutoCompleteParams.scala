package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var emptyPlaceholder: js.UndefOr[String | HTMLElement] = js.native
  var freetext: js.UndefOr[Boolean] = js.native
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
  var searchFunc: js.UndefOr[
    js.Function2[
      /* term */ String, 
      /* values */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.native
  /**If you return a promise from the searchFunc callback then a "Searching..." placeholder will be displayed until the promise resolved.
    You can customise this placeholder using the searchingPlaceholder option. */
  var searchingPlaceholder: js.UndefOr[String | HTMLElement] = js.native
  var showListOnEmpty: js.UndefOr[Boolean] = js.native
  var values: `true` | (js.Array[_ | String]) | JSONRecord | String = js.native
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
}

object AutoCompleteParams {
  @scala.inline
  def apply(values: `true` | (js.Array[_ | String]) | JSONRecord | String): AutoCompleteParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteParams]
  }
  @scala.inline
  implicit class AutoCompleteParamsOps[Self <: AutoCompleteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValuesVarargs(value: (js.Any | String)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: `true` | (js.Array[_ | String]) | JSONRecord | String): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setEmptyPlaceholder(value: String | HTMLElement): Self = this.set("emptyPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyPlaceholder: Self = this.set("emptyPlaceholder", js.undefined)
    @scala.inline
    def setFreetext(value: Boolean): Self = this.set("freetext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreetext: Self = this.set("freetext", js.undefined)
    @scala.inline
    def setListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = this.set("listItemFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteListItemFormatter: Self = this.set("listItemFormatter", js.undefined)
    @scala.inline
    def setSearchFunc(
      value: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
    ): Self = this.set("searchFunc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSearchFunc: Self = this.set("searchFunc", js.undefined)
    @scala.inline
    def setSearchingPlaceholder(value: String | HTMLElement): Self = this.set("searchingPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchingPlaceholder: Self = this.set("searchingPlaceholder", js.undefined)
    @scala.inline
    def setShowListOnEmpty(value: Boolean): Self = this.set("showListOnEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowListOnEmpty: Self = this.set("showListOnEmpty", js.undefined)
    @scala.inline
    def setVerticalNavigation(value: editor | table | hybrid): Self = this.set("verticalNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalNavigation: Self = this.set("verticalNavigation", js.undefined)
  }
  
}


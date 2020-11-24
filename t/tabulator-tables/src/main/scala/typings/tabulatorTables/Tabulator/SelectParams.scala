package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
  
  var multiselect: js.UndefOr[Boolean | Double] = js.native
  
  var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String = js.native
  
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
}
object SelectParams {
  
  @scala.inline
  def apply(values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParams]
  }
  
  @scala.inline
  implicit class SelectParamsOps[Self <: SelectParams] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: (SelectParamsGroup | String)*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = this.set("listItemFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteListItemFormatter: Self = this.set("listItemFormatter", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean | Double): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setVerticalNavigation(value: editor | table | hybrid): Self = this.set("verticalNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalNavigation: Self = this.set("verticalNavigation", js.undefined)
  }
}

package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedSelectAutoCompleteEditorParams extends js.Object {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var sortValuesList: js.UndefOr[asc | desc] = js.native
}
object SharedSelectAutoCompleteEditorParams {
  
  @scala.inline
  def apply(): SharedSelectAutoCompleteEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
  }
  
  @scala.inline
  implicit class SharedSelectAutoCompleteEditorParamsOps[Self <: SharedSelectAutoCompleteEditorParams] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setSortValuesList(value: asc | desc): Self = this.set("sortValuesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortValuesList: Self = this.set("sortValuesList", js.undefined)
  }
}

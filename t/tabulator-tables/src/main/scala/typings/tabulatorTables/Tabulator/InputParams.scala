package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputParams
  extends SharedEditorParams
     with _EditorParams {
  
  /**Changes input type to 'search' and shows an 'X' clear button to clear the cell value easily */
  var search: js.UndefOr[Boolean] = js.native
}
object InputParams {
  
  @scala.inline
  def apply(): InputParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParams]
  }
  
  @scala.inline
  implicit class InputParamsOps[Self <: InputParams] (val x: Self) extends AnyVal {
    
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
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}

package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowSelectionParams extends _FormatterParams {
  
  var rowRange: js.UndefOr[RowRangeLookup] = js.native
}
object RowSelectionParams {
  
  @scala.inline
  def apply(): RowSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionParams]
  }
  
  @scala.inline
  implicit class RowSelectionParamsOps[Self <: RowSelectionParams] (val x: Self) extends AnyVal {
    
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
    def setRowRange(value: RowRangeLookup): Self = this.set("rowRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowRange: Self = this.set("rowRange", js.undefined)
  }
}

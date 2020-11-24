package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddditionalExportOptions extends js.Object {
  
  var columnCalcs: js.UndefOr[Boolean] = js.native
  
  var columnGroups: js.UndefOr[Boolean] = js.native
  
  var columnHeaders: js.UndefOr[Boolean] = js.native
  
  var dataTree: js.UndefOr[Boolean] = js.native
  
  /**Show only raw unformatted cell values in the clipboard output */
  var formatCells: js.UndefOr[Boolean] = js.native
  
  var rowGroups: js.UndefOr[Boolean] = js.native
}
object AddditionalExportOptions {
  
  @scala.inline
  def apply(): AddditionalExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddditionalExportOptions]
  }
  
  @scala.inline
  implicit class AddditionalExportOptionsOps[Self <: AddditionalExportOptions] (val x: Self) extends AnyVal {
    
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
    def setColumnCalcs(value: Boolean): Self = this.set("columnCalcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCalcs: Self = this.set("columnCalcs", js.undefined)
    
    @scala.inline
    def setColumnGroups(value: Boolean): Self = this.set("columnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroups: Self = this.set("columnGroups", js.undefined)
    
    @scala.inline
    def setColumnHeaders(value: Boolean): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    
    @scala.inline
    def setDataTree(value: Boolean): Self = this.set("dataTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTree: Self = this.set("dataTree", js.undefined)
    
    @scala.inline
    def setFormatCells(value: Boolean): Self = this.set("formatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatCells: Self = this.set("formatCells", js.undefined)
    
    @scala.inline
    def setRowGroups(value: Boolean): Self = this.set("rowGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroups: Self = this.set("rowGroups", js.undefined)
  }
}

package typings.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridRow extends js.Object {
  
  /**
    * If set to false, then don't export this row, notwithstanding visible or other settings.
    * Defaults to true
    * @default true
    */
  var exporterEnableExporting: js.UndefOr[Boolean] = js.native
}
object IGridRow {
  
  @scala.inline
  def apply(): IGridRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridRow]
  }
  
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
    
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
    def setExporterEnableExporting(value: Boolean): Self = this.set("exporterEnableExporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExporterEnableExporting: Self = this.set("exporterEnableExporting", js.undefined)
  }
}

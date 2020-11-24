package typings.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnDef extends js.Object {
  
  /**
    * the alignment you'd like for this specific column when exported into a pdf.
    * Can be 'left', 'right', 'center' or any other valid pdfMake alignment option.
    */
  var exporterPdfAlign: js.UndefOr[String] = js.native
  
  /**
    * Suppresses export for this column. Used by selection and expandable.
    */
  var exporterSuppressExport: js.UndefOr[Boolean] = js.native
}
object IColumnDef {
  
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
    
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
    def setExporterPdfAlign(value: String): Self = this.set("exporterPdfAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExporterPdfAlign: Self = this.set("exporterPdfAlign", js.undefined)
    
    @scala.inline
    def setExporterSuppressExport(value: Boolean): Self = this.set("exporterSuppressExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExporterSuppressExport: Self = this.set("exporterSuppressExport", js.undefined)
  }
}

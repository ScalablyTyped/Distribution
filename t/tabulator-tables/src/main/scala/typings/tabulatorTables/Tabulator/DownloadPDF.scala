package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.landscape
import typings.tabulatorTables.tabulatorTablesStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadPDF extends js.Object {
  
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.native
  
  /**An optional callback documentProcessing can be set on the download config object, that is passed the jsPDF document object after the auto-table creation to allow full customisation of the PDF */
  var documentProcessing: js.UndefOr[js.Function1[/* doc */ js.Any, _]] = js.native
  
  var jsPDF: js.UndefOr[js.Any] = js.native
  
  var orientation: js.UndefOr[portrait | landscape] = js.native
  
  var rowCalcStyles: js.UndefOr[js.Any] = js.native
  
  var rowGroupStyles: js.UndefOr[js.Any] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DownloadPDF {
  
  @scala.inline
  def apply(): DownloadPDF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadPDF]
  }
  
  @scala.inline
  implicit class DownloadPDFOps[Self <: DownloadPDF] (val x: Self) extends AnyVal {
    
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
    def setAutoTableFunction1(value: /* doc */ js.Any => _): Self = this.set("autoTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoTable(value: js.Object | (js.Function1[/* doc */ js.Any, _])): Self = this.set("autoTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoTable: Self = this.set("autoTable", js.undefined)
    
    @scala.inline
    def setDocumentProcessing(value: /* doc */ js.Any => _): Self = this.set("documentProcessing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDocumentProcessing: Self = this.set("documentProcessing", js.undefined)
    
    @scala.inline
    def setJsPDF(value: js.Any): Self = this.set("jsPDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsPDF: Self = this.set("jsPDF", js.undefined)
    
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRowCalcStyles(value: js.Any): Self = this.set("rowCalcStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCalcStyles: Self = this.set("rowCalcStyles", js.undefined)
    
    @scala.inline
    def setRowGroupStyles(value: js.Any): Self = this.set("rowGroupStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowGroupStyles: Self = this.set("rowGroupStyles", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}

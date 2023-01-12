package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.landscape
import typings.tabulatorTables.tabulatorTablesStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadPDF extends StObject {
  
  var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ Any, Any])] = js.undefined
  
  /** An optional callback documentProcessing can be set on the download config object, that is passed the jsPDF document object after the auto-table creation to allow full customization of the PDF */
  var documentProcessing: js.UndefOr[js.Function1[/* doc */ Any, Any]] = js.undefined
  
  var jsPDF: js.UndefOr[Any] = js.undefined
  
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  
  var rowCalcStyles: js.UndefOr[Any] = js.undefined
  
  var rowGroupStyles: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DownloadPDF {
  
  inline def apply(): DownloadPDF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadPDF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadPDF] (val x: Self) extends AnyVal {
    
    inline def setAutoTable(value: js.Object | (js.Function1[/* doc */ Any, Any])): Self = StObject.set(x, "autoTable", value.asInstanceOf[js.Any])
    
    inline def setAutoTableFunction1(value: /* doc */ Any => Any): Self = StObject.set(x, "autoTable", js.Any.fromFunction1(value))
    
    inline def setAutoTableUndefined: Self = StObject.set(x, "autoTable", js.undefined)
    
    inline def setDocumentProcessing(value: /* doc */ Any => Any): Self = StObject.set(x, "documentProcessing", js.Any.fromFunction1(value))
    
    inline def setDocumentProcessingUndefined: Self = StObject.set(x, "documentProcessing", js.undefined)
    
    inline def setJsPDF(value: Any): Self = StObject.set(x, "jsPDF", value.asInstanceOf[js.Any])
    
    inline def setJsPDFUndefined: Self = StObject.set(x, "jsPDF", js.undefined)
    
    inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRowCalcStyles(value: Any): Self = StObject.set(x, "rowCalcStyles", value.asInstanceOf[js.Any])
    
    inline def setRowCalcStylesUndefined: Self = StObject.set(x, "rowCalcStyles", js.undefined)
    
    inline def setRowGroupStyles(value: Any): Self = StObject.set(x, "rowGroupStyles", value.asInstanceOf[js.Any])
    
    inline def setRowGroupStylesUndefined: Self = StObject.set(x, "rowGroupStyles", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

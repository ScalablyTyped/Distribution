package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadXLXS extends StObject {
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var documentProcessing: js.UndefOr[js.Function1[/* input */ Any, Any]] = js.undefined
  
  /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :, */
  var sheetName: js.UndefOr[String] = js.undefined
}
object DownloadXLXS {
  
  inline def apply(): DownloadXLXS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadXLXS]
  }
  
  extension [Self <: DownloadXLXS](x: Self) {
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDocumentProcessing(value: /* input */ Any => Any): Self = StObject.set(x, "documentProcessing", js.Any.fromFunction1(value))
    
    inline def setDocumentProcessingUndefined: Self = StObject.set(x, "documentProcessing", js.undefined)
    
    inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    inline def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
  }
}

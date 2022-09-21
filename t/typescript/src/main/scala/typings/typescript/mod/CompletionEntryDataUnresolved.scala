package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDataUnresolved
  extends StObject
     with CompletionEntryDataAutoImport
     with CompletionEntryData {
  
  /** The key in the `ExportMapCache` where the completion entry's `SymbolExportInfo[]` is found */
  var exportMapKey: java.lang.String
}
object CompletionEntryDataUnresolved {
  
  inline def apply(exportMapKey: java.lang.String, exportName: java.lang.String): CompletionEntryDataUnresolved = {
    val __obj = js.Dynamic.literal(exportMapKey = exportMapKey.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDataUnresolved]
  }
  
  extension [Self <: CompletionEntryDataUnresolved](x: Self) {
    
    inline def setExportMapKey(value: java.lang.String): Self = StObject.set(x, "exportMapKey", value.asInstanceOf[js.Any])
  }
}

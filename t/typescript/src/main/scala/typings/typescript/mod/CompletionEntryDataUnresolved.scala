package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDataUnresolved
  extends StObject
     with CompletionEntryDataAutoImport
     with CompletionEntryData {
  
  @JSName("exportMapKey")
  var exportMapKey_CompletionEntryDataUnresolved: java.lang.String
}
object CompletionEntryDataUnresolved {
  
  inline def apply(exportMapKey: java.lang.String, exportName: java.lang.String): CompletionEntryDataUnresolved = {
    val __obj = js.Dynamic.literal(exportMapKey = exportMapKey.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDataUnresolved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionEntryDataUnresolved] (val x: Self) extends AnyVal {
    
    inline def setExportMapKey(value: java.lang.String): Self = StObject.set(x, "exportMapKey", value.asInstanceOf[js.Any])
  }
}

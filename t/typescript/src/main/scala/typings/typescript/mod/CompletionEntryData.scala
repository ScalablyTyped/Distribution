package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.CompletionEntryDataUnresolved
  - typings.typescript.mod.CompletionEntryDataResolved
*/
trait CompletionEntryData extends StObject
object CompletionEntryData {
  
  inline def CompletionEntryDataResolved(exportName: java.lang.String, moduleSpecifier: java.lang.String): typings.typescript.mod.CompletionEntryDataResolved = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], moduleSpecifier = moduleSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.CompletionEntryDataResolved]
  }
  
  inline def CompletionEntryDataUnresolved(exportMapKey: java.lang.String, exportName: java.lang.String): typings.typescript.mod.CompletionEntryDataUnresolved = {
    val __obj = js.Dynamic.literal(exportMapKey = exportMapKey.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.CompletionEntryDataUnresolved]
  }
}

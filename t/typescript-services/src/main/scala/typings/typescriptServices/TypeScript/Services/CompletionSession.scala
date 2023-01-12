package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionSession extends StObject {
  
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails]
  
  var fileName: String
  
  var position: Double
}
object CompletionSession {
  
  inline def apply(entries: IdentiferNameHashTable[CachedCompletionEntryDetails], fileName: String, position: Double): CompletionSession = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionSession] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: IdentiferNameHashTable[CachedCompletionEntryDetails]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

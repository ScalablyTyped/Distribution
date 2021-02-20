package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionSession extends StObject {
  
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  
  var fileName: String = js.native
  
  var position: Double = js.native
}
object CompletionSession {
  
  @scala.inline
  def apply(entries: IdentiferNameHashTable[CachedCompletionEntryDetails], fileName: String, position: Double): CompletionSession = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionSession]
  }
  
  @scala.inline
  implicit class CompletionSessionMutableBuilder[Self <: CompletionSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: IdentiferNameHashTable[CachedCompletionEntryDetails]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

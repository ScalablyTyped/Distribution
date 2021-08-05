package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionInfo extends StObject {
  
  var entries: js.Array[CompletionEntry]
  
  var isMemberCompletion: Boolean
  
  var maybeInaccurate: Boolean
}
object CompletionInfo {
  
  inline def apply(entries: js.Array[CompletionEntry], isMemberCompletion: Boolean, maybeInaccurate: Boolean): CompletionInfo = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], maybeInaccurate = maybeInaccurate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionInfo]
  }
  
  extension [Self <: CompletionInfo](x: Self) {
    
    inline def setEntries(value: js.Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: CompletionEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
    
    inline def setMaybeInaccurate(value: Boolean): Self = StObject.set(x, "maybeInaccurate", value.asInstanceOf[js.Any])
  }
}

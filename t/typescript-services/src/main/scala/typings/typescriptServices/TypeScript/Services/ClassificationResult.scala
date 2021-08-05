package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResult extends StObject {
  
  var entries: js.Array[ClassificationInfo]
  
  var finalLexState: EndOfLineState
}
object ClassificationResult {
  
  inline def apply(entries: js.Array[ClassificationInfo], finalLexState: EndOfLineState): ClassificationResult = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], finalLexState = finalLexState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResult]
  }
  
  extension [Self <: ClassificationResult](x: Self) {
    
    inline def setEntries(value: js.Array[ClassificationInfo]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ClassificationInfo*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setFinalLexState(value: EndOfLineState): Self = StObject.set(x, "finalLexState", value.asInstanceOf[js.Any])
  }
}

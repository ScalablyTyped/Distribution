package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationResult extends StObject {
  
  var entries: js.Array[ClassificationInfo]
  
  var finalLexState: EndOfLineState
}
object ClassificationResult {
  
  @scala.inline
  def apply(entries: js.Array[ClassificationInfo], finalLexState: EndOfLineState): ClassificationResult = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], finalLexState = finalLexState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResult]
  }
  
  @scala.inline
  implicit class ClassificationResultMutableBuilder[Self <: ClassificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ClassificationInfo]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: ClassificationInfo*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setFinalLexState(value: EndOfLineState): Self = StObject.set(x, "finalLexState", value.asInstanceOf[js.Any])
  }
}

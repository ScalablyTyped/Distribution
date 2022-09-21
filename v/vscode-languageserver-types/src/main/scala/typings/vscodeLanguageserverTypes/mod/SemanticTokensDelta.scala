package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensDelta extends StObject {
  
  /**
    * The semantic token edits to transform a previous result into a new result.
    */
  var edits: js.Array[SemanticTokensEdit]
  
  val resultId: js.UndefOr[String] = js.undefined
}
object SemanticTokensDelta {
  
  inline def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensDelta = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensDelta]
  }
  
  extension [Self <: SemanticTokensDelta](x: Self) {
    
    inline def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value*))
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}

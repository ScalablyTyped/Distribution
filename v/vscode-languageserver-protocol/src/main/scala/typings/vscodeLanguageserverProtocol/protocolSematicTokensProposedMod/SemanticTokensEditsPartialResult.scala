package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEditsPartialResult extends StObject {
  
  var edits: js.Array[SemanticTokensEdit]
}
object SemanticTokensEditsPartialResult {
  
  inline def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEditsPartialResult = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsPartialResult]
  }
  
  extension [Self <: SemanticTokensEditsPartialResult](x: Self) {
    
    inline def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
  }
}

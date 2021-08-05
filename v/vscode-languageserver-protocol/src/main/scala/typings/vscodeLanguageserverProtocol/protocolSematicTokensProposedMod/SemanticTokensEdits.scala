package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensEdits extends StObject {
  
  /**
    * For a detailed description how these edits are structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L131
    */
  var edits: js.Array[SemanticTokensEdit]
  
  val resultId: js.UndefOr[String] = js.undefined
}
object SemanticTokensEdits {
  
  inline def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
  
  extension [Self <: SemanticTokensEdits](x: Self) {
    
    inline def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}

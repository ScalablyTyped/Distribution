package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensEdits extends StObject {
  
  /**
    * For a detailed description how these edits are structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L131
    */
  var edits: js.Array[SemanticTokensEdit] = js.native
  
  val resultId: js.UndefOr[String] = js.native
}
object SemanticTokensEdits {
  
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
  
  @scala.inline
  implicit class SemanticTokensEditsMutableBuilder[Self <: SemanticTokensEdits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
    
    @scala.inline
    def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}

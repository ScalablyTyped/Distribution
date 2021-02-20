package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensEditsPartialResult extends StObject {
  
  var edits: js.Array[SemanticTokensEdit] = js.native
}
object SemanticTokensEditsPartialResult {
  
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEditsPartialResult = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsPartialResult]
  }
  
  @scala.inline
  implicit class SemanticTokensEditsPartialResultMutableBuilder[Self <: SemanticTokensEditsPartialResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value :_*))
  }
}

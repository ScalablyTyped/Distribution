package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensRangeParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The range the semantic tokens are requested for.
    */
  var range: Range
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}
object SemanticTokensRangeParams {
  
  inline def apply(range: Range, textDocument: TextDocumentIdentifier): SemanticTokensRangeParams = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensRangeParams]
  }
  
  extension [Self <: SemanticTokensRangeParams](x: Self) {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlightParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams
object DocumentHighlightParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): DocumentHighlightParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlightParams]
  }
}

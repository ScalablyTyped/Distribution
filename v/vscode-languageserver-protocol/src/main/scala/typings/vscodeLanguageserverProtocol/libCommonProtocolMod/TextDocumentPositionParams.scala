package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentPositionParams extends StObject {
  
  /**
    * The position inside the text document.
    */
  var position: Position
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}
object TextDocumentPositionParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): TextDocumentPositionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentPositionParams]
  }
  
  extension [Self <: TextDocumentPositionParams](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

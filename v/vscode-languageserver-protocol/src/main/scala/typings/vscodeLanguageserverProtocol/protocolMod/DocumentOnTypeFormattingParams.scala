package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOnTypeFormattingParams extends StObject {
  
  /**
    * The character that has been typed that triggered the formatting
    * on type request. That is not necessarily the last character that
    * got inserted into the document since the client could auto insert
    * characters as well (e.g. like automatic brace completion).
    */
  var ch: String
  
  /**
    * The formatting options.
    */
  var options: FormattingOptions
  
  /**
    * The position around which the on type formatting should happen.
    * This is not necessarily the exact position where the character denoted
    * by the property `ch` got typed.
    */
  var position: Position
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentOnTypeFormattingParams {
  
  inline def apply(ch: String, options: FormattingOptions, position: Position, textDocument: TextDocumentIdentifier): DocumentOnTypeFormattingParams = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingParams]
  }
  
  extension [Self <: DocumentOnTypeFormattingParams](x: Self) {
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

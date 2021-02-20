package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentOnTypeFormattingParams extends StObject {
  
  /**
    * The character that has been typed.
    */
  var ch: String = js.native
  
  /**
    * The format options.
    */
  var options: FormattingOptions = js.native
  
  /**
    * The position at which this request was send.
    */
  var position: Position = js.native
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object DocumentOnTypeFormattingParams {
  
  @scala.inline
  def apply(ch: String, options: FormattingOptions, position: Position, textDocument: TextDocumentIdentifier): DocumentOnTypeFormattingParams = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingParams]
  }
  
  @scala.inline
  implicit class DocumentOnTypeFormattingParamsMutableBuilder[Self <: DocumentOnTypeFormattingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentFormattingParams extends WorkDoneProgressParams {
  
  /**
    * The format options
    */
  var options: FormattingOptions = js.native
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object DocumentFormattingParams {
  
  @scala.inline
  def apply(options: FormattingOptions, textDocument: TextDocumentIdentifier): DocumentFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFormattingParams]
  }
  
  @scala.inline
  implicit class DocumentFormattingParamsMutableBuilder[Self <: DocumentFormattingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

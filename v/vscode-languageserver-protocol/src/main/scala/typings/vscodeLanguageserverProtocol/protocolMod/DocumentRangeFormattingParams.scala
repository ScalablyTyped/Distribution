package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRangeFormattingParams extends WorkDoneProgressParams {
  
  /**
    * The format options
    */
  var options: FormattingOptions = js.native
  
  /**
    * The range to format
    */
  var range: Range = js.native
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object DocumentRangeFormattingParams {
  
  @scala.inline
  def apply(options: FormattingOptions, range: Range, textDocument: TextDocumentIdentifier): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
  
  @scala.inline
  implicit class DocumentRangeFormattingParamsMutableBuilder[Self <: DocumentRangeFormattingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

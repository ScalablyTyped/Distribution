package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFormattingParams
  extends StObject
     with WorkDoneProgressParams {
  
  /**
    * The format options.
    */
  var options: FormattingOptions
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentFormattingParams {
  
  inline def apply(options: FormattingOptions, textDocument: TextDocumentIdentifier): DocumentFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFormattingParams]
  }
  
  extension [Self <: DocumentFormattingParams](x: Self) {
    
    inline def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

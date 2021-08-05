package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionContext
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeActionParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext
  
  /**
    * The range for which the command was invoked.
    */
  var range: Range
  
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier
}
object CodeActionParams {
  
  inline def apply(context: CodeActionContext, range: Range, textDocument: TextDocumentIdentifier): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionParams]
  }
  
  extension [Self <: CodeActionParams](x: Self) {
    
    inline def setContext(value: CodeActionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLensParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The document to request code lens for.
    */
  var textDocument: TextDocumentIdentifier
}
object CodeLensParams {
  
  inline def apply(textDocument: TextDocumentIdentifier): CodeLensParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeLensParams] (val x: Self) extends AnyVal {
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

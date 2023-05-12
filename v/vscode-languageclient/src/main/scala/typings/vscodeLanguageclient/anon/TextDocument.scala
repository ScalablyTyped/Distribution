package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocument extends StObject {
  
  var textDocument: TextDocumentIdentifier
}
object TextDocument {
  
  inline def apply(textDocument: TextDocumentIdentifier): TextDocument = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocument] (val x: Self) extends AnyVal {
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}

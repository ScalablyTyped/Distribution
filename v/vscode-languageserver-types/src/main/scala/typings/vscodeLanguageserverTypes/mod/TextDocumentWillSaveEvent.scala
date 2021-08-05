package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentWillSaveEvent extends StObject {
  
  /**
    * The document that will be saved
    */
  var document: TextDocument
  
  /**
    * The reason why save was triggered.
    */
  var reason: `1` | `2` | `3`
}
object TextDocumentWillSaveEvent {
  
  inline def apply(document: TextDocument, reason: `1` | `2` | `3`): TextDocumentWillSaveEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent]
  }
  
  extension [Self <: TextDocumentWillSaveEvent](x: Self) {
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setReason(value: `1` | `2` | `3`): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}

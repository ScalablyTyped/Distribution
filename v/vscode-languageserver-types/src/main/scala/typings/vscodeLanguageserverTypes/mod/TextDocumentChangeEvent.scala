package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentChangeEvent extends StObject {
  
  /**
    * The document that has changed.
    */
  var document: TextDocument
}
object TextDocumentChangeEvent {
  
  inline def apply(document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
  
  extension [Self <: TextDocumentChangeEvent](x: Self) {
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

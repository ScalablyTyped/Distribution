package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentChangeEvent[T] extends StObject {
  
  /**
    * The document that has changed.
    */
  var document: T
}
object TextDocumentChangeEvent {
  
  inline def apply[T](document: T): TextDocumentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent[T]]
  }
  
  extension [Self <: TextDocumentChangeEvent[?], T](x: Self & TextDocumentChangeEvent[T]) {
    
    inline def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

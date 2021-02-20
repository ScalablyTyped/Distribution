package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentChangeEvent[T] extends StObject {
  
  /**
    * The document that has changed.
    */
  var document: T = js.native
}
object TextDocumentChangeEvent {
  
  @scala.inline
  def apply[T](document: T): TextDocumentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent[T]]
  }
  
  @scala.inline
  implicit class TextDocumentChangeEventMutableBuilder[Self <: TextDocumentChangeEvent[_], T] (val x: Self with TextDocumentChangeEvent[T]) extends AnyVal {
    
    @scala.inline
    def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

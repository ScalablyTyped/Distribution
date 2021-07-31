package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentChangeEvent extends StObject {
  
  /**
    * An array of content changes.
    */
  val contentChanges: js.Array[TextDocumentContentChangeEvent]
  
  /**
    * The affected document.
    */
  val document: TextDocument
}
object TextDocumentChangeEvent {
  
  @scala.inline
  def apply(contentChanges: js.Array[TextDocumentContentChangeEvent], document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
  
  @scala.inline
  implicit class TextDocumentChangeEventMutableBuilder[Self <: TextDocumentChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentChanges(value: js.Array[TextDocumentContentChangeEvent]): Self = StObject.set(x, "contentChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentChangesVarargs(value: TextDocumentContentChangeEvent*): Self = StObject.set(x, "contentChanges", js.Array(value :_*))
    
    @scala.inline
    def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}

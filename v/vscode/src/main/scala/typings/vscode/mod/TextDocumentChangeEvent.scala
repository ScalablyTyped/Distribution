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
  
  /**
    * The reason why the document was changed.
    * Is `undefined` if the reason is not known.
    */
  val reason: js.UndefOr[TextDocumentChangeReason] = js.undefined
}
object TextDocumentChangeEvent {
  
  inline def apply(contentChanges: js.Array[TextDocumentContentChangeEvent], document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDocumentChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setContentChanges(value: js.Array[TextDocumentContentChangeEvent]): Self = StObject.set(x, "contentChanges", value.asInstanceOf[js.Any])
    
    inline def setContentChangesVarargs(value: TextDocumentContentChangeEvent*): Self = StObject.set(x, "contentChanges", js.Array(value*))
    
    inline def setDocument(value: TextDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setReason(value: TextDocumentChangeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}

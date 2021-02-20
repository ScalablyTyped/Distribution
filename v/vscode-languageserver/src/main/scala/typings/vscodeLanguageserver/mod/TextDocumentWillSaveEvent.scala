package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentWillSaveEvent[T] extends StObject {
  
  /**
    * The document that will be saved
    */
  var document: T = js.native
  
  /**
    * The reason why save was triggered.
    */
  var reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason = js.native
}
object TextDocumentWillSaveEvent {
  
  @scala.inline
  def apply[T](document: T, reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason): TextDocumentWillSaveEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent[T]]
  }
  
  @scala.inline
  implicit class TextDocumentWillSaveEventMutableBuilder[Self <: TextDocumentWillSaveEvent[_], T] (val x: Self with TextDocumentWillSaveEvent[T]) extends AnyVal {
    
    @scala.inline
    def setDocument(value: T): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}

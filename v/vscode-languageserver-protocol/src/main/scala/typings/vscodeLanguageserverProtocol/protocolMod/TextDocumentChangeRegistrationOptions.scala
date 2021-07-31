package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentChangeRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions {
  
  /**
    * How documents are synced to the server.
    */
  var syncKind: TextDocumentSyncKind
}
object TextDocumentChangeRegistrationOptions {
  
  @scala.inline
  def apply(syncKind: TextDocumentSyncKind): TextDocumentChangeRegistrationOptions = {
    val __obj = js.Dynamic.literal(syncKind = syncKind.asInstanceOf[js.Any], documentSelector = null)
    __obj.asInstanceOf[TextDocumentChangeRegistrationOptions]
  }
  
  @scala.inline
  implicit class TextDocumentChangeRegistrationOptionsMutableBuilder[Self <: TextDocumentChangeRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyncKind(value: TextDocumentSyncKind): Self = StObject.set(x, "syncKind", value.asInstanceOf[js.Any])
  }
}

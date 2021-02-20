package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentChangeRegistrationOptions extends TextDocumentRegistrationOptions {
  
  /**
    * How documents are synced to the server.
    */
  var syncKind: TextDocumentSyncKind = js.native
}
object TextDocumentChangeRegistrationOptions {
  
  @scala.inline
  def apply(syncKind: TextDocumentSyncKind): TextDocumentChangeRegistrationOptions = {
    val __obj = js.Dynamic.literal(syncKind = syncKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeRegistrationOptions]
  }
  
  @scala.inline
  implicit class TextDocumentChangeRegistrationOptionsMutableBuilder[Self <: TextDocumentChangeRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyncKind(value: TextDocumentSyncKind): Self = StObject.set(x, "syncKind", value.asInstanceOf[js.Any])
  }
}

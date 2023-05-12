package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscodeLanguageclient.anon.TextDocument
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSendEvent[P /* <: TextDocument */] extends StObject {
  
  var params: P
  
  var textDocument: typings.vscode.mod.TextDocument
  
  var `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions]
}
object NotificationSendEvent {
  
  inline def apply[P /* <: TextDocument */](
    params: P,
    textDocument: typings.vscode.mod.TextDocument,
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions]
  ): NotificationSendEvent[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSendEvent[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationSendEvent[?], P /* <: TextDocument */] (val x: Self & NotificationSendEvent[P]) extends AnyVal {
    
    inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: typings.vscode.mod.TextDocument): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProtocolNotificationType[P, TextDocumentRegistrationOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

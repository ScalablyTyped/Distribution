package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSendEvent[E, P] extends StObject {
  
  var original: E
  
  var params: P
  
  var `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions]
}
object NotificationSendEvent {
  
  inline def apply[E, P](original: E, params: P, `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions]): NotificationSendEvent[E, P] = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSendEvent[E, P]]
  }
  
  extension [Self <: NotificationSendEvent[?, ?], E, P](x: Self & (NotificationSendEvent[E, P])) {
    
    inline def setOriginal(value: E): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setType(value: ProtocolNotificationType[P, TextDocumentRegistrationOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

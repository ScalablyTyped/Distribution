package typings.twilsock.mod.Messages

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init
  extends StObject
     with AbstractMessage {
  
  val capabilities: js.Array[String]
  
  val continuation_token: String | Null
  
  val metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  val method: MessageType
  
  val registrations: js.UndefOr[js.Array[InitRegistration] | Null] = js.undefined
  
  val token: String
  
  val tweaks: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
}
object Init {
  
  inline def apply(capabilities: js.Array[String], id: String, method: MessageType, token: String): Init = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], continuation_token = null)
    __obj.asInstanceOf[Init]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Init] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setContinuation_token(value: String): Self = StObject.set(x, "continuation_token", value.asInstanceOf[js.Any])
    
    inline def setContinuation_tokenNull: Self = StObject.set(x, "continuation_token", null)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRegistrations(value: js.Array[InitRegistration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsNull: Self = StObject.set(x, "registrations", null)
    
    inline def setRegistrationsUndefined: Self = StObject.set(x, "registrations", js.undefined)
    
    inline def setRegistrationsVarargs(value: InitRegistration*): Self = StObject.set(x, "registrations", js.Array(value*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTweaks(value: Record[String, Any]): Self = StObject.set(x, "tweaks", value.asInstanceOf[js.Any])
    
    inline def setTweaksNull: Self = StObject.set(x, "tweaks", null)
    
    inline def setTweaksUndefined: Self = StObject.set(x, "tweaks", js.undefined)
  }
}

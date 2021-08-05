package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareNotificationContext extends StObject {
  
  /**
    * Optional user note or message.
    */
  var message: String
  
  /**
    * Identities of users who will receive a share notification.
    */
  var receivers: js.Array[IdentityRef]
}
object ShareNotificationContext {
  
  inline def apply(message: String, receivers: js.Array[IdentityRef]): ShareNotificationContext = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], receivers = receivers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareNotificationContext]
  }
  
  extension [Self <: ShareNotificationContext](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReceivers(value: js.Array[IdentityRef]): Self = StObject.set(x, "receivers", value.asInstanceOf[js.Any])
    
    inline def setReceiversVarargs(value: IdentityRef*): Self = StObject.set(x, "receivers", js.Array(value :_*))
  }
}

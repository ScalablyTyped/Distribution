package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHooksSubscriptionChannel extends StObject {
  
  var `type`: String
}
object ServiceHooksSubscriptionChannel {
  
  inline def apply(`type`: String): ServiceHooksSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHooksSubscriptionChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceHooksSubscriptionChannel] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

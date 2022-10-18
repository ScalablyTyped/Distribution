package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceBusSubscriptionChannel extends StObject {
  
  var `type`: String
}
object ServiceBusSubscriptionChannel {
  
  inline def apply(`type`: String): ServiceBusSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBusSubscriptionChannel]
  }
  
  extension [Self <: ServiceBusSubscriptionChannel](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

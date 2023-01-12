package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscriptionFilter extends StObject {
  
  var eventType: String
  
  var `type`: String
}
object ISubscriptionFilter {
  
  inline def apply(eventType: String, `type`: String): ISubscriptionFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISubscriptionFilter] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

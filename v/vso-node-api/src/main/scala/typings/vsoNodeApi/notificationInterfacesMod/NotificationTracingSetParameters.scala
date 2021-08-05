package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTracingSetParameters extends StObject {
  
  var enabled: Boolean
}
object NotificationTracingSetParameters {
  
  inline def apply(enabled: Boolean): NotificationTracingSetParameters = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracingSetParameters]
  }
  
  extension [Self <: NotificationTracingSetParameters](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

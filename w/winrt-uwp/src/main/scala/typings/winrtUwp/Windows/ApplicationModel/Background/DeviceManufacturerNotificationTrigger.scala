package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
trait DeviceManufacturerNotificationTrigger extends StObject {
  
  /** Gets whether the trigger is used only once. */
  var oneShot: Boolean
  
  /** Gets an app-defined string that qualifies the trigger. */
  var triggerQualifier: String
}
object DeviceManufacturerNotificationTrigger {
  
  inline def apply(oneShot: Boolean, triggerQualifier: String): DeviceManufacturerNotificationTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerQualifier = triggerQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManufacturerNotificationTrigger]
  }
  
  extension [Self <: DeviceManufacturerNotificationTrigger](x: Self) {
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    inline def setTriggerQualifier(value: String): Self = StObject.set(x, "triggerQualifier", value.asInstanceOf[js.Any])
  }
}

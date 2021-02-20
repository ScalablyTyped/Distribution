package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
@js.native
trait DeviceManufacturerNotificationTrigger extends StObject {
  
  /** Gets whether the trigger is used only once. */
  var oneShot: Boolean = js.native
  
  /** Gets an app-defined string that qualifies the trigger. */
  var triggerQualifier: String = js.native
}
object DeviceManufacturerNotificationTrigger {
  
  @scala.inline
  def apply(oneShot: Boolean, triggerQualifier: String): DeviceManufacturerNotificationTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerQualifier = triggerQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManufacturerNotificationTrigger]
  }
  
  @scala.inline
  implicit class DeviceManufacturerNotificationTriggerMutableBuilder[Self <: DeviceManufacturerNotificationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerQualifier(value: String): Self = StObject.set(x, "triggerQualifier", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
@js.native
trait DeviceManufacturerNotificationTrigger extends js.Object {
  
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
  implicit class DeviceManufacturerNotificationTriggerOps[Self <: DeviceManufacturerNotificationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOneShot(value: Boolean): Self = this.set("oneShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerQualifier(value: String): Self = this.set("triggerQualifier", value.asInstanceOf[js.Any])
  }
}

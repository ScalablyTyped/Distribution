package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a location event that triggers a background task. This is used for Geofencing. */
@js.native
trait LocationTrigger extends js.Object {
  
  /** The type of location event for this trigger. */
  var triggerType: LocationTriggerType = js.native
}
object LocationTrigger {
  
  @scala.inline
  def apply(triggerType: LocationTriggerType): LocationTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTrigger]
  }
  
  @scala.inline
  implicit class LocationTriggerOps[Self <: LocationTrigger] (val x: Self) extends AnyVal {
    
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
    def setTriggerType(value: LocationTriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
}

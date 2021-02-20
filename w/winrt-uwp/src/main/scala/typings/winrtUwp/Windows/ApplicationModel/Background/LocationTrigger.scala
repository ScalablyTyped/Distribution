package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a location event that triggers a background task. This is used for Geofencing. */
@js.native
trait LocationTrigger extends StObject {
  
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
  implicit class LocationTriggerMutableBuilder[Self <: LocationTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerType(value: LocationTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledReleaseTrigger
  extends StObject
     with ReleaseTriggerBase {
  
  /**
    * Release schedule for Scheduled Release trigger type
    */
  var schedule: ReleaseSchedule
}
object ScheduledReleaseTrigger {
  
  inline def apply(schedule: ReleaseSchedule, triggerType: ReleaseTriggerType): ScheduledReleaseTrigger = {
    val __obj = js.Dynamic.literal(schedule = schedule.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledReleaseTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledReleaseTrigger] (val x: Self) extends AnyVal {
    
    inline def setSchedule(value: ReleaseSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}

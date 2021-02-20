package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledReleaseTrigger extends ReleaseTriggerBase {
  
  /**
    * Release schedule for Scheduled Release trigger type
    */
  var schedule: ReleaseSchedule = js.native
}
object ScheduledReleaseTrigger {
  
  @scala.inline
  def apply(schedule: ReleaseSchedule, triggerType: ReleaseTriggerType): ScheduledReleaseTrigger = {
    val __obj = js.Dynamic.literal(schedule = schedule.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledReleaseTrigger]
  }
  
  @scala.inline
  implicit class ScheduledReleaseTriggerMutableBuilder[Self <: ScheduledReleaseTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchedule(value: ReleaseSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}

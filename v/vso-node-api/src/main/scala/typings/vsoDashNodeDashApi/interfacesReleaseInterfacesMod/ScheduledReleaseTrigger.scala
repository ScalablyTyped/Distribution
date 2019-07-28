package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledReleaseTrigger extends ReleaseTriggerBase {
  /**
    * Release schedule for Scheduled Release trigger type
    */
  var schedule: ReleaseSchedule
}

object ScheduledReleaseTrigger {
  @scala.inline
  def apply(schedule: ReleaseSchedule, triggerType: ReleaseTriggerType): ScheduledReleaseTrigger = {
    val __obj = js.Dynamic.literal(schedule = schedule, triggerType = triggerType)
  
    __obj.asInstanceOf[ScheduledReleaseTrigger]
  }
}


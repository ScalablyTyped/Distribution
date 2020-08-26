package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ScheduledReleaseTriggerOps[Self <: ScheduledReleaseTrigger] (val x: Self) extends AnyVal {
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
    def setSchedule(value: ReleaseSchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
  }
  
}


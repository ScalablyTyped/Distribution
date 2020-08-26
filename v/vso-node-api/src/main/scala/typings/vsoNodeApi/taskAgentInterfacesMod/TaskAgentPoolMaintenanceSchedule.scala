package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceSchedule extends js.Object {
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: TaskAgentPoolMaintenanceScheduleDays = js.native
  /**
    * The Job Id of the Scheduled job that will queue the pool maintenance job.
    */
  var scheduleJobId: String = js.native
  /**
    * Local timezone hour to start
    */
  var startHours: Double = js.native
  /**
    * Local timezone minute to start
    */
  var startMinutes: Double = js.native
  /**
    * Time zone of the build schedule (string representation of the time zone id)
    */
  var timeZoneId: String = js.native
}

object TaskAgentPoolMaintenanceSchedule {
  @scala.inline
  def apply(
    daysToBuild: TaskAgentPoolMaintenanceScheduleDays,
    scheduleJobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): TaskAgentPoolMaintenanceSchedule = {
    val __obj = js.Dynamic.literal(daysToBuild = daysToBuild.asInstanceOf[js.Any], scheduleJobId = scheduleJobId.asInstanceOf[js.Any], startHours = startHours.asInstanceOf[js.Any], startMinutes = startMinutes.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceSchedule]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceScheduleOps[Self <: TaskAgentPoolMaintenanceSchedule] (val x: Self) extends AnyVal {
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
    def setDaysToBuild(value: TaskAgentPoolMaintenanceScheduleDays): Self = this.set("daysToBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleJobId(value: String): Self = this.set("scheduleJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartHours(value: Double): Self = this.set("startHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMinutes(value: Double): Self = this.set("startMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeZoneId(value: String): Self = this.set("timeZoneId", value.asInstanceOf[js.Any])
  }
  
}


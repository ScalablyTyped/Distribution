package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceSchedule extends js.Object {
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: TaskAgentPoolMaintenanceScheduleDays
  /**
    * The Job Id of the Scheduled job that will queue the pool maintenance job.
    */
  var scheduleJobId: String
  /**
    * Local timezone hour to start
    */
  var startHours: Double
  /**
    * Local timezone minute to start
    */
  var startMinutes: Double
  /**
    * Time zone of the build schedule (string representation of the time zone id)
    */
  var timeZoneId: String
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
}


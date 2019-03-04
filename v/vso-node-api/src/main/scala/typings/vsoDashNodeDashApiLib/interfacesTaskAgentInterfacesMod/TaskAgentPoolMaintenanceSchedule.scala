package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

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
  var scheduleJobId: java.lang.String
  /**
    * Local timezone hour to start
    */
  var startHours: scala.Double
  /**
    * Local timezone minute to start
    */
  var startMinutes: scala.Double
  /**
    * Time zone of the build schedule (string representation of the time zone id)
    */
  var timeZoneId: java.lang.String
}

object TaskAgentPoolMaintenanceSchedule {
  @scala.inline
  def apply(
    daysToBuild: TaskAgentPoolMaintenanceScheduleDays,
    scheduleJobId: java.lang.String,
    startHours: scala.Double,
    startMinutes: scala.Double,
    timeZoneId: java.lang.String
  ): TaskAgentPoolMaintenanceSchedule = {
    val __obj = js.Dynamic.literal(daysToBuild = daysToBuild, scheduleJobId = scheduleJobId, startHours = startHours, startMinutes = startMinutes, timeZoneId = timeZoneId)
  
    __obj.asInstanceOf[TaskAgentPoolMaintenanceSchedule]
  }
}


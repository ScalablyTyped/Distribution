package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  var branchFilters: js.Array[java.lang.String]
  /**
    * Days for a build (flags enum for days of the week)
    */
  var daysToBuild: ScheduleDays
  /**
    * The Job Id of the Scheduled job that will queue the scheduled build. Since a single trigger can have multiple schedules and we want a single job to process a single schedule (since each schedule has a list of branches to build), the schedule itself needs to define the Job Id. This value will be filled in when a definition is added or updated.  The UI does not provide it or use it.
    */
  var scheduleJobId: java.lang.String
  /**
    * Flag to determine if this schedule should only build if the associated source has been changed.
    */
  var scheduleOnlyWithChanges: scala.Boolean
  /**
    * Local timezone hour to start
    */
  var startHours: scala.Double
  /**
    * Local timezone minute to start
    */
  var startMinutes: scala.Double
  /**
    * Time zone of the build schedule (String representation of the time zone ID)
    */
  var timeZoneId: java.lang.String
}

object Schedule {
  @scala.inline
  def apply(
    branchFilters: js.Array[java.lang.String],
    daysToBuild: ScheduleDays,
    scheduleJobId: java.lang.String,
    scheduleOnlyWithChanges: scala.Boolean,
    startHours: scala.Double,
    startMinutes: scala.Double,
    timeZoneId: java.lang.String
  ): Schedule = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters, daysToBuild = daysToBuild, scheduleJobId = scheduleJobId, scheduleOnlyWithChanges = scheduleOnlyWithChanges, startHours = startHours, startMinutes = startMinutes, timeZoneId = timeZoneId)
  
    __obj.asInstanceOf[Schedule]
  }
}


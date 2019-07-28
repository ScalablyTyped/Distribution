package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseSchedule extends js.Object {
  /**
    * Days of the week to release
    */
  var daysToRelease: ScheduleDays
  /**
    * Team Foundation Job Definition Job Id
    */
  var jobId: String
  /**
    * Local time zone hour to start
    */
  var startHours: Double
  /**
    * Local time zone minute to start
    */
  var startMinutes: Double
  /**
    * Time zone Id of release schedule, such as 'UTC'
    */
  var timeZoneId: String
}

object ReleaseSchedule {
  @scala.inline
  def apply(
    daysToRelease: ScheduleDays,
    jobId: String,
    startHours: Double,
    startMinutes: Double,
    timeZoneId: String
  ): ReleaseSchedule = {
    val __obj = js.Dynamic.literal(daysToRelease = daysToRelease, jobId = jobId, startHours = startHours, startMinutes = startMinutes, timeZoneId = timeZoneId)
  
    __obj.asInstanceOf[ReleaseSchedule]
  }
}


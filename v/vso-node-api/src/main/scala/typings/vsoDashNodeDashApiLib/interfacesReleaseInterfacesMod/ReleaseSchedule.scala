package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  var jobId: java.lang.String
  /**
    * Local time zone hour to start
    */
  var startHours: scala.Double
  /**
    * Local time zone minute to start
    */
  var startMinutes: scala.Double
  /**
    * Time zone Id of release schedule, such as 'UTC'
    */
  var timeZoneId: java.lang.String
}

object ReleaseSchedule {
  @scala.inline
  def apply(
    daysToRelease: ScheduleDays,
    jobId: java.lang.String,
    startHours: scala.Double,
    startMinutes: scala.Double,
    timeZoneId: java.lang.String
  ): ReleaseSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("daysToRelease")(daysToRelease)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("startHours")(startHours)
    __obj.updateDynamic("startMinutes")(startMinutes)
    __obj.updateDynamic("timeZoneId")(timeZoneId)
    __obj.asInstanceOf[ReleaseSchedule]
  }
}


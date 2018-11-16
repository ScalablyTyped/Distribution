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


package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTracing extends NotificationTracingSetParameters {
  /**
    * Trace until the specified end date.
    */
  var endDate: stdLib.Date
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: scala.Double
  /**
    * The date and time tracing started.
    */
  var startDate: stdLib.Date
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: scala.Double
}

object NotificationTracing {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    endDate: stdLib.Date,
    maxTracedEntries: scala.Double,
    startDate: stdLib.Date,
    tracedEntries: scala.Double
  ): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled, endDate = endDate, maxTracedEntries = maxTracedEntries, startDate = startDate, tracedEntries = tracedEntries)
  
    __obj.asInstanceOf[NotificationTracing]
  }
}


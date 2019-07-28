package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTracing extends NotificationTracingSetParameters {
  /**
    * Trace until the specified end date.
    */
  var endDate: Date
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double
  /**
    * The date and time tracing started.
    */
  var startDate: Date
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double
}

object NotificationTracing {
  @scala.inline
  def apply(enabled: Boolean, endDate: Date, maxTracedEntries: Double, startDate: Date, tracedEntries: Double): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled, endDate = endDate, maxTracedEntries = maxTracedEntries, startDate = startDate, tracedEntries = tracedEntries)
  
    __obj.asInstanceOf[NotificationTracing]
  }
}


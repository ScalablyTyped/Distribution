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


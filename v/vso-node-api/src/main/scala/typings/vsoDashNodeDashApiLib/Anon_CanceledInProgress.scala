package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledInProgress extends js.Object {
  var canceled: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var partiallySucceeded: scala.Double
  var queued: scala.Double
  var rejected: scala.Double
  var scheduled: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object Anon_CanceledInProgress {
  @scala.inline
  def apply(
    canceled: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): Anon_CanceledInProgress = {
    val __obj = js.Dynamic.literal(canceled = canceled, inProgress = inProgress, notStarted = notStarted, partiallySucceeded = partiallySucceeded, queued = queued, rejected = rejected, scheduled = scheduled, succeeded = succeeded, undefined = undefined)
  
    __obj.asInstanceOf[Anon_CanceledInProgress]
  }
}


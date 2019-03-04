package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailedInProgress extends js.Object {
  var cancelled: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
}

object Anon_CancelledFailedInProgress {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double
  ): Anon_CancelledFailedInProgress = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, failed = failed, inProgress = inProgress, notSet = notSet, queued = queued, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_CancelledFailedInProgress]
  }
}


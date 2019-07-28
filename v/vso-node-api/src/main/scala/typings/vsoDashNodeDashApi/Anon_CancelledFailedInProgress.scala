package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailedInProgress extends js.Object {
  var cancelled: Double
  var failed: Double
  var inProgress: Double
  var notSet: Double
  var queued: Double
  var succeeded: Double
}

object Anon_CancelledFailedInProgress {
  @scala.inline
  def apply(
    cancelled: Double,
    failed: Double,
    inProgress: Double,
    notSet: Double,
    queued: Double,
    succeeded: Double
  ): Anon_CancelledFailedInProgress = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, failed = failed, inProgress = inProgress, notSet = notSet, queued = queued, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_CancelledFailedInProgress]
  }
}


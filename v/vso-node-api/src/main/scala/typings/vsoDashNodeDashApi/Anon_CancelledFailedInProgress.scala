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
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelledFailedInProgress]
  }
}


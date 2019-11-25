package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailed extends js.Object {
  var cancelled: Double
  var failed: Double
  var inProgress: Double
  var notFound: Double
  var notSet: Double
  var queued: Double
  var succeeded: Double
  var timedOut: Double
}

object Anon_CancelledFailed {
  @scala.inline
  def apply(
    cancelled: Double,
    failed: Double,
    inProgress: Double,
    notFound: Double,
    notSet: Double,
    queued: Double,
    succeeded: Double,
    timedOut: Double
  ): Anon_CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelledFailed]
  }
}


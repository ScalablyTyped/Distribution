package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelledFailed extends js.Object {
  var cancelled: Double
  var failed: Double
  var inProgress: Double
  var notFound: Double
  var notSet: Double
  var queued: Double
  var succeeded: Double
  var timedOut: Double
}

object AnonCancelledFailed {
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
  ): AnonCancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelledFailed]
  }
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelledFailed extends js.Object {
  var cancelled: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
}

object CancelledFailed {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double
  ): CancelledFailed = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelledFailed]
  }
}


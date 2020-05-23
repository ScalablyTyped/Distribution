package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartiallySucceeded extends js.Object {
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

object PartiallySucceeded {
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
  ): PartiallySucceeded = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallySucceeded]
  }
}


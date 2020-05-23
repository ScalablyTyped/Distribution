package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFound extends js.Object {
  var cancelled: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notFound: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
  var timedOut: scala.Double
}

object NotFound {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notFound: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double,
    timedOut: scala.Double
  ): NotFound = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFound]
  }
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedInProgress extends js.Object {
  var failed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
}

object FailedInProgress {
  @scala.inline
  def apply(failed: scala.Double, inProgress: scala.Double, queued: scala.Double, succeeded: scala.Double): FailedInProgress = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedInProgress]
  }
}


package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailedInProgressQueued extends js.Object {
  var failed: Double
  var inProgress: Double
  var queued: Double
  var succeeded: Double
}

object AnonFailedInProgressQueued {
  @scala.inline
  def apply(failed: Double, inProgress: Double, queued: Double, succeeded: Double): AnonFailedInProgressQueued = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFailedInProgressQueued]
  }
}


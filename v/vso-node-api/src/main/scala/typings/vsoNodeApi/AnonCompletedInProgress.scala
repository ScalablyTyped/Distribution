package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompletedInProgress extends js.Object {
  var completed: Double
  var inProgress: Double
  var queued: Double
}

object AnonCompletedInProgress {
  @scala.inline
  def apply(completed: Double, inProgress: Double, queued: Double): AnonCompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompletedInProgress]
  }
}


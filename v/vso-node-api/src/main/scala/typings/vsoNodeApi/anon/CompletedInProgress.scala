package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedInProgress extends js.Object {
  var completed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
}

object CompletedInProgress {
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedInProgress]
  }
}


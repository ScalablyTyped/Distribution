package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedInProgress extends js.Object {
  var completed: Double
  var inProgress: Double
  var queued: Double
}

object Anon_CompletedInProgress {
  @scala.inline
  def apply(completed: Double, inProgress: Double, queued: Double): Anon_CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed, inProgress = inProgress, queued = queued)
  
    __obj.asInstanceOf[Anon_CompletedInProgress]
  }
}


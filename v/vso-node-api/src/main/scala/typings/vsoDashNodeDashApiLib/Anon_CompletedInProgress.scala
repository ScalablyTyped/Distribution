package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletedInProgress extends js.Object {
  var completed: scala.Double
  var inProgress: scala.Double
  var queued: scala.Double
}

object Anon_CompletedInProgress {
  @scala.inline
  def apply(completed: scala.Double, inProgress: scala.Double, queued: scala.Double): Anon_CompletedInProgress = {
    val __obj = js.Dynamic.literal(completed = completed, inProgress = inProgress, queued = queued)
  
    __obj.asInstanceOf[Anon_CompletedInProgress]
  }
}


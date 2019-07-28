package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedInProgressQueued extends js.Object {
  var failed: Double
  var inProgress: Double
  var queued: Double
  var succeeded: Double
}

object Anon_FailedInProgressQueued {
  @scala.inline
  def apply(failed: Double, inProgress: Double, queued: Double, succeeded: Double): Anon_FailedInProgressQueued = {
    val __obj = js.Dynamic.literal(failed = failed, inProgress = inProgress, queued = queued, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_FailedInProgressQueued]
  }
}


package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedInProgress extends js.Object {
  var failed: Double
  var inProgress: Double
  var none: Double
  var pending: Double
  var succeeded: Double
}

object Anon_FailedInProgress {
  @scala.inline
  def apply(failed: Double, inProgress: Double, none: Double, pending: Double, succeeded: Double): Anon_FailedInProgress = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FailedInProgress]
  }
}


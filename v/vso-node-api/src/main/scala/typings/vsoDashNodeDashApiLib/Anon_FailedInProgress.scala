package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailedInProgress extends js.Object {
  var failed: scala.Double
  var inProgress: scala.Double
  var none: scala.Double
  var pending: scala.Double
  var succeeded: scala.Double
}

object Anon_FailedInProgress {
  @scala.inline
  def apply(
    failed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): Anon_FailedInProgress = {
    val __obj = js.Dynamic.literal(failed = failed, inProgress = inProgress, none = none, pending = pending, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_FailedInProgress]
  }
}


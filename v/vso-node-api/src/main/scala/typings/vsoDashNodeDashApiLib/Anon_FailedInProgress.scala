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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_FailedInProgress]
  }
}


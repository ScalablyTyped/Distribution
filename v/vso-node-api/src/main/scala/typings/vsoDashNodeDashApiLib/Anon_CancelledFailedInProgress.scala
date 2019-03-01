package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelledFailedInProgress extends js.Object {
  var cancelled: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var succeeded: scala.Double
}

object Anon_CancelledFailedInProgress {
  @scala.inline
  def apply(
    cancelled: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    succeeded: scala.Double
  ): Anon_CancelledFailedInProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelled")(cancelled)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("notSet")(notSet)
    __obj.updateDynamic("queued")(queued)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[Anon_CancelledFailedInProgress]
  }
}


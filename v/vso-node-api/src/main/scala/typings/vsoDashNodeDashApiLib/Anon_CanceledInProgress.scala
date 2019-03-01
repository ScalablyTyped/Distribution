package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledInProgress extends js.Object {
  var canceled: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var partiallySucceeded: scala.Double
  var queued: scala.Double
  var rejected: scala.Double
  var scheduled: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object Anon_CanceledInProgress {
  @scala.inline
  def apply(
    canceled: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    scheduled: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): Anon_CanceledInProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("notStarted")(notStarted)
    __obj.updateDynamic("partiallySucceeded")(partiallySucceeded)
    __obj.updateDynamic("queued")(queued)
    __obj.updateDynamic("rejected")(rejected)
    __obj.updateDynamic("scheduled")(scheduled)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_CanceledInProgress]
  }
}


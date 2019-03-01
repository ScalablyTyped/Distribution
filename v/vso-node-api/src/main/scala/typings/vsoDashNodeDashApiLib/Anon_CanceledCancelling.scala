package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledCancelling extends js.Object {
  var canceled: scala.Double
  var cancelling: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notStarted: scala.Double
  var partiallySucceeded: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object Anon_CanceledCancelling {
  @scala.inline
  def apply(
    canceled: scala.Double,
    cancelling: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notStarted: scala.Double,
    partiallySucceeded: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): Anon_CanceledCancelling = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("cancelling")(cancelling)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("notStarted")(notStarted)
    __obj.updateDynamic("partiallySucceeded")(partiallySucceeded)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_CanceledCancelling]
  }
}


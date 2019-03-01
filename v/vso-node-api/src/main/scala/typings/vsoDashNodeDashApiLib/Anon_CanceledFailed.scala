package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFailed extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var failure: scala.Double
  var inProgress: scala.Double
  var partiallySucceeded: scala.Double
  var pending: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var success: scala.Double
  var unknown: scala.Double
}

object Anon_CanceledFailed {
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    failure: scala.Double,
    inProgress: scala.Double,
    partiallySucceeded: scala.Double,
    pending: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    success: scala.Double,
    unknown: scala.Double
  ): Anon_CanceledFailed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("partiallySucceeded")(partiallySucceeded)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_CanceledFailed]
  }
}


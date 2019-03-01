package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aborted extends js.Object {
  var aborted: scala.Double
  var blocked: scala.Double
  var error: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var inconclusive: scala.Double
  var maxValue: scala.Double
  var none: scala.Double
  var notApplicable: scala.Double
  var notExecuted: scala.Double
  var notImpacted: scala.Double
  var passed: scala.Double
  var paused: scala.Double
  var timeout: scala.Double
  var unspecified: scala.Double
  var warning: scala.Double
}

object Anon_Aborted {
  @scala.inline
  def apply(
    aborted: scala.Double,
    blocked: scala.Double,
    error: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    inconclusive: scala.Double,
    maxValue: scala.Double,
    none: scala.Double,
    notApplicable: scala.Double,
    notExecuted: scala.Double,
    notImpacted: scala.Double,
    passed: scala.Double,
    paused: scala.Double,
    timeout: scala.Double,
    unspecified: scala.Double,
    warning: scala.Double
  ): Anon_Aborted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aborted")(aborted)
    __obj.updateDynamic("blocked")(blocked)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("inProgress")(inProgress)
    __obj.updateDynamic("inconclusive")(inconclusive)
    __obj.updateDynamic("maxValue")(maxValue)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("notApplicable")(notApplicable)
    __obj.updateDynamic("notExecuted")(notExecuted)
    __obj.updateDynamic("notImpacted")(notImpacted)
    __obj.updateDynamic("passed")(passed)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("unspecified")(unspecified)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Aborted]
  }
}


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
    val __obj = js.Dynamic.literal(aborted = aborted, blocked = blocked, error = error, failed = failed, inProgress = inProgress, inconclusive = inconclusive, maxValue = maxValue, none = none, notApplicable = notApplicable, notExecuted = notExecuted, notImpacted = notImpacted, passed = passed, paused = paused, timeout = timeout, unspecified = unspecified, warning = warning)
  
    __obj.asInstanceOf[Anon_Aborted]
  }
}


package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aborted extends js.Object {
  var aborted: Double
  var blocked: Double
  var error: Double
  var failed: Double
  var inProgress: Double
  var inconclusive: Double
  var maxValue: Double
  var none: Double
  var notApplicable: Double
  var notExecuted: Double
  var notImpacted: Double
  var passed: Double
  var paused: Double
  var timeout: Double
  var unspecified: Double
  var warning: Double
}

object Anon_Aborted {
  @scala.inline
  def apply(
    aborted: Double,
    blocked: Double,
    error: Double,
    failed: Double,
    inProgress: Double,
    inconclusive: Double,
    maxValue: Double,
    none: Double,
    notApplicable: Double,
    notExecuted: Double,
    notImpacted: Double,
    passed: Double,
    paused: Double,
    timeout: Double,
    unspecified: Double,
    warning: Double
  ): Anon_Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], inconclusive = inconclusive.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notExecuted = notExecuted.asInstanceOf[js.Any], notImpacted = notImpacted.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Aborted]
  }
}


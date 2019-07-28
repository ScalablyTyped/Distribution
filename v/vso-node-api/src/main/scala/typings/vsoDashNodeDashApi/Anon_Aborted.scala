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
    val __obj = js.Dynamic.literal(aborted = aborted, blocked = blocked, error = error, failed = failed, inProgress = inProgress, inconclusive = inconclusive, maxValue = maxValue, none = none, notApplicable = notApplicable, notExecuted = notExecuted, notImpacted = notImpacted, passed = passed, paused = paused, timeout = timeout, unspecified = unspecified, warning = warning)
  
    __obj.asInstanceOf[Anon_Aborted]
  }
}


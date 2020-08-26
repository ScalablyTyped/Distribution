package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aborted extends js.Object {
  var aborted: scala.Double = js.native
  var blocked: scala.Double = js.native
  var error: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var inconclusive: scala.Double = js.native
  var maxValue: scala.Double = js.native
  var none: scala.Double = js.native
  var notApplicable: scala.Double = js.native
  var notExecuted: scala.Double = js.native
  var notImpacted: scala.Double = js.native
  var passed: scala.Double = js.native
  var paused: scala.Double = js.native
  var timeout: scala.Double = js.native
  var unspecified: scala.Double = js.native
  var warning: scala.Double = js.native
}

object Aborted {
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
  ): Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], inconclusive = inconclusive.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notExecuted = notExecuted.asInstanceOf[js.Any], notImpacted = notImpacted.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted]
  }
  @scala.inline
  implicit class AbortedOps[Self <: Aborted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAborted(value: scala.Double): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocked(value: scala.Double): Self = this.set("blocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: scala.Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setInconclusive(value: scala.Double): Self = this.set("inconclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: scala.Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = this.set("notApplicable", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotExecuted(value: scala.Double): Self = this.set("notExecuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotImpacted(value: scala.Double): Self = this.set("notImpacted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: scala.Double): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: scala.Double): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: scala.Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnspecified(value: scala.Double): Self = this.set("unspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: scala.Double): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeedsInvestigation extends js.Object {
  var aborted: scala.Double = js.native
  var completed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var needsInvestigation: scala.Double = js.native
  var notStarted: scala.Double = js.native
  var unspecified: scala.Double = js.native
  var waiting: scala.Double = js.native
}

object NeedsInvestigation {
  @scala.inline
  def apply(
    aborted: scala.Double,
    completed: scala.Double,
    inProgress: scala.Double,
    needsInvestigation: scala.Double,
    notStarted: scala.Double,
    unspecified: scala.Double,
    waiting: scala.Double
  ): NeedsInvestigation = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], needsInvestigation = needsInvestigation.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], unspecified = unspecified.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsInvestigation]
  }
  @scala.inline
  implicit class NeedsInvestigationOps[Self <: NeedsInvestigation] (val x: Self) extends AnyVal {
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
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedsInvestigation(value: scala.Double): Self = this.set("needsInvestigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotStarted(value: scala.Double): Self = this.set("notStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnspecified(value: scala.Double): Self = this.set("unspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaiting(value: scala.Double): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
  
}


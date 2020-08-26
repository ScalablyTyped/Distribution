package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotStarted extends js.Object {
  var canceled: scala.Double = js.native
  var cancelling: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var notStarted: scala.Double = js.native
  var partiallySucceeded: scala.Double = js.native
  var skipped: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var undefined: scala.Double = js.native
}

object NotStarted {
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
  ): NotStarted = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], cancelling = cancelling.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notStarted = notStarted.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStarted]
  }
  @scala.inline
  implicit class NotStartedOps[Self <: NotStarted] (val x: Self) extends AnyVal {
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
    def setCanceled(value: scala.Double): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelling(value: scala.Double): Self = this.set("cancelling", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotStarted(value: scala.Double): Self = this.set("notStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartiallySucceeded(value: scala.Double): Self = this.set("partiallySucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: scala.Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
  
}


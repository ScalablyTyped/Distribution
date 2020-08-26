package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure extends js.Object {
  var canceled: scala.Double = js.native
  var failed: scala.Double = js.native
  var failure: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var partiallySucceeded: scala.Double = js.native
  var pending: scala.Double = js.native
  var skipped: scala.Double = js.native
  var succeeded: scala.Double = js.native
  var success: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object Failure {
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
  ): Failure = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
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
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure(value: scala.Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartiallySucceeded(value: scala.Double): Self = this.set("partiallySucceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: scala.Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: scala.Double): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
  
}


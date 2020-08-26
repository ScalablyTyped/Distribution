package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Succeeded extends js.Object {
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var none: scala.Double = js.native
  var pending: scala.Double = js.native
  var succeeded: scala.Double = js.native
}

object Succeeded {
  @scala.inline
  def apply(
    failed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): Succeeded = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Succeeded]
  }
  @scala.inline
  implicit class SucceededOps[Self <: Succeeded] (val x: Self) extends AnyVal {
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
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}


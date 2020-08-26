package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanceledFailed extends js.Object {
  var canceled: scala.Double = js.native
  var failed: scala.Double = js.native
  var succeeded: scala.Double = js.native
}

object CanceledFailed {
  @scala.inline
  def apply(canceled: scala.Double, failed: scala.Double, succeeded: scala.Double): CanceledFailed = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanceledFailed]
  }
  @scala.inline
  implicit class CanceledFailedOps[Self <: CanceledFailed] (val x: Self) extends AnyVal {
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
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rejected extends js.Object {
  var approved: scala.Double = js.native
  var canceled: scala.Double = js.native
  var pending: scala.Double = js.native
  var rejected: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object Rejected {
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    rejected: scala.Double,
    unknown: scala.Double
  ): Rejected = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejected]
  }
  @scala.inline
  implicit class RejectedOps[Self <: Rejected] (val x: Self) extends AnyVal {
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
    def setApproved(value: scala.Double): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanceled(value: scala.Double): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: scala.Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: scala.Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Approved extends js.Object {
  var approved: scala.Double = js.native
  var created: scala.Double = js.native
  var deleted: scala.Double = js.native
  var rejected: scala.Double = js.native
}

object Approved {
  @scala.inline
  def apply(approved: scala.Double, created: scala.Double, deleted: scala.Double, rejected: scala.Double): Approved = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approved]
  }
  @scala.inline
  implicit class ApprovedOps[Self <: Approved] (val x: Self) extends AnyVal {
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
    def setCreated(value: scala.Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: scala.Double): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: scala.Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
  }
  
}


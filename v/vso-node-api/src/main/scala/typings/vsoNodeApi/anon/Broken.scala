package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broken extends js.Object {
  var approved: scala.Double = js.native
  var broken: scala.Double = js.native
  var notApplicable: scala.Double = js.native
  var queued: scala.Double = js.native
  var rejected: scala.Double = js.native
  var running: scala.Double = js.native
}

object Broken {
  @scala.inline
  def apply(
    approved: scala.Double,
    broken: scala.Double,
    notApplicable: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    running: scala.Double
  ): Broken = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broken]
  }
  @scala.inline
  implicit class BrokenOps[Self <: Broken] (val x: Self) extends AnyVal {
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
    def setBroken(value: scala.Double): Self = this.set("broken", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotApplicable(value: scala.Double): Self = this.set("notApplicable", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: scala.Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: scala.Double): Self = this.set("running", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inprogress extends js.Object {
  var completed: scala.Double = js.native
  var failed: scala.Double = js.native
  var inprogress: scala.Double = js.native
  var skipped: scala.Double = js.native
}

object Inprogress {
  @scala.inline
  def apply(completed: scala.Double, failed: scala.Double, inprogress: scala.Double, skipped: scala.Double): Inprogress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inprogress = inprogress.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inprogress]
  }
  @scala.inline
  implicit class InprogressOps[Self <: Inprogress] (val x: Self) extends AnyVal {
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
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInprogress(value: scala.Double): Self = this.set("inprogress", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: scala.Double): Self = this.set("skipped", value.asInstanceOf[js.Any])
  }
  
}


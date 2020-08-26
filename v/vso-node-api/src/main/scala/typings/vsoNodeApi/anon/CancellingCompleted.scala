package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellingCompleted extends js.Object {
  var cancelling: scala.Double = js.native
  var completed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var queued: scala.Double = js.native
}

object CancellingCompleted {
  @scala.inline
  def apply(cancelling: scala.Double, completed: scala.Double, inProgress: scala.Double, queued: scala.Double): CancellingCompleted = {
    val __obj = js.Dynamic.literal(cancelling = cancelling.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellingCompleted]
  }
  @scala.inline
  implicit class CancellingCompletedOps[Self <: CancellingCompleted] (val x: Self) extends AnyVal {
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
    def setCancelling(value: scala.Double): Self = this.set("cancelling", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
  }
  
}


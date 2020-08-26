package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InProgress_ extends js.Object {
  var abandoned: scala.Double = js.native
  var completed: scala.Double = js.native
  var failed: scala.Double = js.native
  var inProgress: scala.Double = js.native
  var queued: scala.Double = js.native
}

object InProgress_ {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    completed: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    queued: scala.Double
  ): InProgress_ = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgress_]
  }
  @scala.inline
  implicit class InProgress_Ops[Self <: InProgress_] (val x: Self) extends AnyVal {
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
    def setAbandoned(value: scala.Double): Self = this.set("abandoned", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: scala.Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInProgress(value: scala.Double): Self = this.set("inProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
  }
  
}


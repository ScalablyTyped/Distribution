package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queued extends js.Object {
  var all: scala.Double = js.native
  var queued: scala.Double = js.native
  var running: scala.Double = js.native
}

object Queued {
  @scala.inline
  def apply(all: scala.Double, queued: scala.Double, running: scala.Double): Queued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queued]
  }
  @scala.inline
  implicit class QueuedOps[Self <: Queued] (val x: Self) extends AnyVal {
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueued(value: scala.Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: scala.Double): Self = this.set("running", value.asInstanceOf[js.Any])
  }
  
}


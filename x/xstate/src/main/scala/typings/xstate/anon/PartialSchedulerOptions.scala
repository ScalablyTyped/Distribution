package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<xstate.xstate/lib/scheduler.SchedulerOptions> */
@js.native
trait PartialSchedulerOptions extends js.Object {
  var deferEvents: js.UndefOr[Boolean] = js.native
}

object PartialSchedulerOptions {
  @scala.inline
  def apply(): PartialSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchedulerOptions]
  }
  @scala.inline
  implicit class PartialSchedulerOptionsOps[Self <: PartialSchedulerOptions] (val x: Self) extends AnyVal {
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
    def setDeferEvents(value: Boolean): Self = this.set("deferEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferEvents: Self = this.set("deferEvents", js.undefined)
  }
  
}


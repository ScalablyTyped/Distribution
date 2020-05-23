package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<xstate.xstate/lib/scheduler.SchedulerOptions> */
trait PartialSchedulerOptions extends js.Object {
  var deferEvents: js.UndefOr[Boolean] = js.undefined
}

object PartialSchedulerOptions {
  @scala.inline
  def apply(deferEvents: js.UndefOr[Boolean] = js.undefined): PartialSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferEvents)) __obj.updateDynamic("deferEvents")(deferEvents.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSchedulerOptions]
  }
}


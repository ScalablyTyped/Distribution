package typings.xstate.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerOptions extends js.Object {
  var deferEvents: Boolean
}

object SchedulerOptions {
  @scala.inline
  def apply(deferEvents: Boolean): SchedulerOptions = {
    val __obj = js.Dynamic.literal(deferEvents = deferEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}


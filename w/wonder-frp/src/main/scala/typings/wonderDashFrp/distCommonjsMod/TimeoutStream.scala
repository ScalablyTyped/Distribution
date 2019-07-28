package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: Double, scheduler: typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderDashFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream = js.native
}


package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends typings.wonderDashFrp.distCommonjsStreamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler): typings.wonderDashFrp.distCommonjsStreamIntervalStreamMod.IntervalStream = js.native
}


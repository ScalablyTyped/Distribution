package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamIntervalStreamMod.IntervalStream {
  def this(interval: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
}

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamIntervalStreamMod.IntervalStream = js.native
}


package typings
package wonderDashFrpLib.distCommonjsStreamIntervalStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(interval: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
  var _interval: js.Any = js.native
  def initWhenCreate(): scala.Unit = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamIntervalStreamMod.IntervalStream = js.native
}


package typings.wonderDashFrp.distCommonjsStreamIntervalStreamMod

import typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
@js.native
class IntervalStream protected () extends BaseStream {
  def this(interval: Double, scheduler: Scheduler) = this()
  var _interval: js.Any = js.native
  def initWhenCreate(): Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: Double, scheduler: Scheduler): IntervalStream = js.native
}


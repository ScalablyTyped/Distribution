package typings.wonderDashFrp.distCommonjsStreamIntervalRequestStreamMod

import typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected () extends BaseStream {
  def this(scheduler: Scheduler) = this()
  var _isEnd: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
@js.native
object IntervalRequestStream extends js.Object {
  def create(scheduler: Scheduler): IntervalRequestStream = js.native
}


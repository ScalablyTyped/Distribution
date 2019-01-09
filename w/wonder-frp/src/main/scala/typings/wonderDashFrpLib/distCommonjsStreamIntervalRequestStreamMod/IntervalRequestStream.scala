package typings
package wonderDashFrpLib.distCommonjsStreamIntervalRequestStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
  var _isEnd: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", "IntervalRequestStream")
@js.native
object IntervalRequestStream extends js.Object {
  def create(scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream = js.native
}


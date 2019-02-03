package typings
package wonderDashFrpLib.distCommonjsStreamTimeoutStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(time: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
  var _time: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamTimeoutStreamMod.TimeoutStream = js.native
}


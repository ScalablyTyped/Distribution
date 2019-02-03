package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamTimeoutStreamMod.TimeoutStream {
  def this(time: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: scala.Double, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamTimeoutStreamMod.TimeoutStream = js.native
}


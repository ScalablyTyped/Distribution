package typings
package wonderDashFrpLib.distEs2015StreamTimeoutStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/TimeoutStream", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(time: scala.Double, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler) = this()
  var _time: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/TimeoutStream", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: scala.Double, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler): wonderDashFrpLib.distEs2015StreamTimeoutStreamMod.TimeoutStream = js.native
}


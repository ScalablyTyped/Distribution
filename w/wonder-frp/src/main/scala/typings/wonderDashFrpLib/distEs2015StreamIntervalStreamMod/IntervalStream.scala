package typings
package wonderDashFrpLib.distEs2015StreamIntervalStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
@js.native
class IntervalStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(interval: scala.Double, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler) = this()
  var _interval: js.Any = js.native
  def initWhenCreate(): scala.Unit = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
@js.native
object IntervalStream extends js.Object {
  def create(interval: scala.Double, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler): wonderDashFrpLib.distEs2015StreamIntervalStreamMod.IntervalStream = js.native
}


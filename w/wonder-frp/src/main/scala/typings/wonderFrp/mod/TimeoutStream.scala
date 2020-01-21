package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends typings.wonderFrp.timeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: Double, scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.timeoutStreamMod.TimeoutStream = js.native
}


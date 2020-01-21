package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected ()
  extends typings.wonderFrp.intervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "IntervalRequestStream")
@js.native
object IntervalRequestStream extends js.Object {
  def create(scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.intervalRequestStreamMod.IntervalRequestStream = js.native
}


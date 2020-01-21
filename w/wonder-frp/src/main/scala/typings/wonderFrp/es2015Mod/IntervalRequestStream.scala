package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
@js.native
class IntervalRequestStream protected ()
  extends typings.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream {
  def this(scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "IntervalRequestStream")
@js.native
object IntervalRequestStream extends js.Object {
  def create(scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream = js.native
}


package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distEs2015StreamIntervalRequestStreamMod.IntervalRequestStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IntervalRequestStream", JSImport.Namespace)
@js.native
object distEs2015StreamIntervalRequestStreamMod extends js.Object {
  @js.native
  class IntervalRequestStream protected () extends BaseStream {
    def this(scheduler: Scheduler) = this()
    var _isEnd: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object IntervalRequestStream extends js.Object {
    def create(scheduler: Scheduler): IntervalRequestStream = js.native
  }
  
}


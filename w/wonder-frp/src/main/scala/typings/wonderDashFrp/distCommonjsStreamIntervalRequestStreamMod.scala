package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", JSImport.Namespace)
@js.native
object distCommonjsStreamIntervalRequestStreamMod extends js.Object {
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


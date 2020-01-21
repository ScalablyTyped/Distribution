package typings.wonderFrp

import typings.wonderFrp.coreSchedulerMod.Scheduler
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IntervalRequestStream", JSImport.Namespace)
@js.native
object streamIntervalRequestStreamMod extends js.Object {
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


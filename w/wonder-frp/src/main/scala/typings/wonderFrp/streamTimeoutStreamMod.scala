package typings.wonderFrp

import typings.wonderFrp.coreSchedulerMod.Scheduler
import typings.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/TimeoutStream", JSImport.Namespace)
@js.native
object streamTimeoutStreamMod extends js.Object {
  @js.native
  class TimeoutStream protected () extends BaseStream {
    def this(time: Double, scheduler: Scheduler) = this()
    var _time: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TimeoutStream extends js.Object {
    def create(time: Double, scheduler: Scheduler): TimeoutStream = js.native
  }
  
}


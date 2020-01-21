package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalRequestStream", JSImport.Namespace)
@js.native
object intervalRequestStreamMod extends js.Object {
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


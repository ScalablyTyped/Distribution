package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/IntervalStream", JSImport.Namespace)
@js.native
object intervalStreamMod extends js.Object {
  @js.native
  class IntervalStream protected () extends BaseStream {
    def this(interval: Double, scheduler: Scheduler) = this()
    var _interval: js.Any = js.native
    def initWhenCreate(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object IntervalStream extends js.Object {
    def create(interval: Double, scheduler: Scheduler): IntervalStream = js.native
  }
  
}


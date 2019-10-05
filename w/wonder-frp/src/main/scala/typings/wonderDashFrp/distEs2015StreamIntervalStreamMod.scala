package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distEs2015StreamIntervalStreamMod.IntervalStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/IntervalStream", JSImport.Namespace)
@js.native
object distEs2015StreamIntervalStreamMod extends js.Object {
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


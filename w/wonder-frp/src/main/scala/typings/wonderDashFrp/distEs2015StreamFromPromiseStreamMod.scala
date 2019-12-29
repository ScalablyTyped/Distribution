package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromPromiseStream", JSImport.Namespace)
@js.native
object distEs2015StreamFromPromiseStreamMod extends js.Object {
  @js.native
  class FromPromiseStream protected () extends BaseStream {
    def this(promise: js.Any, scheduler: Scheduler) = this()
    var _promise: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FromPromiseStream extends js.Object {
    def create(promise: js.Any, scheduler: Scheduler): FromPromiseStream = js.native
  }
  
}


package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.schedulerMod.Scheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FromArrayStream", JSImport.Namespace)
@js.native
object fromArrayStreamMod extends js.Object {
  @js.native
  class FromArrayStream protected () extends BaseStream {
    def this(array: js.Array[_], scheduler: Scheduler) = this()
    var _array: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FromArrayStream extends js.Object {
    def create(array: js.Array[_], scheduler: Scheduler): FromArrayStream = js.native
  }
  
}


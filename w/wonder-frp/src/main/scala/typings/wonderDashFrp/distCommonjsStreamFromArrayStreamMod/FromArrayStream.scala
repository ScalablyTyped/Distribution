package typings.wonderDashFrp.distCommonjsStreamFromArrayStreamMod

import typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FromArrayStream", "FromArrayStream")
@js.native
class FromArrayStream protected () extends BaseStream {
  def this(array: js.Array[_], scheduler: Scheduler) = this()
  var _array: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/FromArrayStream", "FromArrayStream")
@js.native
object FromArrayStream extends js.Object {
  def create(array: js.Array[_], scheduler: Scheduler): FromArrayStream = js.native
}


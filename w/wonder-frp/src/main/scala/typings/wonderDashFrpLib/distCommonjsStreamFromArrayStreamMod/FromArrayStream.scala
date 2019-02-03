package typings
package wonderDashFrpLib.distCommonjsStreamFromArrayStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FromArrayStream", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(array: js.Array[_], scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
  var _array: js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/stream/FromArrayStream", "FromArrayStream")
@js.native
object FromArrayStream extends js.Object {
  def create(array: js.Array[_], scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamFromArrayStreamMod.FromArrayStream = js.native
}


package typings
package wonderDashFrpLib.distEs2015StreamFromArrayStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(array: js.Array[_], scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler) = this()
  var _array: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/FromArrayStream", "FromArrayStream")
@js.native
object FromArrayStream extends js.Object {
  def create(array: js.Array[_], scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler): wonderDashFrpLib.distEs2015StreamFromArrayStreamMod.FromArrayStream = js.native
}


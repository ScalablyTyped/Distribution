package typings
package wonderDashFrpLib.distCommonjsStreamFromPromiseStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
@js.native
class FromPromiseStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(promise: js.Any, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler) = this()
  var _promise: js.Any = js.native
}

@JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
@js.native
object FromPromiseStream extends js.Object {
  def create(promise: js.Any, scheduler: wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler): wonderDashFrpLib.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream = js.native
}


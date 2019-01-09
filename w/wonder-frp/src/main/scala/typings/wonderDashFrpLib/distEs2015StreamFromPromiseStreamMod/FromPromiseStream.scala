package typings
package wonderDashFrpLib.distEs2015StreamFromPromiseStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromPromiseStream", "FromPromiseStream")
@js.native
class FromPromiseStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(promise: js.Any, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler) = this()
  var _promise: js.Any = js.native
}

@JSImport("wonder-frp/dist/es2015/stream/FromPromiseStream", "FromPromiseStream")
@js.native
object FromPromiseStream extends js.Object {
  def create(promise: js.Any, scheduler: wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler): wonderDashFrpLib.distEs2015StreamFromPromiseStreamMod.FromPromiseStream = js.native
}


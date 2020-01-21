package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
@js.native
class FromPromiseStream protected ()
  extends typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream {
  def this(promise: js.Any, scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FromPromiseStream")
@js.native
object FromPromiseStream extends js.Object {
  def create(promise: js.Any, scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream = js.native
}


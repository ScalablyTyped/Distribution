package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
@js.native
class FromPromiseStream protected ()
  extends typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream {
  def this(promise: js.Any, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FromPromiseStream")
@js.native
object FromPromiseStream extends js.Object {
  def create(promise: js.Any, scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream = js.native
}


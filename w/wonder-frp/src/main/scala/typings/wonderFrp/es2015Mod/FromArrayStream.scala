package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[_], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "FromArrayStream")
@js.native
object FromArrayStream extends js.Object {
  def create(array: js.Array[_], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = js.native
}


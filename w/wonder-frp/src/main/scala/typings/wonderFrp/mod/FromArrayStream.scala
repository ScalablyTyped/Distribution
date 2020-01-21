package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
@js.native
class FromArrayStream protected ()
  extends typings.wonderFrp.fromArrayStreamMod.FromArrayStream {
  def this(array: js.Array[_], scheduler: typings.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FromArrayStream")
@js.native
object FromArrayStream extends js.Object {
  def create(array: js.Array[_], scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
}


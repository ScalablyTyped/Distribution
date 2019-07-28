package typings.wonderDashFrp.distCommonjsGlobalOperatorMod

import typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
import typings.wonderDashFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/global/Operator", "Operator")
@js.native
class Operator () extends js.Object

/* static members */
@JSImport("wonder-frp/dist/commonjs/global/Operator", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): AnonymousStream = js.native
  def empty(): AnonymousStream = js.native
  def fromArray(array: js.Array[_]): FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: Scheduler): FromArrayStream = js.native
}


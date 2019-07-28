package typings.wonderDashFrp.distEs2015GlobalOperatorMod

import typings.wonderDashFrp.distEs2015CoreSchedulerMod.Scheduler
import typings.wonderDashFrp.distEs2015StreamAnonymousStreamMod.AnonymousStream
import typings.wonderDashFrp.distEs2015StreamFromArrayStreamMod.FromArrayStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/global/Operator", "Operator")
@js.native
class Operator () extends js.Object

/* static members */
@JSImport("wonder-frp/dist/es2015/global/Operator", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): AnonymousStream = js.native
  def empty(): AnonymousStream = js.native
  def fromArray(array: js.Array[_]): FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: Scheduler): FromArrayStream = js.native
}


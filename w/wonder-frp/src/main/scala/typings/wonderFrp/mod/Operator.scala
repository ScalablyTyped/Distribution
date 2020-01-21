package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
class Operator ()
  extends typings.wonderFrp.operatorMod.Operator

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): typings.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def empty(): typings.wonderFrp.anonymousStreamMod.AnonymousStream = js.native
  def fromArray(array: js.Array[_]): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: typings.wonderFrp.schedulerMod.Scheduler): typings.wonderFrp.fromArrayStreamMod.FromArrayStream = js.native
}


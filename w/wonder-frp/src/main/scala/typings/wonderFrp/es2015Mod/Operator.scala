package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
class Operator ()
  extends typings.wonderFrp.globalOperatorMod.Operator

/* static members */
@JSImport("wonder-frp/dist/es2015", "Operator")
@js.native
object Operator extends js.Object {
  def createStream(subscribeFunc: js.Any): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = js.native
  def empty(): typings.wonderFrp.streamAnonymousStreamMod.AnonymousStream = js.native
  def fromArray(array: js.Array[_]): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = js.native
  def fromArray(array: js.Array[_], scheduler: typings.wonderFrp.coreSchedulerMod.Scheduler): typings.wonderFrp.streamFromArrayStreamMod.FromArrayStream = js.native
}


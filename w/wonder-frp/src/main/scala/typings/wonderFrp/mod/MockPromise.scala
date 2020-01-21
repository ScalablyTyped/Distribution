package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderFrp.mockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.recordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.recordMod.Record]
  ): typings.wonderFrp.mockPromiseMod.MockPromise = js.native
}


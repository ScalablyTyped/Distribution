package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderFrp.testingMockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record]
  ): typings.wonderFrp.testingMockPromiseMod.MockPromise = js.native
}


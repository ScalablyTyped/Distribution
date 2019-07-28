package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderDashFrp.distCommonjsTestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderDashFrp.distCommonjsTestingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderDashFrp.distCommonjsTestingRecordMod.Record]
  ): typings.wonderDashFrp.distCommonjsTestingMockPromiseMod.MockPromise = js.native
}


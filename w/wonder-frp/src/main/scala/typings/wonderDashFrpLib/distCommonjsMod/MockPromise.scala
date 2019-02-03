package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends wonderDashFrpLib.distCommonjsTestingMockPromiseMod.MockPromise {
  def this(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler, messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record]) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record]
  ): wonderDashFrpLib.distCommonjsTestingMockPromiseMod.MockPromise = js.native
}


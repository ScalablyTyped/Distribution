package typings.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends typings.wonderDashFrp.distEs2015TestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderDashFrp.distEs2015TestingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typings.wonderDashFrp.distEs2015TestingRecordMod.Record]
  ): typings.wonderDashFrp.distEs2015TestingMockPromiseMod.MockPromise = js.native
}


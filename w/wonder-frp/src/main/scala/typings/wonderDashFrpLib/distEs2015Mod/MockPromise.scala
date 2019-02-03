package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends wonderDashFrpLib.distEs2015TestingMockPromiseMod.MockPromise {
  def this(scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler, messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record]) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record]
  ): wonderDashFrpLib.distEs2015TestingMockPromiseMod.MockPromise = js.native
}


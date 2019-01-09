package typings
package wonderDashFrpLib.distCommonjsTestingMockPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockPromise", "MockPromise")
@js.native
class MockPromise protected () extends js.Object {
  def this(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler, messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record]) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  def `then`(
    successCb: js.Function,
    errorCb: js.Function,
    observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver
  ): scala.Unit = js.native
}

@JSImport("wonder-frp/dist/commonjs/testing/MockPromise", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record]
  ): wonderDashFrpLib.distCommonjsTestingMockPromiseMod.MockPromise = js.native
}


package typings
package wonderDashFrpLib.distEs2015TestingMockPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/MockPromise", "MockPromise")
@js.native
class MockPromise protected () extends js.Object {
  def this(scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler, messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record]) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  def `then`(
    successCb: js.Function,
    errorCb: js.Function,
    observer: wonderDashFrpLib.distEs2015ObserverIObserverMod.IObserver
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/testing/MockPromise", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record]
  ): wonderDashFrpLib.distEs2015TestingMockPromiseMod.MockPromise = js.native
}


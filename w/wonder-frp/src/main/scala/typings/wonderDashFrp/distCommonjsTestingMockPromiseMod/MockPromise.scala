package typings.wonderDashFrp.distCommonjsTestingMockPromiseMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typings.wonderDashFrp.distCommonjsTestingRecordMod.Record
import typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockPromise", "MockPromise")
@js.native
class MockPromise protected () extends js.Object {
  def this(scheduler: TestScheduler, messages: js.Array[Record]) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  def `then`(successCb: js.Function, errorCb: js.Function, observer: IObserver): Unit = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/testing/MockPromise", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(scheduler: TestScheduler, messages: js.Array[Record]): MockPromise = js.native
}


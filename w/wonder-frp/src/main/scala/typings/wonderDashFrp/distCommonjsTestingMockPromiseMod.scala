package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typings.wonderDashFrp.distCommonjsTestingMockPromiseMod.MockPromise
import typings.wonderDashFrp.distCommonjsTestingRecordMod.Record
import typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockPromise", JSImport.Namespace)
@js.native
object distCommonjsTestingMockPromiseMod extends js.Object {
  @js.native
  class MockPromise protected () extends js.Object {
    def this(scheduler: TestScheduler, messages: js.Array[Record]) = this()
    var _messages: js.Any = js.native
    var _scheduler: js.Any = js.native
    def `then`(successCb: js.Function, errorCb: js.Function, observer: IObserver): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MockPromise extends js.Object {
    def create(scheduler: TestScheduler, messages: js.Array[Record]): MockPromise = js.native
  }
  
}


package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import typings.wonderDashFrp.distEs2015TestingRecordMod.Record
import typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/MockPromise", JSImport.Namespace)
@js.native
object distEs2015TestingMockPromiseMod extends js.Object {
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


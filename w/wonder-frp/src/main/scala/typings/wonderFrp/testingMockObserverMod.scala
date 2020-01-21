package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.testingRecordMod.Record
import typings.wonderFrp.testingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/MockObserver", JSImport.Namespace)
@js.native
object testingMockObserverMod extends js.Object {
  @js.native
  class MockObserver protected () extends Observer {
    def this(scheduler: TestScheduler) = this()
    var _messages: js.Any = js.native
    var _scheduler: js.Any = js.native
    var messages: js.Array[Record] = js.native
  }
  
  /* static members */
  @js.native
  object MockObserver extends js.Object {
    def create(scheduler: TestScheduler): MockObserver = js.native
  }
  
}


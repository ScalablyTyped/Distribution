package typings.wonderFrp

import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.recordMod.Record
import typings.wonderFrp.testSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockObserver", JSImport.Namespace)
@js.native
object mockObserverMod extends js.Object {
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


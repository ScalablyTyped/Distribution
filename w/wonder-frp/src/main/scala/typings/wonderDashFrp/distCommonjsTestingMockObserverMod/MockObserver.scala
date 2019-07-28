package typings.wonderDashFrp.distCommonjsTestingMockObserverMod

import typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderDashFrp.distCommonjsTestingRecordMod.Record
import typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
@js.native
class MockObserver protected () extends Observer {
  def this(scheduler: TestScheduler) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  var messages: js.Array[Record] = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: TestScheduler): MockObserver = js.native
}


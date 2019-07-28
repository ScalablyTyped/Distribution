package typings.wonderDashFrp.distEs2015TestingMockObserverMod

import typings.wonderDashFrp.distEs2015CoreObserverMod.Observer
import typings.wonderDashFrp.distEs2015TestingRecordMod.Record
import typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
@js.native
class MockObserver protected () extends Observer {
  def this(scheduler: TestScheduler) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  var messages: js.Array[Record] = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: TestScheduler): MockObserver = js.native
}


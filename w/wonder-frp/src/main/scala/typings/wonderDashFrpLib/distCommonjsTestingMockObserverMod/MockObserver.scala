package typings
package wonderDashFrpLib.distCommonjsTestingMockObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
@js.native
class MockObserver protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  var messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record] = js.native
}

@JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
}


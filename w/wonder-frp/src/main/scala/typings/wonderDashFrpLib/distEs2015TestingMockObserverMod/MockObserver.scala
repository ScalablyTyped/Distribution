package typings
package wonderDashFrpLib.distEs2015TestingMockObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
@js.native
class MockObserver protected ()
  extends wonderDashFrpLib.distEs2015CoreObserverMod.Observer {
  def this(scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler) = this()
  var _messages: js.Any = js.native
  var _scheduler: js.Any = js.native
  var messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record] = js.native
}

@JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler): wonderDashFrpLib.distEs2015TestingMockObserverMod.MockObserver = js.native
}


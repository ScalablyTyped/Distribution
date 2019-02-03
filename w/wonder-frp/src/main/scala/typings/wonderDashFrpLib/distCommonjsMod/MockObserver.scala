package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
class MockObserver protected ()
  extends wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver {
  def this(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler): wonderDashFrpLib.distCommonjsTestingMockObserverMod.MockObserver = js.native
}


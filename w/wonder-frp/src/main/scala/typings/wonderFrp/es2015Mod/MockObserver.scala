package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockObserver")
@js.native
class MockObserver protected ()
  extends typings.wonderFrp.testingMockObserverMod.MockObserver {
  def this(scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler): typings.wonderFrp.testingMockObserverMod.MockObserver = js.native
}


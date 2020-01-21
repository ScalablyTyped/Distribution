package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
class MockObserver protected ()
  extends typings.wonderFrp.mockObserverMod.MockObserver {
  def this(scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler): typings.wonderFrp.mockObserverMod.MockObserver = js.native
}


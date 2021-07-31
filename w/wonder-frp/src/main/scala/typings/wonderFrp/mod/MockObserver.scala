package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
class MockObserver protected ()
  extends typings.wonderFrp.mockObserverMod.MockObserver {
  def this(scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler) = this()
}
/* static members */
object MockObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MockObserver")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler): typings.wonderFrp.mockObserverMod.MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.mockObserverMod.MockObserver]
}

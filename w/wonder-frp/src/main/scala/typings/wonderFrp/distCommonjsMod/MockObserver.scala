package typings.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
open class MockObserver protected ()
  extends typings.wonderFrp.distCommonjsTestingMockObserverMod.MockObserver {
  def this(scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler) = this()
}
/* static members */
object MockObserver {
  
  @JSImport("wonder-frp/dist/commonjs", "MockObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(scheduler: typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler): typings.wonderFrp.distCommonjsTestingMockObserverMod.MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distCommonjsTestingMockObserverMod.MockObserver]
}

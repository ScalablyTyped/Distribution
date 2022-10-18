package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MockObserver")
@js.native
open class MockObserver protected ()
  extends typings.wonderFrp.distEs2015TestingMockObserverMod.MockObserver {
  def this(scheduler: typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler) = this()
}
/* static members */
object MockObserver {
  
  @JSImport("wonder-frp/dist/es2015", "MockObserver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(scheduler: typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler): typings.wonderFrp.distEs2015TestingMockObserverMod.MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.wonderFrp.distEs2015TestingMockObserverMod.MockObserver]
}

package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreObserverMod.Observer
import typings.wonderFrp.distCommonjsTestingRecordMod.Record
import typings.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsTestingMockObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
  @js.native
  open class MockObserver protected () extends Observer {
    def this(scheduler: TestScheduler) = this()
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _scheduler: Any = js.native
    
    var messages: js.Array[Record] = js.native
  }
  /* static members */
  object MockObserver {
    
    @JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(scheduler: TestScheduler): MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MockObserver]
  }
}

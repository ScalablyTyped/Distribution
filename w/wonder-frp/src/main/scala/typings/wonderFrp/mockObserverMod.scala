package typings.wonderFrp

import typings.wonderFrp.observerMod.Observer
import typings.wonderFrp.recordMod.Record
import typings.wonderFrp.testSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockObserverMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/MockObserver", "MockObserver")
  @js.native
  class MockObserver protected () extends Observer {
    def this(scheduler: TestScheduler) = this()
    
    /* private */ var _messages: js.Any = js.native
    
    /* private */ var _scheduler: js.Any = js.native
    
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

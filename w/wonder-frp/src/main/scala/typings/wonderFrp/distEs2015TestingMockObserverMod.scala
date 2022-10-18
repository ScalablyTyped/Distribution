package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015TestingRecordMod.Record
import typings.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015TestingMockObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
  @js.native
  open class MockObserver protected () extends Observer {
    def this(scheduler: TestScheduler) = this()
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _scheduler: Any = js.native
    
    var messages: js.Array[Record] = js.native
  }
  /* static members */
  object MockObserver {
    
    @JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(scheduler: TestScheduler): MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MockObserver]
  }
}

package typings.wonderFrp

import typings.wonderFrp.coreObserverMod.Observer
import typings.wonderFrp.testingRecordMod.Record
import typings.wonderFrp.testingTestSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMockObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
  @js.native
  class MockObserver protected () extends Observer {
    def this(scheduler: TestScheduler) = this()
    
    var _messages: js.Any = js.native
    
    var _scheduler: js.Any = js.native
    
    var messages: js.Array[Record] = js.native
  }
  /* static members */
  object MockObserver {
    
    @JSImport("wonder-frp/dist/es2015/testing/MockObserver", "MockObserver")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(scheduler: TestScheduler): MockObserver = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MockObserver]
  }
}

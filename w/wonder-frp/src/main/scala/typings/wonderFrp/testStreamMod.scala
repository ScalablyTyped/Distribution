package typings.wonderFrp

import typings.wonderFrp.baseStreamMod.BaseStream
import typings.wonderFrp.recordMod.Record
import typings.wonderFrp.testSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
  @js.native
  class TestStream protected () extends BaseStream {
    def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
    
    /* private */ var _messages: js.Any = js.native
    
    @JSName("scheduler")
    var scheduler_TestStream: TestScheduler = js.native
  }
  /* static members */
  object TestStream {
    
    @JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[TestStream]
  }
}

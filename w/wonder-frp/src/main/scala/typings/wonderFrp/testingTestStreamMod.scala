package typings.wonderFrp

import typings.wonderFrp.streamBaseStreamMod.BaseStream
import typings.wonderFrp.testingRecordMod.Record
import typings.wonderFrp.testingTestSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
  @js.native
  open class TestStream protected () extends BaseStream {
    def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
    
    /* private */ var _messages: Any = js.native
    
    @JSName("scheduler")
    var scheduler_TestStream: TestScheduler = js.native
  }
  /* static members */
  object TestStream {
    
    @JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[TestStream]
  }
}

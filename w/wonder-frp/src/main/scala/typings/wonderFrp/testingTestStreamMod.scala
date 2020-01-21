package typings.wonderFrp

import typings.wonderFrp.streamBaseStreamMod.BaseStream
import typings.wonderFrp.testingRecordMod.Record
import typings.wonderFrp.testingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/TestStream", JSImport.Namespace)
@js.native
object testingTestStreamMod extends js.Object {
  @js.native
  class TestStream protected () extends BaseStream {
    def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
    var _messages: js.Any = js.native
    @JSName("scheduler")
    var scheduler_TestStream: TestScheduler = js.native
  }
  
  /* static members */
  @js.native
  object TestStream extends js.Object {
    def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = js.native
  }
  
}


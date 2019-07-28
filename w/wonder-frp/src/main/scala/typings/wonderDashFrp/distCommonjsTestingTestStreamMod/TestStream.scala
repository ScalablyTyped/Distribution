package typings.wonderDashFrp.distCommonjsTestingTestStreamMod

import typings.wonderDashFrp.distCommonjsStreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distCommonjsTestingRecordMod.Record
import typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
@js.native
class TestStream protected () extends BaseStream {
  def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
  var _messages: js.Any = js.native
  @JSName("scheduler")
  var scheduler_TestStream: TestScheduler = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = js.native
}


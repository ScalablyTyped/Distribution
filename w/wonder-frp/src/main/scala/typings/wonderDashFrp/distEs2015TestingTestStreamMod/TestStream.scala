package typings.wonderDashFrp.distEs2015TestingTestStreamMod

import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distEs2015TestingRecordMod.Record
import typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
@js.native
class TestStream protected () extends BaseStream {
  def this(messages: js.Array[Record], scheduler: TestScheduler) = this()
  var _messages: js.Any = js.native
  @JSName("scheduler")
  var scheduler_TestStream: TestScheduler = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(messages: js.Array[Record], scheduler: TestScheduler): TestStream = js.native
}


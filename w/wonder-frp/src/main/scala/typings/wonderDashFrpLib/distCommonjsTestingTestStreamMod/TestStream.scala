package typings
package wonderDashFrpLib.distCommonjsTestingTestStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
@js.native
class TestStream protected ()
  extends wonderDashFrpLib.distCommonjsStreamBaseStreamMod.BaseStream {
  def this(messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record], scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler) = this()
  var _messages: js.Any = js.native
  @JSName("scheduler")
  var scheduler_TestStream: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/testing/TestStream", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record],
    scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler
  ): wonderDashFrpLib.distCommonjsTestingTestStreamMod.TestStream = js.native
}


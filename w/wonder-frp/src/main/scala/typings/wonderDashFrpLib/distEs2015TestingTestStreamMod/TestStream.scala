package typings
package wonderDashFrpLib.distEs2015TestingTestStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
@js.native
class TestStream protected ()
  extends wonderDashFrpLib.distEs2015StreamBaseStreamMod.BaseStream {
  def this(messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record], scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler) = this()
  var _messages: js.Any = js.native
  @JSName("scheduler")
  var scheduler_TestStream: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler = js.native
}

/* static members */
@JSImport("wonder-frp/dist/es2015/testing/TestStream", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record],
    scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler
  ): wonderDashFrpLib.distEs2015TestingTestStreamMod.TestStream = js.native
}


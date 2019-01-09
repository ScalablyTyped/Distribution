package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends wonderDashFrpLib.distCommonjsTestingTestStreamMod.TestStream {
  def this(messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record], scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler) = this()
}

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[wonderDashFrpLib.distCommonjsTestingRecordMod.Record],
    scheduler: wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler
  ): wonderDashFrpLib.distCommonjsTestingTestStreamMod.TestStream = js.native
}


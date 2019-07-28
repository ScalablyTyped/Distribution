package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderDashFrp.distCommonjsTestingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderDashFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typings.wonderDashFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ): typings.wonderDashFrp.distCommonjsTestingTestStreamMod.TestStream = js.native
}


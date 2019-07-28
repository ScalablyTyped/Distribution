package typings.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderDashFrp.distEs2015TestingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderDashFrp.distEs2015TestingRecordMod.Record],
    scheduler: typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typings.wonderDashFrp.distEs2015TestingRecordMod.Record],
    scheduler: typings.wonderDashFrp.distEs2015TestingTestSchedulerMod.TestScheduler
  ): typings.wonderDashFrp.distEs2015TestingTestStreamMod.TestStream = js.native
}


package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends wonderDashFrpLib.distEs2015TestingTestStreamMod.TestStream {
  def this(messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record], scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler) = this()
}

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[wonderDashFrpLib.distEs2015TestingRecordMod.Record],
    scheduler: wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler
  ): wonderDashFrpLib.distEs2015TestingTestStreamMod.TestStream = js.native
}


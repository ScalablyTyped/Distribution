package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderFrp.testStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderFrp.recordMod.Record],
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typings.wonderFrp.recordMod.Record],
    scheduler: typings.wonderFrp.testSchedulerMod.TestScheduler
  ): typings.wonderFrp.testStreamMod.TestStream = js.native
}


package typings.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends typings.wonderFrp.testingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record],
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typings.wonderFrp.testingRecordMod.Record],
    scheduler: typings.wonderFrp.testingTestSchedulerMod.TestScheduler
  ): typings.wonderFrp.testingTestStreamMod.TestStream = js.native
}


package typings.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
  def create(): typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: Boolean): typings.wonderDashFrp.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
}


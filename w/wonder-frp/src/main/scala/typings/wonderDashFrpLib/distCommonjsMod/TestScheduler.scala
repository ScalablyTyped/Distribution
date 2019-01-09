package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler {
  def this(isReset: scala.Boolean) = this()
}

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def create(): wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: scala.Boolean): wonderDashFrpLib.distCommonjsTestingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
}


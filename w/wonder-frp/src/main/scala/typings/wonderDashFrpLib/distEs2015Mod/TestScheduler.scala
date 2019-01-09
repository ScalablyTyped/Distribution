package typings
package wonderDashFrpLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler {
  def this(isReset: scala.Boolean) = this()
}

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
  def create(): wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: scala.Boolean): wonderDashFrpLib.distEs2015TestingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): wonderDashFrpLib.distEs2015TestingRecordMod.Record = js.native
}


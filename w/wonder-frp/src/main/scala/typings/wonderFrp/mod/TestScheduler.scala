package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typings.wonderFrp.testSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): typings.wonderFrp.recordMod.Record = js.native
  def create(): typings.wonderFrp.testSchedulerMod.TestScheduler = js.native
  def create(isReset: Boolean): typings.wonderFrp.testSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): typings.wonderFrp.recordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): typings.wonderFrp.recordMod.Record = js.native
}


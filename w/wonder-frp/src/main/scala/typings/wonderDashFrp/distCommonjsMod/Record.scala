package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsTestingActionTypeMod.ActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
class Record protected ()
  extends typings.wonderDashFrp.distCommonjsTestingRecordMod.Record {
  def this(time: js.Any, value: js.Any, actionType: ActionType, comparer: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
object Record extends js.Object {
  def create(time: Double, value: js.Any): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: ActionType): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: ActionType, comparer: js.Function): typings.wonderDashFrp.distCommonjsTestingRecordMod.Record = js.native
}


package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015TestingActionTypeMod.ActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "Record")
@js.native
class Record protected ()
  extends typings.wonderDashFrp.distEs2015TestingRecordMod.Record {
  def this(time: js.Any, value: js.Any, actionType: ActionType, comparer: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "Record")
@js.native
object Record extends js.Object {
  def create(time: Double, value: js.Any): typings.wonderDashFrp.distEs2015TestingRecordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: ActionType): typings.wonderDashFrp.distEs2015TestingRecordMod.Record = js.native
  def create(time: Double, value: js.Any, actionType: ActionType, comparer: js.Function): typings.wonderDashFrp.distEs2015TestingRecordMod.Record = js.native
}


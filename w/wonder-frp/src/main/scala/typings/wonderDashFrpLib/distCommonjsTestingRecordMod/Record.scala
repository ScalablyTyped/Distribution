package typings
package wonderDashFrpLib.distCommonjsTestingRecordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/Record", "Record")
@js.native
class Record protected () extends js.Object {
  def this(time: js.Any, value: js.Any, actionType: wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType, comparer: js.Function) = this()
  var _actionType: js.Any = js.native
  var _comparer: js.Any = js.native
  var _time: js.Any = js.native
  var _value: js.Any = js.native
  var actionType: wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType = js.native
  var time: scala.Double = js.native
  var value: scala.Double = js.native
  def equals(other: js.Any): js.Any = js.native
}

/* static members */
@JSImport("wonder-frp/dist/commonjs/testing/Record", "Record")
@js.native
object Record extends js.Object {
  def create(time: scala.Double, value: js.Any): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def create(
    time: scala.Double,
    value: js.Any,
    actionType: wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType
  ): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
  def create(
    time: scala.Double,
    value: js.Any,
    actionType: wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType,
    comparer: js.Function
  ): wonderDashFrpLib.distCommonjsTestingRecordMod.Record = js.native
}


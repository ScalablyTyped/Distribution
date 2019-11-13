package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.pivot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransform extends Transforms {
  var field: FieldRef
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var key: js.UndefOr[String | TransformField] = js.undefined
  var limit: js.UndefOr[Double | SignalRef] = js.undefined
  var op: js.UndefOr[String | SignalRef] = js.undefined
  var `type`: pivot
  var value: FieldRef
}

object PivotTransform {
  @scala.inline
  def apply(
    field: FieldRef,
    `type`: pivot,
    value: FieldRef,
    groupby: js.Array[FieldRef] | SignalRef = null,
    key: String | TransformField = null,
    limit: Double | SignalRef = null,
    op: String | SignalRef = null
  ): PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransform]
  }
}


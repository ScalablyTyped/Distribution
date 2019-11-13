package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.impute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImputeTransform extends Transforms {
  var field: FieldRef
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var key: FieldRef
  var keyvals: js.UndefOr[js.Array[_] | SignalRef] = js.undefined
  var method: js.UndefOr[ImputeMethod | SignalRef] = js.undefined
  var `type`: impute
  var value: js.UndefOr[js.Any] = js.undefined
}

object ImputeTransform {
  @scala.inline
  def apply(
    field: FieldRef,
    key: FieldRef,
    `type`: impute,
    groupby: js.Array[FieldRef] | SignalRef = null,
    keyvals: js.Array[_] | SignalRef = null,
    method: ImputeMethod | SignalRef = null,
    value: js.Any = null
  ): ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (keyvals != null) __obj.updateDynamic("keyvals")(keyvals.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ImputeTransform]
  }
}


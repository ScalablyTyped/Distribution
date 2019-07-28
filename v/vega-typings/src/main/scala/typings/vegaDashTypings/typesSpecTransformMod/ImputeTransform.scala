package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.impute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImputeTransform extends _Transforms {
  var field: String
  var groupby: js.UndefOr[js.Array[String]] = js.undefined
  var key: String
  var keyvals: js.UndefOr[js.Array[_] | SignalRef] = js.undefined
  var method: js.UndefOr[ImputeMethod] = js.undefined
  var `type`: impute
  var value: js.UndefOr[js.Any] = js.undefined
}

object ImputeTransform {
  @scala.inline
  def apply(
    field: String,
    key: String,
    `type`: impute,
    groupby: js.Array[String] = null,
    keyvals: js.Array[_] | SignalRef = null,
    method: ImputeMethod = null,
    value: js.Any = null
  ): ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field, key = key)
    __obj.updateDynamic("type")(`type`)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (keyvals != null) __obj.updateDynamic("keyvals")(keyvals.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ImputeTransform]
  }
}


package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.impute
import typings.vegaDashLite.vegaDashLiteStrings.max
import typings.vegaDashLite.vegaDashLiteStrings.mean
import typings.vegaDashLite.vegaDashLiteStrings.median
import typings.vegaDashLite.vegaDashLiteStrings.min
import typings.vegaDashLite.vegaDashLiteStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgImputeTransform extends VgTransform {
  var field: String
  var groupby: js.UndefOr[js.Array[String]] = js.undefined
  var key: String
  var keyvals: js.UndefOr[js.Array[String]] = js.undefined
  var method: js.UndefOr[value | median | max | min | mean] = js.undefined
  var `type`: impute
  var value: js.UndefOr[js.Any] = js.undefined
}

object VgImputeTransform {
  @scala.inline
  def apply(
    field: String,
    key: String,
    `type`: impute,
    groupby: js.Array[String] = null,
    keyvals: js.Array[String] = null,
    method: value | median | max | min | mean = null,
    value: js.Any = null
  ): VgImputeTransform = {
    val __obj = js.Dynamic.literal(field = field, key = key)
    __obj.updateDynamic("type")(`type`)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (keyvals != null) __obj.updateDynamic("keyvals")(keyvals)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VgImputeTransform]
  }
}


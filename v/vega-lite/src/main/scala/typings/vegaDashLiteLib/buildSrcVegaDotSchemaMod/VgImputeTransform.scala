package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgImputeTransform extends VgTransform {
  var field: java.lang.String
  var groupby: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: java.lang.String
  var keyvals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var method: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.value | vegaDashLiteLib.vegaDashLiteLibStrings.median | vegaDashLiteLib.vegaDashLiteLibStrings.max | vegaDashLiteLib.vegaDashLiteLibStrings.min | vegaDashLiteLib.vegaDashLiteLibStrings.mean
  ] = js.undefined
  var `type`: vegaDashLiteLib.vegaDashLiteLibStrings.impute
  var value: js.UndefOr[js.Any] = js.undefined
}

object VgImputeTransform {
  @scala.inline
  def apply(
    field: java.lang.String,
    key: java.lang.String,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.impute,
    groupby: js.Array[java.lang.String] = null,
    keyvals: js.Array[java.lang.String] = null,
    method: vegaDashLiteLib.vegaDashLiteLibStrings.value | vegaDashLiteLib.vegaDashLiteLibStrings.median | vegaDashLiteLib.vegaDashLiteLibStrings.max | vegaDashLiteLib.vegaDashLiteLibStrings.min | vegaDashLiteLib.vegaDashLiteLibStrings.mean = null,
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


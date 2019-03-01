package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImputeTransform extends _Transforms {
  var field: java.lang.String
  var groupby: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: java.lang.String
  var keyvals: js.UndefOr[js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var method: js.UndefOr[ImputeMethod] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.impute
  var value: js.UndefOr[js.Any] = js.undefined
}

object ImputeTransform {
  @scala.inline
  def apply(
    field: java.lang.String,
    key: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.impute,
    groupby: js.Array[java.lang.String] = null,
    keyvals: js.Array[_] | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    method: ImputeMethod = null,
    value: js.Any = null
  ): ImputeTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("key")(key)
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (keyvals != null) __obj.updateDynamic("keyvals")(keyvals.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ImputeTransform]
  }
}


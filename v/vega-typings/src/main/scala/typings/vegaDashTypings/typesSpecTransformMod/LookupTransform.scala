package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var fields: js.Array[String]
  var from: String
  var key: String
  var `type`: lookup
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object LookupTransform {
  @scala.inline
  def apply(
    fields: js.Array[String],
    from: String,
    key: String,
    `type`: lookup,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    default: js.Any = null,
    values: js.Array[String] = null
  ): LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields, from = from, key = key)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[LookupTransform]
  }
}


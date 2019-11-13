package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupTransform extends Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var fields: js.Array[FieldRef] | SignalRef
  var from: DataName
  var key: FieldRef
  var `type`: lookup
  var values: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
}

object LookupTransform {
  @scala.inline
  def apply(
    fields: js.Array[FieldRef] | SignalRef,
    from: DataName,
    key: FieldRef,
    `type`: lookup,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    default: js.Any = null,
    values: js.Array[FieldRef] | SignalRef = null
  ): LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from, key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupTransform]
  }
}


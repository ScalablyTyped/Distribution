package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenTransform extends Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  var fields: js.Array[FieldRef] | SignalRef
  var index: js.UndefOr[String | SignalRef] = js.undefined
  var `type`: flatten
}

object FlattenTransform {
  @scala.inline
  def apply(
    fields: js.Array[FieldRef] | SignalRef,
    `type`: flatten,
    as: (js.Array[String | SignalRef]) | SignalRef = null,
    index: String | SignalRef = null
  ): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenTransform]
  }
}


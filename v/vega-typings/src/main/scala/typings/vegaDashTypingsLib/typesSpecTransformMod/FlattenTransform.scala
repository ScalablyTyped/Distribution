package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenTransform extends _Transforms {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fields: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.flatten
}

object FlattenTransform {
  @scala.inline
  def apply(
    fields: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.flatten,
    as: js.Array[java.lang.String] = null
  ): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[FlattenTransform]
  }
}


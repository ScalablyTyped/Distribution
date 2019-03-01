package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldTransform extends _Transforms {
  var as: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var fields: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.fold
}

object FoldTransform {
  @scala.inline
  def apply(
    fields: (js.Array[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.fold,
    as: js.Tuple2[java.lang.String, java.lang.String] = null
  ): FoldTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[FoldTransform]
  }
}


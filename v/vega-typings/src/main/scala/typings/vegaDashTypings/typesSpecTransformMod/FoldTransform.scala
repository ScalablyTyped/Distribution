package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.fold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var fields: (js.Array[String | TransformField]) | SignalRef
  var `type`: fold
}

object FoldTransform {
  @scala.inline
  def apply(
    fields: (js.Array[String | TransformField]) | SignalRef,
    `type`: fold,
    as: (Vector2[String | SignalRef]) | SignalRef = null
  ): FoldTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldTransform]
  }
}


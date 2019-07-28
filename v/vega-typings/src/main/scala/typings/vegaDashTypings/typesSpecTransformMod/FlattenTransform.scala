package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  var fields: (js.Array[String | TransformField]) | SignalRef
  var `type`: flatten
}

object FlattenTransform {
  @scala.inline
  def apply(
    fields: (js.Array[String | TransformField]) | SignalRef,
    `type`: flatten,
    as: (js.Array[String | SignalRef]) | SignalRef = null
  ): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenTransform]
  }
}


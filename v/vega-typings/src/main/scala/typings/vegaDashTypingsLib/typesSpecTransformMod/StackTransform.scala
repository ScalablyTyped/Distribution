package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTransform extends _Transforms {
  var as: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var field: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var groupby: js.UndefOr[js.Array[java.lang.String | TransformField]] = js.undefined
  var offset: js.UndefOr[StackOffset] = js.undefined
  var sort: js.UndefOr[vegaDashTypingsLib.typesSpecMarkMod.Compare] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.stack
}

object StackTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.stack,
    as: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    field: java.lang.String | TransformField = null,
    groupby: js.Array[java.lang.String | TransformField] = null,
    offset: StackOffset = null,
    sort: vegaDashTypingsLib.typesSpecMarkMod.Compare = null
  ): StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[StackTransform]
  }
}


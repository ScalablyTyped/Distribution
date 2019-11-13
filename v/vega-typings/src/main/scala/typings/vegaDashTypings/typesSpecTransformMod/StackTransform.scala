package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTransform extends Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var groupby: js.UndefOr[js.Array[FieldRef]] = js.undefined
  var offset: js.UndefOr[StackOffset | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: stack
}

object StackTransform {
  @scala.inline
  def apply(
    `type`: stack,
    as: (Vector2[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    groupby: js.Array[FieldRef] = null,
    offset: StackOffset | SignalRef = null,
    sort: Compare = null
  ): StackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[StackTransform]
  }
}


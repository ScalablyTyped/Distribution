package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecMarkMod.Compare
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.typesSpecUtilMod.Vector5
import typings.vegaDashTypings.vegaDashTypingsStrings.pack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackTransform extends Transforms {
  var as: js.UndefOr[(Vector5[String | SignalRef]) | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  var radius: js.UndefOr[FieldRef] = js.undefined
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  var sort: js.UndefOr[Compare] = js.undefined
  var `type`: pack
}

object PackTransform {
  @scala.inline
  def apply(
    `type`: pack,
    as: (Vector5[String | SignalRef]) | SignalRef = null,
    field: FieldRef = null,
    padding: Double | SignalRef = null,
    radius: FieldRef = null,
    size: (Vector2[Double | SignalRef]) | SignalRef = null,
    sort: Compare = null
  ): PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[PackTransform]
  }
}


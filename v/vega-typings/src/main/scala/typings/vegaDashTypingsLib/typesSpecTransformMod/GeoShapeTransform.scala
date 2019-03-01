package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoShapeTransform extends _Transforms {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String | TransformField] = js.undefined
  var pointRadius: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.typesSpecExprMod.ExprRef
  ] = js.undefined
  var projection: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geoshape
}

object GeoShapeTransform {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geoshape,
    as: java.lang.String = null,
    field: java.lang.String | TransformField = null,
    pointRadius: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.typesSpecExprMod.ExprRef = null,
    projection: java.lang.String = null
  ): GeoShapeTransform = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (as != null) __obj.updateDynamic("as")(as)
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[GeoShapeTransform]
  }
}


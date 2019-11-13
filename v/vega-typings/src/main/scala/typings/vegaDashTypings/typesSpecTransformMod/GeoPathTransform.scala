package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecExprMod.ExprRef
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.geopath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPathTransform extends Transforms {
  var as: js.UndefOr[String | SignalRef] = js.undefined
  var field: js.UndefOr[FieldRef] = js.undefined
  var pointRadius: js.UndefOr[Double | SignalRef | ExprRef] = js.undefined
  var projection: js.UndefOr[ProjectionName] = js.undefined
  var `type`: geopath
}

object GeoPathTransform {
  @scala.inline
  def apply(
    `type`: geopath,
    as: String | SignalRef = null,
    field: FieldRef = null,
    pointRadius: Double | SignalRef | ExprRef = null,
    projection: ProjectionName = null
  ): GeoPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (pointRadius != null) __obj.updateDynamic("pointRadius")(pointRadius.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[GeoPathTransform]
  }
}


package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.geopoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPointTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var fields: Vector2[FieldRef] | SignalRef
  var projection: ProjectionName
  var `type`: geopoint
}

object GeoPointTransform {
  @scala.inline
  def apply(
    fields: Vector2[FieldRef] | SignalRef,
    projection: ProjectionName,
    `type`: geopoint,
    as: (Vector2[String | SignalRef]) | SignalRef = null
  ): GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPointTransform]
  }
}


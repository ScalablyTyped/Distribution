package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.geopoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPointTransform extends _Transforms {
  var as: js.UndefOr[js.Array[String]] = js.undefined
   // projection name
  var fields: (Vector2[String | TransformField]) | SignalRef
  var projection: String
  var `type`: geopoint
}

object GeoPointTransform {
  @scala.inline
  def apply(
    fields: (Vector2[String | TransformField]) | SignalRef,
    projection: String,
    `type`: geopoint,
    as: js.Array[String] = null
  ): GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection)
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[GeoPointTransform]
  }
}


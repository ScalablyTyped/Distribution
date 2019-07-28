package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONTransform extends _Transforms {
  var fields: js.UndefOr[(Vector2[String | TransformField]) | SignalRef] = js.undefined
  var geojson: js.UndefOr[TransformField] = js.undefined
  var signal: String
  var `type`: geojson
}

object GeoJSONTransform {
  @scala.inline
  def apply(
    signal: String,
    `type`: geojson,
    fields: (Vector2[String | TransformField]) | SignalRef = null,
    geojson: TransformField = null
  ): GeoJSONTransform = {
    val __obj = js.Dynamic.literal(signal = signal)
    __obj.updateDynamic("type")(`type`)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson)
    __obj.asInstanceOf[GeoJSONTransform]
  }
}


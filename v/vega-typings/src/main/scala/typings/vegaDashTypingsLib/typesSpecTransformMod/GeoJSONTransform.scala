package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONTransform extends _Transforms {
  var fields: js.UndefOr[
    (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  ] = js.undefined
  var geojson: js.UndefOr[TransformField] = js.undefined
  var signal: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geojson
}

object GeoJSONTransform {
  @scala.inline
  def apply(
    signal: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geojson,
    fields: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    geojson: TransformField = null
  ): GeoJSONTransform = {
    val __obj = js.Dynamic.literal(signal = signal)
    __obj.updateDynamic("type")(`type`)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson)
    __obj.asInstanceOf[GeoJSONTransform]
  }
}


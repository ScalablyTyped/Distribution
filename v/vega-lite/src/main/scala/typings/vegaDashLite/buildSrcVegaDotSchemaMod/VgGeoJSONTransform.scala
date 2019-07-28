package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgGeoJSONTransform extends VgTransform {
  var fields: js.UndefOr[js.Array[VgFieldRef]] = js.undefined
  var geojson: js.UndefOr[VgFieldRef] = js.undefined
  var signal: String
  var `type`: geojson
}

object VgGeoJSONTransform {
  @scala.inline
  def apply(signal: String, `type`: geojson, fields: js.Array[VgFieldRef] = null, geojson: VgFieldRef = null): VgGeoJSONTransform = {
    val __obj = js.Dynamic.literal(signal = signal)
    __obj.updateDynamic("type")(`type`)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (geojson != null) __obj.updateDynamic("geojson")(geojson.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgGeoJSONTransform]
  }
}


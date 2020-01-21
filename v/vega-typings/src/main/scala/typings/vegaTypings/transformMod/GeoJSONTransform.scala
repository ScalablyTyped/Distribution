package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.geojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONTransform extends _Transforms {
  var fields: js.UndefOr[Vector2[FieldRef] | SignalRef] = js.undefined
  var geojson: js.UndefOr[FieldRef] = js.undefined
  var signal: js.UndefOr[SignalName] = js.undefined
  var `type`: geojson
}

object GeoJSONTransform {
  @scala.inline
  def apply(
    `type`: geojson,
    fields: Vector2[FieldRef] | SignalRef = null,
    geojson: FieldRef = null,
    signal: SignalName = null
  ): GeoJSONTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (geojson != null) __obj.updateDynamic("geojson")(geojson.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONTransform]
  }
}


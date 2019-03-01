package typings
package viewportDashMercatorDashProjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceScales extends js.Object {
  var distanceScales: js.UndefOr[
    viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.DistanceScales
  ] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var meterOffset: js.UndefOr[scala.Double] = js.undefined
  var scale: scala.Double
  var zoom: scala.Double
}

object Anon_DistanceScales {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    scale: scala.Double,
    zoom: scala.Double,
    distanceScales: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.DistanceScales = null,
    meterOffset: scala.Int | scala.Double = null
  ): Anon_DistanceScales = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("zoom")(zoom)
    if (distanceScales != null) __obj.updateDynamic("distanceScales")(distanceScales)
    if (meterOffset != null) __obj.updateDynamic("meterOffset")(meterOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DistanceScales]
  }
}


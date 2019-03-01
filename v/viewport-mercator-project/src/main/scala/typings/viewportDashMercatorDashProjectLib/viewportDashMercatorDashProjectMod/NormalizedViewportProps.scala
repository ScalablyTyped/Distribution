package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedViewportProps extends BaseViewportProps {
  var bearing: scala.Double
  var pitch: scala.Double
}

object NormalizedViewportProps {
  @scala.inline
  def apply(
    bearing: scala.Double,
    height: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    pitch: scala.Double,
    width: scala.Double,
    zoom: scala.Double
  ): NormalizedViewportProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bearing")(bearing)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("pitch")(pitch)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[NormalizedViewportProps]
  }
}


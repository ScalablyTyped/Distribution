package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProps extends BaseViewportProps {
  var bearing: js.UndefOr[scala.Double] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
}

object ViewportProps {
  @scala.inline
  def apply(
    height: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    width: scala.Double,
    zoom: scala.Double,
    bearing: scala.Int | scala.Double = null,
    pitch: scala.Int | scala.Double = null
  ): ViewportProps = {
    val __obj = js.Dynamic.literal(height = height, latitude = latitude, longitude = longitude, width = width, zoom = zoom)
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProps]
  }
}


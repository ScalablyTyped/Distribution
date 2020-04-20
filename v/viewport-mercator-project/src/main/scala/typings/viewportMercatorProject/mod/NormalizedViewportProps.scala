package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedViewportProps extends FlyToViewportProps {
  var bearing: Double
  var pitch: Double
}

object NormalizedViewportProps {
  @scala.inline
  def apply(
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    pitch: Double,
    width: Double,
    zoom: Double
  ): NormalizedViewportProps = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedViewportProps]
  }
}


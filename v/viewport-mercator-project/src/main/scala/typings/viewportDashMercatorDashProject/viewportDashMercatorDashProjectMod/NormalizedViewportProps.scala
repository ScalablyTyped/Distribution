package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

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
    val __obj = js.Dynamic.literal(bearing = bearing, height = height, latitude = latitude, longitude = longitude, pitch = pitch, width = width, zoom = zoom)
  
    __obj.asInstanceOf[NormalizedViewportProps]
  }
}


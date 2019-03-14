package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToViewportProps extends TransitionViewport {
  var height: scala.Double
  var width: scala.Double
}

object FlyToViewportProps {
  @scala.inline
  def apply(
    height: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    width: scala.Double,
    zoom: scala.Double
  ): FlyToViewportProps = {
    val __obj = js.Dynamic.literal(height = height, latitude = latitude, longitude = longitude, width = width, zoom = zoom)
  
    __obj.asInstanceOf[FlyToViewportProps]
  }
}


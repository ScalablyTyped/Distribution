package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyToViewportProps extends TransitionViewport {
  var height: Double
  var width: Double
}

object FlyToViewportProps {
  @scala.inline
  def apply(height: Double, latitude: Double, longitude: Double, width: Double, zoom: Double): FlyToViewportProps = {
    val __obj = js.Dynamic.literal(height = height, latitude = latitude, longitude = longitude, width = width, zoom = zoom)
  
    __obj.asInstanceOf[FlyToViewportProps]
  }
}


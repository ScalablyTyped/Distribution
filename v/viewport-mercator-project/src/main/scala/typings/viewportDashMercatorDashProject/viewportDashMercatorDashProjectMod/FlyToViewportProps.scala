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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlyToViewportProps]
  }
}


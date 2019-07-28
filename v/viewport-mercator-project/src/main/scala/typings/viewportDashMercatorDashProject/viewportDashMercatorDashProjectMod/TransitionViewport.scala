package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionViewport extends js.Object {
  var latitude: Double
  var longitude: Double
  var zoom: Double
}

object TransitionViewport {
  @scala.inline
  def apply(latitude: Double, longitude: Double, zoom: Double): TransitionViewport = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, zoom = zoom)
  
    __obj.asInstanceOf[TransitionViewport]
  }
}


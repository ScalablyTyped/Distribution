package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionViewport extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
  var zoom: scala.Double
}

object TransitionViewport {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double, zoom: scala.Double): TransitionViewport = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, zoom = zoom)
  
    __obj.asInstanceOf[TransitionViewport]
  }
}


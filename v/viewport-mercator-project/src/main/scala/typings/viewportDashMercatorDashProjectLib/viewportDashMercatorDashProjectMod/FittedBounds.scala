package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FittedBounds extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
  var zoom: scala.Double
}

object FittedBounds {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double, zoom: scala.Double): FittedBounds = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, zoom = zoom)
  
    __obj.asInstanceOf[FittedBounds]
  }
}


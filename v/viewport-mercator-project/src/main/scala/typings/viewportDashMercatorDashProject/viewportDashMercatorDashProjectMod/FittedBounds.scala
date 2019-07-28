package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FittedBounds extends js.Object {
  var latitude: Double
  var longitude: Double
  var zoom: Double
}

object FittedBounds {
  @scala.inline
  def apply(latitude: Double, longitude: Double, zoom: Double): FittedBounds = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, zoom = zoom)
  
    __obj.asInstanceOf[FittedBounds]
  }
}


package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.DistanceScalesInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  zoom  :number} */
trait BaseDistanceScalesInputzo extends DistanceScalesInput {
  var latitude: Double
  var longitude: Double
  var zoom: Double
}

object BaseDistanceScalesInputzo {
  @scala.inline
  def apply(latitude: Double, longitude: Double, zoom: Double): BaseDistanceScalesInputzo = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDistanceScalesInputzo]
  }
}


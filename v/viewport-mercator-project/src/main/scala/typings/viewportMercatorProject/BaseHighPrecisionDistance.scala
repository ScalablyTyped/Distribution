package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  zoom  :number} */
trait BaseHighPrecisionDistance extends HighPrecisionDistanceScalesInput {
  var highPrecision: `true`
  var latitude: Double
  var longitude: Double
  var zoom: Double
}

object BaseHighPrecisionDistance {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double, zoom: Double): BaseHighPrecisionDistance = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseHighPrecisionDistance]
  }
}


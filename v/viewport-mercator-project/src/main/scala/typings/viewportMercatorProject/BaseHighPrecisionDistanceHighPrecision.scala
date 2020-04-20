package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  scale  :number} */
trait BaseHighPrecisionDistanceHighPrecision extends HighPrecisionDistanceScalesInput {
  var highPrecision: `true`
  var latitude: Double
  var longitude: Double
  var scale: Double
}

object BaseHighPrecisionDistanceHighPrecision {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): BaseHighPrecisionDistanceHighPrecision = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHighPrecisionDistanceHighPrecision]
  }
}


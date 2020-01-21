package typings.viewportMercatorProject.mod

import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHighPrecisionDistanceScalesInput extends BaseDistanceScalesInput {
  var highPrecision: `true`
}

object BaseHighPrecisionDistanceScalesInput {
  @scala.inline
  def apply(highPrecision: `true`, latitude: Double, longitude: Double): BaseHighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseHighPrecisionDistanceScalesInput]
  }
}


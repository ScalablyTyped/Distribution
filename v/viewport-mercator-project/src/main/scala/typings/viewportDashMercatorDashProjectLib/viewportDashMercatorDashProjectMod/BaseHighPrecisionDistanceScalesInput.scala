package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHighPrecisionDistanceScalesInput extends BaseDistanceScalesInput {
  var highPrecision: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectLibNumbers.`true`
}

object BaseHighPrecisionDistanceScalesInput {
  @scala.inline
  def apply(
    highPrecision: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectLibNumbers.`true`,
    latitude: scala.Double,
    longitude: scala.Double
  ): BaseHighPrecisionDistanceScalesInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("highPrecision")(highPrecision)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[BaseHighPrecisionDistanceScalesInput]
  }
}


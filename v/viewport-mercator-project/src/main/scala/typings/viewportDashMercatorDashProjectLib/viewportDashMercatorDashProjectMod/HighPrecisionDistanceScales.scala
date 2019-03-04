package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighPrecisionDistanceScales extends DistanceScales {
  var pixelsPerDegree2: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var pixelsPerMeter2: js.Tuple3[scala.Double, scala.Double, scala.Double]
}

object HighPrecisionDistanceScales {
  @scala.inline
  def apply(
    degreesPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double],
    metersPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerDegree: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerDegree2: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerMeter: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerMeter2: js.Tuple3[scala.Double, scala.Double, scala.Double]
  ): HighPrecisionDistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel, metersPerPixel = metersPerPixel, pixelsPerDegree = pixelsPerDegree, pixelsPerDegree2 = pixelsPerDegree2, pixelsPerMeter = pixelsPerMeter, pixelsPerMeter2 = pixelsPerMeter2)
  
    __obj.asInstanceOf[HighPrecisionDistanceScales]
  }
}


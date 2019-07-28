package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighPrecisionDistanceScales extends DistanceScales {
  var pixelsPerDegree2: js.Tuple3[Double, Double, Double]
  var pixelsPerMeter2: js.Tuple3[Double, Double, Double]
}

object HighPrecisionDistanceScales {
  @scala.inline
  def apply(
    degreesPerPixel: js.Tuple3[Double, Double, Double],
    metersPerPixel: js.Tuple3[Double, Double, Double],
    pixelsPerDegree: js.Tuple3[Double, Double, Double],
    pixelsPerDegree2: js.Tuple3[Double, Double, Double],
    pixelsPerMeter: js.Tuple3[Double, Double, Double],
    pixelsPerMeter2: js.Tuple3[Double, Double, Double]
  ): HighPrecisionDistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel, metersPerPixel = metersPerPixel, pixelsPerDegree = pixelsPerDegree, pixelsPerDegree2 = pixelsPerDegree2, pixelsPerMeter = pixelsPerMeter, pixelsPerMeter2 = pixelsPerMeter2)
  
    __obj.asInstanceOf[HighPrecisionDistanceScales]
  }
}


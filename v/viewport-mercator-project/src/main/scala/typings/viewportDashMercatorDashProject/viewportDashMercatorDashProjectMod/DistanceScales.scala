package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceScales extends js.Object {
  var degreesPerPixel: js.Tuple3[Double, Double, Double]
  var metersPerPixel: js.Tuple3[Double, Double, Double]
  var pixelsPerDegree: js.Tuple3[Double, Double, Double]
  var pixelsPerMeter: js.Tuple3[Double, Double, Double]
}

object DistanceScales {
  @scala.inline
  def apply(
    degreesPerPixel: js.Tuple3[Double, Double, Double],
    metersPerPixel: js.Tuple3[Double, Double, Double],
    pixelsPerDegree: js.Tuple3[Double, Double, Double],
    pixelsPerMeter: js.Tuple3[Double, Double, Double]
  ): DistanceScales = {
    val __obj = js.Dynamic.literal(degreesPerPixel = degreesPerPixel.asInstanceOf[js.Any], metersPerPixel = metersPerPixel.asInstanceOf[js.Any], pixelsPerDegree = pixelsPerDegree.asInstanceOf[js.Any], pixelsPerMeter = pixelsPerMeter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistanceScales]
  }
}


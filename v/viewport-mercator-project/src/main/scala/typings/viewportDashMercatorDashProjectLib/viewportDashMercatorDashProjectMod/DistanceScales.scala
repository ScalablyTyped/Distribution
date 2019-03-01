package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceScales extends js.Object {
  var degreesPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var metersPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var pixelsPerDegree: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var pixelsPerMeter: js.Tuple3[scala.Double, scala.Double, scala.Double]
}

object DistanceScales {
  @scala.inline
  def apply(
    degreesPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double],
    metersPerPixel: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerDegree: js.Tuple3[scala.Double, scala.Double, scala.Double],
    pixelsPerMeter: js.Tuple3[scala.Double, scala.Double, scala.Double]
  ): DistanceScales = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degreesPerPixel")(degreesPerPixel)
    __obj.updateDynamic("metersPerPixel")(metersPerPixel)
    __obj.updateDynamic("pixelsPerDegree")(pixelsPerDegree)
    __obj.updateDynamic("pixelsPerMeter")(pixelsPerMeter)
    __obj.asInstanceOf[DistanceScales]
  }
}


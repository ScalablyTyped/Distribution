package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceScales extends js.Object {
  var degreesPerPixel: js.Tuple3[Double, Double, Double] = js.native
  var metersPerPixel: js.Tuple3[Double, Double, Double] = js.native
  var pixelsPerDegree: js.Tuple3[Double, Double, Double] = js.native
  var pixelsPerMeter: js.Tuple3[Double, Double, Double] = js.native
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
  @scala.inline
  implicit class DistanceScalesOps[Self <: DistanceScales] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDegreesPerPixel(value: js.Tuple3[Double, Double, Double]): Self = this.set("degreesPerPixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetersPerPixel(value: js.Tuple3[Double, Double, Double]): Self = this.set("metersPerPixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsPerDegree(value: js.Tuple3[Double, Double, Double]): Self = this.set("pixelsPerDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsPerMeter(value: js.Tuple3[Double, Double, Double]): Self = this.set("pixelsPerMeter", value.asInstanceOf[js.Any])
  }
  
}


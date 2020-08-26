package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhiStart extends js.Object {
  var heightSegments: Double = js.native
  var phiLength: Double = js.native
  var phiStart: Double = js.native
  var radius: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
  var widthSegments: Double = js.native
}

object PhiStart {
  @scala.inline
  def apply(
    heightSegments: Double,
    phiLength: Double,
    phiStart: Double,
    radius: Double,
    thetaLength: Double,
    thetaStart: Double,
    widthSegments: Double
  ): PhiStart = {
    val __obj = js.Dynamic.literal(heightSegments = heightSegments.asInstanceOf[js.Any], phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhiStart]
  }
  @scala.inline
  implicit class PhiStartOps[Self <: PhiStart] (val x: Self) extends AnyVal {
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
    def setHeightSegments(value: Double): Self = this.set("heightSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhiLength(value: Double): Self = this.set("phiLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhiStart(value: Double): Self = this.set("phiStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaLength(value: Double): Self = this.set("thetaLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaStart(value: Double): Self = this.set("thetaStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthSegments(value: Double): Self = this.set("widthSegments", value.asInstanceOf[js.Any])
  }
  
}


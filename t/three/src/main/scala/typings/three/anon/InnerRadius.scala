package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerRadius extends js.Object {
  var innerRadius: Double = js.native
  var outerRadius: Double = js.native
  var phiSegments: Double = js.native
  var thetaLength: Double = js.native
  var thetaSegments: Double = js.native
  var thetaStart: Double = js.native
}

object InnerRadius {
  @scala.inline
  def apply(
    innerRadius: Double,
    outerRadius: Double,
    phiSegments: Double,
    thetaLength: Double,
    thetaSegments: Double,
    thetaStart: Double
  ): InnerRadius = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], phiSegments = phiSegments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaSegments = thetaSegments.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRadius]
  }
  @scala.inline
  implicit class InnerRadiusOps[Self <: InnerRadius] (val x: Self) extends AnyVal {
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
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhiSegments(value: Double): Self = this.set("phiSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaLength(value: Double): Self = this.set("thetaLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaSegments(value: Double): Self = this.set("thetaSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaStart(value: Double): Self = this.set("thetaStart", value.asInstanceOf[js.Any])
  }
  
}


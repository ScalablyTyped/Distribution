package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightSegments extends js.Object {
  var height: Double = js.native
  var heightSegments: Double = js.native
  var openEnded: Boolean = js.native
  var radialSegments: Double = js.native
  var radiusBottom: Double = js.native
  var radiusTop: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
}

object HeightSegments {
  @scala.inline
  def apply(
    height: Double,
    heightSegments: Double,
    openEnded: Boolean,
    radialSegments: Double,
    radiusBottom: Double,
    radiusTop: Double,
    thetaLength: Double,
    thetaStart: Double
  ): HeightSegments = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], openEnded = openEnded.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radiusBottom = radiusBottom.asInstanceOf[js.Any], radiusTop = radiusTop.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSegments]
  }
  @scala.inline
  implicit class HeightSegmentsOps[Self <: HeightSegments] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightSegments(value: Double): Self = this.set("heightSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenEnded(value: Boolean): Self = this.set("openEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadialSegments(value: Double): Self = this.set("radialSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusBottom(value: Double): Self = this.set("radiusBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusTop(value: Double): Self = this.set("radiusTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaLength(value: Double): Self = this.set("thetaLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaStart(value: Double): Self = this.set("thetaStart", value.asInstanceOf[js.Any])
  }
  
}


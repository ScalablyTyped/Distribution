package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radius extends js.Object {
  var radius: Double = js.native
  var segments: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
}

object Radius {
  @scala.inline
  def apply(radius: Double, segments: Double, thetaLength: Double, thetaStart: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  @scala.inline
  implicit class RadiusOps[Self <: Radius] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaLength(value: Double): Self = this.set("thetaLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setThetaStart(value: Double): Self = this.set("thetaStart", value.asInstanceOf[js.Any])
  }
  
}


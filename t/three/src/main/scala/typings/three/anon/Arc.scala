package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends js.Object {
  var arc: Double = js.native
  var radialSegments: Double = js.native
  var radius: Double = js.native
  var tube: Double = js.native
  var tubularSegments: Double = js.native
}

object Arc {
  @scala.inline
  def apply(arc: Double, radialSegments: Double, radius: Double, tube: Double, tubularSegments: Double): Arc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any], tubularSegments = tubularSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  @scala.inline
  implicit class ArcOps[Self <: Arc] (val x: Self) extends AnyVal {
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
    def setArc(value: Double): Self = this.set("arc", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadialSegments(value: Double): Self = this.set("radialSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setTube(value: Double): Self = this.set("tube", value.asInstanceOf[js.Any])
    @scala.inline
    def setTubularSegments(value: Double): Self = this.set("tubularSegments", value.asInstanceOf[js.Any])
  }
  
}


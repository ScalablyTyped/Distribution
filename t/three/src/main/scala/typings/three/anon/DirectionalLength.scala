package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionalLength extends js.Object {
  var directionalLength: Double = js.native
  var hemiLength: Double = js.native
  var numDirectionalShadows: Double = js.native
  var numPointShadows: Double = js.native
  var numSpotShadows: Double = js.native
  var pointLength: Double = js.native
  var rectAreaLength: Double = js.native
  var spotLength: Double = js.native
}

object DirectionalLength {
  @scala.inline
  def apply(
    directionalLength: Double,
    hemiLength: Double,
    numDirectionalShadows: Double,
    numPointShadows: Double,
    numSpotShadows: Double,
    pointLength: Double,
    rectAreaLength: Double,
    spotLength: Double
  ): DirectionalLength = {
    val __obj = js.Dynamic.literal(directionalLength = directionalLength.asInstanceOf[js.Any], hemiLength = hemiLength.asInstanceOf[js.Any], numDirectionalShadows = numDirectionalShadows.asInstanceOf[js.Any], numPointShadows = numPointShadows.asInstanceOf[js.Any], numSpotShadows = numSpotShadows.asInstanceOf[js.Any], pointLength = pointLength.asInstanceOf[js.Any], rectAreaLength = rectAreaLength.asInstanceOf[js.Any], spotLength = spotLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalLength]
  }
  @scala.inline
  implicit class DirectionalLengthOps[Self <: DirectionalLength] (val x: Self) extends AnyVal {
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
    def setDirectionalLength(value: Double): Self = this.set("directionalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setHemiLength(value: Double): Self = this.set("hemiLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumDirectionalShadows(value: Double): Self = this.set("numDirectionalShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPointShadows(value: Double): Self = this.set("numPointShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumSpotShadows(value: Double): Self = this.set("numSpotShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointLength(value: Double): Self = this.set("pointLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectAreaLength(value: Double): Self = this.set("rectAreaLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotLength(value: Double): Self = this.set("spotLength", value.asInstanceOf[js.Any])
  }
  
}


package typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionParameters extends js.Object {
  var aspect: Double
  var far: Double
  var focalDistance: Double
  var fov: Double
  var near: Double
}

object ProjectionParameters {
  @scala.inline
  def apply(aspect: Double, far: Double, focalDistance: Double, fov: Double, near: Double): ProjectionParameters = {
    val __obj = js.Dynamic.literal(aspect = aspect, far = far, focalDistance = focalDistance, fov = fov, near = near)
  
    __obj.asInstanceOf[ProjectionParameters]
  }
}


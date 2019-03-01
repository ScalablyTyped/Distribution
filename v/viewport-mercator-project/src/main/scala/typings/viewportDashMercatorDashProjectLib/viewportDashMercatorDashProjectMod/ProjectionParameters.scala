package typings
package viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionParameters extends js.Object {
  var aspect: scala.Double
  var far: scala.Double
  var focalDistance: scala.Double
  var fov: scala.Double
  var near: scala.Double
}

object ProjectionParameters {
  @scala.inline
  def apply(
    aspect: scala.Double,
    far: scala.Double,
    focalDistance: scala.Double,
    fov: scala.Double,
    near: scala.Double
  ): ProjectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspect")(aspect)
    __obj.updateDynamic("far")(far)
    __obj.updateDynamic("focalDistance")(focalDistance)
    __obj.updateDynamic("fov")(fov)
    __obj.updateDynamic("near")(near)
    __obj.asInstanceOf[ProjectionParameters]
  }
}


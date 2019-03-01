package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplineControlPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object SplineControlPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): SplineControlPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[SplineControlPoint]
  }
}


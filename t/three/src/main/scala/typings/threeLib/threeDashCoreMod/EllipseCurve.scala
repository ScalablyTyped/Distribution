package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "EllipseCurve")
@js.native
class EllipseCurve protected () extends Curve[Vector2] {
  def this(aX: scala.Double, aY: scala.Double, xRadius: scala.Double, yRadius: scala.Double, aStartAngle: scala.Double, aEndAngle: scala.Double, aClockwise: scala.Boolean, aRotation: scala.Double) = this()
  var aClockwise: scala.Boolean = js.native
  var aEndAngle: scala.Double = js.native
  var aRotation: scala.Double = js.native
  var aStartAngle: scala.Double = js.native
  var aX: scala.Double = js.native
  var aY: scala.Double = js.native
  var xRadius: scala.Double = js.native
  var yRadius: scala.Double = js.native
}


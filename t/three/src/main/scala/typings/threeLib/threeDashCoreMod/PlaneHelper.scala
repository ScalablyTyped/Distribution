package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "PlaneHelper")
@js.native
class PlaneHelper protected () extends LineSegments {
  def this(plane: Plane) = this()
  def this(plane: Plane, size: scala.Double) = this()
  def this(plane: Plane, size: scala.Double, hex: scala.Double) = this()
  var plane: Plane = js.native
  var size: scala.Double = js.native
}


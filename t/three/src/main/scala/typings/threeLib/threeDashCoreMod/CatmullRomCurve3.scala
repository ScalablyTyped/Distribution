package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "CatmullRomCurve3")
@js.native
class CatmullRomCurve3 () extends Curve[Vector3] {
  def this(points: js.Array[Vector3]) = this()
  def this(points: js.Array[Vector3], closed: scala.Boolean) = this()
  def this(points: js.Array[Vector3], closed: scala.Boolean, curveType: java.lang.String) = this()
  def this(points: js.Array[Vector3], closed: scala.Boolean, curveType: java.lang.String, tension: scala.Double) = this()
  var points: js.Array[Vector3] = js.native
}


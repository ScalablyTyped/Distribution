package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "SplineCurve")
@js.native
class SplineCurve () extends Curve[Vector2] {
  def this(points: js.Array[Vector2]) = this()
  var points: js.Array[Vector2] = js.native
}


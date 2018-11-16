package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LineCurve")
@js.native
class LineCurve protected () extends Curve[Vector2] {
  def this(v1: Vector2, v2: Vector2) = this()
  var v1: Vector2 = js.native
  var v2: Vector2 = js.native
}


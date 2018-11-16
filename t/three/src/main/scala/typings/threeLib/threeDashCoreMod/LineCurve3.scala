package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "LineCurve3")
@js.native
class LineCurve3 protected () extends Curve[Vector3] {
  def this(v1: Vector3, v2: Vector3) = this()
  var v1: Vector3 = js.native
  var v2: Vector3 = js.native
}


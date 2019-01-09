package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "TubeGeometry")
@js.native
class TubeGeometry protected () extends Geometry {
  def this(path: Curve[Vector3]) = this()
  def this(path: Curve[Vector3], tubularSegments: scala.Double) = this()
  def this(path: Curve[Vector3], tubularSegments: scala.Double, radius: scala.Double) = this()
  def this(path: Curve[Vector3], tubularSegments: scala.Double, radius: scala.Double, radiusSegments: scala.Double) = this()
  def this(path: Curve[Vector3], tubularSegments: scala.Double, radius: scala.Double, radiusSegments: scala.Double, closed: scala.Boolean) = this()
  var binormals: js.Array[Vector3] = js.native
  var normals: js.Array[Vector3] = js.native
  var parameters: threeLib.Anon_Closed = js.native
  var tangents: js.Array[Vector3] = js.native
}

